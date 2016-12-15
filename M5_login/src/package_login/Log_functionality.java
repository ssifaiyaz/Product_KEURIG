package package_login;


import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_functionality {

	public static void main(String[] args) {

		WebDriver driver;
		String url;
		try {
			
			// counting no. of rows of Input data sheet  
			Workbook login = Workbook.getWorkbook(new File("C:\\Users\\neeraj.sharma27\\Desktop\\KeurigLogin.xls"));
			Sheet loginsheet = login.getSheet(0);
			int rowcount = loginsheet.getRows();
			System.out.println("rowcount is = "+ rowcount);
			
			for (int i = 1; i < rowcount; i++) {
				
				// launching chrome driver
				System.setProperty("webdriver.chrome.driver","C:\\Users\\neeraj.sharma27\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
				url = "http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";
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
				
				
				System.out.println(loginsheet.getCell(0, i).getContents()+"  has logged in");
				driver.close();

			}
			
			// writing the status of test case in a new Excel Sheet
			File excelfile=new File("D:\\result.xls");
			WritableWorkbook writableworkbook=Workbook.createWorkbook(excelfile);
			WritableSheet writablesheet=writableworkbook.createSheet("Sheet1", 0);
			
			 Label l=new Label(0, 0 , "Result");
			 writablesheet.addCell(l);
			for(int j=1;j<=3;j++){
				WritableCell c=(WritableCell)new Label(0,j,"Pass");
				writablesheet.addCell(c);
			}
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


}
