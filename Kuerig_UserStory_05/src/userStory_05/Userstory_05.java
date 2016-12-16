package userStory_05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import pac_login.LoginClass;
public class Userstory_05 extends LoginClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				//To Open the portal and login to Homepage
				//Login_function();
				//To check for the widgets title in the home page	
		 LoginClass.Login_function();
				try {
					FileInputStream file = new FileInputStream(new File("User_Story_05.xlsx")); 
					  XSSFWorkbook workbook = new XSSFWorkbook(file);			 
					  XSSFSheet sheet = workbook.getSheetAt(0);			   
					  XSSFCell c = sheet.createRow(0).createCell(0);
					  c.setCellValue("User Story");
					  XSSFCell c1 = sheet.getRow(0).createCell(1);
					  c1.setCellValue("STATUS");
					  
					  
					//To get the title for Knowledge Repository  Widget
						String  knowledge_title= driver.findElement(By.xpath("/html/body/h1")).getText();
						XSSFSheet sheet1 = workbook.getSheetAt(0);	
						XSSFCell c2 = sheet1.createRow(1).createCell(0);
						c2.setCellValue("Types of Testing");
						
						if (knowledge_title.equalsIgnoreCase("Welcome to Home Page")) {
							System.out.println("sucess");	
							XSSFCell c3 = sheet1.getRow(1).createCell(1);
							c3.setCellValue("Pass");
						}else{	
							XSSFCell c3 = sheet1.getRow(1).createCell(1);
							c3.setCellValue("Fail");
						}
					  
						//To get the title for  Learning of the Month Widget
						String  Learning_title= driver.findElement(By.xpath("/html/body/h1")).getText();
						XSSFCell c4 = sheet1.createRow(2).createCell(0);
						c4.setCellValue("Domain");
						
						if (Learning_title.equalsIgnoreCase("Welcome to Home Page")) {
							System.out.println("sucess");	
							XSSFCell c3 = sheet1.getRow(2).createCell(1);
							c3.setCellValue("Pass");
						}else{	
							XSSFCell c3 = sheet1.getRow(2).createCell(1);
							c3.setCellValue("Fail");
						}
					  
						//To get the title for Appreciation Of Month  Widget
						String  Appreciation_title= driver.findElement(By.xpath("/html/body/h1")).getText();	
						XSSFCell c5 = sheet1.createRow(3).createCell(0);
						c5.setCellValue("Packages");
						
						if (Appreciation_title.equalsIgnoreCase("Welcome to Home Page")) {
							System.out.println("sucess");	
							XSSFCell c3 = sheet1.getRow(3).createCell(1);
							c3.setCellValue("Pass");
						}else{	
							XSSFCell c3 = sheet1.getRow(3).createCell(0);
							c3.setCellValue("Fail");
						}
					  			
						//To get the title for  Star of the Month widgets Widget
						String  Star_title= driver.findElement(By.xpath("/html/body/h1")).getText();	
						XSSFCell c6 = sheet1.createRow(3).createCell(0);
						c6.setCellValue("Packages");
						
						if (Star_title.equalsIgnoreCase("Welcome to Home Page")) {
							System.out.println("sucess");	
							XSSFCell c3 = sheet1.getRow(3).createCell(1);
							c3.setCellValue("Pass");
						}else{	
							XSSFCell c3 = sheet1.getRow(3).createCell(0);
							c3.setCellValue("Fail");
						}
						
						
					  file.close();
					  FileOutputStream outFile =new FileOutputStream(new File("Book1-result.xlsx"));
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


