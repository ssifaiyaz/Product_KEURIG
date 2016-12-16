package Keurig_1;
//----------------------------------------------------------------------------------------//
import java.io.File;
//import java.io.FileInputStream;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

//----------------------------------------------------------------------------------------//
public class Keurig {
public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
String url="http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";	
System.setProperty("webdriver.chrome.driver","D://browser//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
Thread.sleep(1000);
//--------------------------------------------------------//

Workbook wbook=Workbook.getWorkbook(new File("Keurig.xls"));
Sheet wsheet=wbook.getSheet("Sheet1");
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



