package package_login;


import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_functionality {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		String url;
		try {
			
			// counting no. of rows of Input data sheet  
			Workbook login = Workbook.getWorkbook(new File(System.getProperty("user.dir") + "\\Testdata\\KeurigLogin.xls"));
			Sheet loginsheet = login.getSheet(0);
			int rowcount = loginsheet.getRows();
			System.out.println("rowcount is = "+ rowcount);
			
			File src =   new File("D:\\Book.xls");
			
			WritableWorkbook wb=Workbook.createWorkbook(src);
			wb.createSheet("Final",0);
			WritableSheet wsheet=wb.getSheet(0);
			
			Label data1=new Label(0,0,"Result"); 
			wsheet.addCell(data1);
			
			ArrayList<String> arrayList = new ArrayList<String>();
			
			for (int i = 1; i <rowcount; i++) {
				
				// launching chrome driver
				
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\neeraj.sharma27\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
				url = "http://tvmatp324126d:8081/KeurigPortalDev/login.jsp";
				driver.get(url);
				
				// taking data from Excel sheet and try logging in
				driver.findElement(By.name("email")).clear();
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("email")).sendKeys(loginsheet.getCell(0, i).getContents());
				driver.findElement(By.name("password")).sendKeys(loginsheet.getCell(1, i).getContents());
				Thread.sleep(2000);
				driver.findElement(By.id("mybutton")).click();
				
				// after login new tab opens so we should use window handler method to move control to new tab
				String tab2 = driver.getWindowHandle();
				driver.switchTo().window(tab2);
				
				
				
				
			 
		Thread.sleep(3000);
			WebElement ele=driver.findElement(By.xpath("html/body/h1"));

			 String  test_title=ele.getText();
			 
				
				
				
				if (test_title.equalsIgnoreCase("Welcome to Home Page")) {
					
					arrayList.add("pass");
					
				
				}else{	
					arrayList.add("fail");
				}
				
				driver.close();
			
			}
			
		System.out.println(arrayList.size());
		
		for(int i=0;i<arrayList.size();i++){
			Label data=new Label(0,i+1,arrayList.get(i));
			wsheet.addCell(data);
		}
		wb.write();
		wb.close();
		
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("login unsuccessful");
			
			
		}
		

	}


}
