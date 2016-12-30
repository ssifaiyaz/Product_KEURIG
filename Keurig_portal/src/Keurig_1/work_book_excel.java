package Keurig_1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class work_book_excel {

	 //Creating the instance of Webdriver....
	 //Sheet sheet = null;
	  // FileInputStream file_input_stream = null	   
	   public void login() throws Exception{
		   WebDriver driver;
		   WorkbookSettings workbook_settings = null;
		   Workbook workbook = null;
		   Sheet sheet = null;
		   WritableWorkbook writable_workbook = null;
	  
		    
 	   //By my_account_link = By.linkText("my account");
 	   //By user_name = By.id("emailidLogin");
		 //  By pass_word = By.id("mypasswdLogin");
		  // By btn_sign_in = By.id("signIn");
 	  
 	   //WorkbookSettings workbook_settings = null;
 	   //Workbook workbook = null;
 	   
 	   //WritableWorkbook writable_workbook = null;
 	   //Sheet sheet = null;
 	   
 	     //FileInputStream file_input_stream = null;
 	  try
	   {
 		   FileInputStream file_input_stream = null;
		   file_input_stream = new FileInputStream("C://Users//megha.goyal07//Downloads//Accelerate//Keurig.xls");
		   
		   workbook_settings = new WorkbookSettings();
		   
		   //Opening the workbook and reading the data....
		   workbook = Workbook.getWorkbook(file_input_stream, workbook_settings);
		   
		   sheet = workbook.getSheet("Credentials");
		   
		   writable_workbook = Workbook.createWorkbook(new File("C://Users//shreyas.b//Desktop//TestNG_Automation//Data Pool//Login_details.xls"), workbook);
	   
		   //Setting writable sheet....
		   WritableSheet writable_sheet = writable_workbook.getSheet("Credentials");
		      
		   String strData = "Pass";
		   
		   //Launch the Site....
		   //Setting the path for Chrome driver....
			System.setProperty("webdriver.chrome.driver", "C://Users//shreyas.b//Desktop//Chrome_Driver//chromedriver.exe");
		
		    //System.out.println(sheet.getRows());
			for(int i = 1; i<2 ; i++)
			{
				for(int j = 2 ; j<6 ; j++)
				{
						//Instantiating Chrome Driver.....
						driver = new ChromeDriver();
						//Maximizing the window....
						driver.manage().window().maximize();
						
						driver.navigate().to("http://dt-test2.jcpenney.com/index.jsp?dpAkamaiOverride=1");
						
						Thread.sleep(4000);
						//Click on My Account...
						driver.findElement(my_account_link).click();
						Thread.sleep(6000);
				
						String username = sheet.getCell(i, j).getContents();
						String password = sheet.getCell(i+1, j).getContents();
						//Enter Username and password....
						driver.findElement(user_name).sendKeys(username);
						driver.findElement(pass_word).sendKeys(password);
						driver.findElement(btn_sign_in).click();
						
						Thread.sleep(3000);
						
						String changed_url = driver.getCurrentUrl();
						System.out.println(changed_url.substring(0, 74));
						//System.out.println(changed_url);
						if(changed_url.equals("https://dt-test2.jcpenney.com/cam/jsp/profile/secure/login.jsp?isfromMyAccount=true")==false && changed_url.substring(0, 74).equals("https://dt-test2.jcpenney.com/cam/jsp/profile/secure/linkRewardAccount.jsp"))
						{
							//Logout....
							driver.quit();
							
							Thread.sleep(5000);
							
							Label labTemp = new Label(i+2, j, strData);
							writable_sheet.addCell(labTemp);
						}
						else
						{
							driver.quit();
							Label labTemp = new Label(i+2, j, "Fail");
							writable_sheet.addCell(labTemp);
						}
				}
				
			}
			//Write into the Workbook....
			writable_workbook.write();
			//Close the workbook....
			writable_workbook.close();
		   
	   }
	   catch(Exception e)
	   { e.printStackTrace();
	   
		try 
		{
			writable_workbook.close();
		}
		catch (WriteException | IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   }
}
public static void main(String[] args) 
{
   Try t = new Try();
   
   t.testLogin();     
}

}


