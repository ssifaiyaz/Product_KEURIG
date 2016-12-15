package package_login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;



import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyOfLogin {
	public static void main(String[] args) throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException {
		
		WebDriver driver=null;
		String url=null;
		Workbook login=null;

		
		File souFile=FileUtils.getFile("C:\\Users\\neeraj.sharma27\\Desktop\\KeurigLogin.xls");
		login=Workbook.getWorkbook(souFile);
		String out="C:\\Users\\neeraj.sharma27\\Desktop\\KeurigLogin1.xls";
		File descFile=FileUtils.getFile(out);
		
		FileUtils.copyFile(souFile, descFile);
		Sheet loginsheet=login.getSheet(0);
		Integer  rowcount=loginsheet.getRows();
		//System.out.println(loginsheet.get);
		System.out.println(rowcount);
	/*	Workbook workbuk =Workbook.getWorkbook(new File("C:\\Useris\\neeraj.sharma27\\Desktop\\KeurigLogin.xls"));
		WritableWorkbook workbuk_copy=Workbook.createWorkbook(new File("D:\\NewXLFile.xls"),workbuk);
        WritableSheet wsheet_old=workbuk_copy.getSheet(0);*/
        List<String>list=new ArrayList<String>();
		for (int i = 1; i < rowcount; i++) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neeraj.sharma27\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		
		url="http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";
		
		driver.get(url);
			    driver.findElement(By.name("email")).clear();
			    driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("email")).sendKeys(loginsheet.getCell(0,i).getContents());
				driver.findElement(By.name("password")).sendKeys(loginsheet.getCell(1,i).getContents());
				Thread.sleep(2000);
				driver.findElement(By.id("mybutton")).click();
				String tab2=driver.getWindowHandle();
				driver.switchTo().window(tab2);
				
		       // WritableSheet wsheet_new=workbuk_copy.getSheet("logincopy.xls");
		        Label lable=new Label(2,i,"login successful");
		        list.add("login successful");
		      /*  wsheet_old.addCell(lable);
		        workbuk_copy.write();*/
		     
				driver.close();
			
		}
		
		   login.close();
		updateExcelById("Result",list,out,"Sheet1");
		
		
		
	}
	
	
	public static void updateExcelById(String fieldName , List<String> List, String fileName,String sheetName) {
		XSSFWorkbook wb = null;
		FileInputStream fis = null;
		FileOutputStream outFile = null;
		int columnNumber = 0;
		try {
		fis = new FileInputStream( fileName );
		wb = new XSSFWorkbook( fis);
		// Get first sheet from the workbook
		XSSFSheet sheet= null;
		
		sheet= wb.getSheet( sheetName .trim());
		
		Row row;
		Cell cell;
		// System.out.println(sheet.getPhysicalNumberOfRows());
		// LinkedHashMap<String, String> excelMap = new
		// LinkedHashMap<String, String>();
		// Iterate through each rows from first sheet
		Iterator<Row> rowIterator = sheet .iterator();
		// itrating each row to read contents
		while ( rowIterator .hasNext()) {
		int i = 0;
		row = rowIterator.next();
		Iterator<Cell> cellIterator = row.cellIterator();
		// itrating through each cell in a row
		if ( i == 0) {
		while ( cellIterator .hasNext()) {
		cell = cellIterator.next();
		if ( cell.toString().trim().equalsIgnoreCase( fieldName .trim())) {
		columnNumber = cell .getColumnIndex();
		break;
		}
		}
		}
		// itrate through the hash map
		i ++;
		// Functions.LogOff_CommonSystems();
		}
		int index = 1;
		for (String value : List) {
		if ( sheet.getRow( index) == null ){
		sheet.createRow( index ) ;
		}
		cell = sheet.getRow( index ).createCell( columnNumber);
		cell.setCellValue( value );
		index++;
		}
		// inputFile.close();
		try {
		if ( null != fis) {
		fis .close();
		}
		} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		outFile = new FileOutputStream( fileName );
		wb.write( outFile);
		} catch (Exception e) {
		System. out.println( "Error in writing file - : " + e .getMessage());
		} finally {
		try {
		if ( null != fis) {
		fis.close();
		}
		} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		try {
		if ( null != outFile) {
		outFile.close();
		}
		} catch (IOException e ) {
		// TODO Auto-generated catch block
		e .printStackTrace();
		}
		}
		}

}
