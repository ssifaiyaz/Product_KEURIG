package HomePage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;


public class OrganisationaChart {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.manage().deleteAllCookies();
	        String url="http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";
	        driver.get(url);
	        driver.manage().window().maximize();
	        // TODO Auto-generated method stub
	        driver.findElement(By.name("email")).sendKeys("harini.p@infy.com");
	        driver.findElement(By.name("password")).sendKeys("112");
	        driver.findElement(By.id("mybutton")).click();
	        String OrgC=driver.findElement(By.xpath("/html/body/h1")).getText();
	        if(OrgC.equals("Welcome to Home Page")){
	        	try{
	        		System.out.println("Pass");
	        		 FileInputStream file = new FileInputStream(new File("User_story_02.xlsx")); 
					  XSSFWorkbook workbook = new XSSFWorkbook(file);
					 
					  XSSFSheet sheet = workbook.getSheetAt(0);
					   
					  XSSFCell searchText3 = sheet.createRow(0).createCell(0);
					  searchText3.setCellValue("Test Search Keyword");
					 
					  file.close();
					 
					  
					  FileOutputStream outFile =new FileOutputStream("User_story_02-result.xlsx");
					  workbook.write(outFile);
					  outFile.close();
					  System.out.println("writing");
	        	}catch(Exception e)
	            {

	            }
	               	
	        }
	        else{
	        	try{
	        		System.out.println("Fail");
	        		FileInputStream file = new FileInputStream(new File("D:\\Accelerate_IV\\TestReport.xlsx")); 
					  XSSFWorkbook workbook = new XSSFWorkbook(file);
					  XSSFSheet sheet = workbook.getSheetAt(0);
					  XSSFCell searchText3 = sheet.createRow(0).createCell(0);
					  searchText3.setCellValue("Fail");
					  file.close();
					  FileOutputStream outFile =new FileOutputStream(new File("D:\\Accelerate_IV\\TestReport-result.xlsx"));
					  workbook.write(outFile);
					  outFile.close();
	        	}catch(Exception e)
	            {

	            }
	        	
	        }
	}

}
