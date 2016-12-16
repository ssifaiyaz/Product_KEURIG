package keurig_pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import pac_login.LoginClass;


public class Keurig_Class extends LoginClass {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//To Open the portal and login to Homepage
	      LoginClass.Login_function();
		//To check for the widgets title in the home page	
		
		try {
			FileInputStream file = new FileInputStream(new File("Book.xlsx")); 
			  XSSFWorkbook workbook = new XSSFWorkbook(file);			 
			  XSSFSheet sheet = workbook.getSheetAt(0);			   
			  XSSFCell c = sheet.createRow(0).createCell(0);
			  c.setCellValue("User Story");
			  XSSFCell c1 = sheet.getRow(0).createCell(1);
			  c1.setCellValue("STATUS");
			  
			  
			//To get the title for Types of testing  Widget
				String  test_title= driver.findElement(By.xpath("/html/body/h1")).getText();
				XSSFSheet sheet1 = workbook.getSheetAt(0);	
				XSSFCell c2 = sheet1.createRow(1).createCell(0);
				c2.setCellValue("Types of Testing");
				
				if (test_title.equalsIgnoreCase("Welcome to Home Page")) {
					System.out.println("sucess");	
					XSSFCell c3 = sheet1.getRow(1).createCell(1);
					c3.setCellValue("Pass");
				}else{	
					XSSFCell c3 = sheet1.getRow(1).createCell(1);
					c3.setCellValue("Fail");
				}
			  
				//To get the title for Domain Widget
				String  Domain_title= driver.findElement(By.xpath("/html/body/h1")).getText();
				XSSFCell c4 = sheet1.createRow(2).createCell(0);
				c4.setCellValue("Domain");
				
				if (Domain_title.equalsIgnoreCase("Welcome to Home Page")) {
					System.out.println("sucess");	
					XSSFCell c3 = sheet1.getRow(2).createCell(1);
					c3.setCellValue("Pass");
				}else{	
					XSSFCell c3 = sheet1.getRow(2).createCell(1);
					c3.setCellValue("Fail");
				}
			  
				//To get the title for Packages Widget
				String  Packages_title= driver.findElement(By.xpath("/html/body/h1")).getText();	
				XSSFCell c5 = sheet1.createRow(3).createCell(0);
				c5.setCellValue("Packages");
				
				if (Packages_title.equalsIgnoreCase("Welcome to Home Page")) {
					System.out.println("sucess");	
					XSSFCell c3 = sheet1.getRow(3).createCell(1);
					c3.setCellValue("Pass");
				}else{	
					XSSFCell c3 = sheet1.getRow(3).createCell(0);
					c3.setCellValue("Fail");
				}
			  			
			  file.close();
			  FileOutputStream outFile =new FileOutputStream(new File("D:\\Book1-result.xlsx"));
			  workbook.write(outFile);
			  workbook.close();
			  outFile.close();
			  System.out.println("writing");
		
	}
	 catch (IOException ioe) {
		  ioe.printStackTrace();
		 }
		driver.close();
		}
	}


