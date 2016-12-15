package package_login;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {

	public static void main(String[] args) {

		WebDriver driver;
		String url;
		try {
			Workbook login = Workbook.getWorkbook(new File(System.getProperty("user.dir") + "\\Testdata\\KeurigLogin.xls"));
			Sheet loginsheet = login.getSheet(0);
			int rowcount = loginsheet.getRows();
			System.out.println(rowcount);
			WritableWorkbook workbuk_copy = Workbook.createWorkbook(new File("D:\\NewXLFile.xls"), login);
			WritableSheet wsheet_old = workbuk_copy.createSheet("Login", 1);
			
			for (int i = 1; i < rowcount; i++) {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\neeraj.sharma27\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
				url = "http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";
				driver.get(url);
				driver.findElement(By.name("email")).clear();
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("email")).sendKeys(loginsheet.getCell(0, i).getContents());
				driver.findElement(By.name("password")).sendKeys(loginsheet.getCell(1, i).getContents());
				Thread.sleep(2000);
				driver.findElement(By.id("mybutton")).click();
				String tab2 = driver.getWindowHandle();
				driver.switchTo().window(tab2);

				// WritableSheet
				// wsheet_new=workbuk_copy.getSheet("logincopy.xls");
				// Label lable=new Label(2,i,"login successful");
				wsheet_old = workbuk_copy.getSheet(0);
				WritableCell c=(WritableCell)new Label(2,i,"Pass");
				//Label lable = new Label(2,i,"Pass");
				System.out.println("i Value="+i);
				wsheet_old.addCell(c);
				
				
				System.out.println("222222222222");
				workbuk_copy.write();
				
				driver.close();

			}
			workbuk_copy.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


}
