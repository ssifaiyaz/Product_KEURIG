package Keurig_1;
//----------------------------------------------------------------------------------------//
import java.io.File;
//import java.io.FileInputStream;
//import java.util.concurrent.TimeUnit;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;





import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

//----------------------------------------------------------------------------------------//
public class Keurig {
@Test
public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
WritableWorkbook writable_workbook = null;
FileInputStream file_input_stream = null;
String url="http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";	


//--------------------------------------------------------//

file_input_stream = new FileInputStream("C://Users//megha.goyal07//Desktop//Keurig.xls");
Workbook wbook=Workbook.getWorkbook(new File("Keurig.xls"));
Sheet wsheet=wbook.getSheet("Sheet1");
//--------------------------------------------------------//
writable_workbook = Workbook.createWorkbook(new File("C://Users//megha.goyal07//Desktop//Keurig.xls"),wbook);
WritableSheet writable_sheet = writable_workbook.getSheet("Keurig.xls");
String strData = "Pass";
System.setProperty("webdriver.chrome.driver","D://browser//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
Thread.sleep(1000);
int ront=wsheet.getRows();
int i=wsheet.getRows();
for(i=1;i<ront;i++)
{
driver.findElement(By.name("email")).sendKeys(wsheet.getCell(0,i).getContents());
driver.findElement(By.name("password")).sendKeys(wsheet.getCell(1,i).getContents());
driver.findElement(By.id("mybutton")).click();
driver.get(url);
}


  }
    }



