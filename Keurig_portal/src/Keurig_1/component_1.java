package Keurig_1;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class component_1 {
    public ChromeDriver driver;
	public static main(String[] args){
		// TODO Auto-generated method stub
		 @Given("^open chrome and start$")
		 public void open_chrome_and_start() throws Exception {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chittranjan01\\Desktop\\chromedriver_win32\\chromedriver.exe");
		        ChromeDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://timetracker.anuko.com/login.php");
		 @When("^enter the invalid username and password$")
		 public void enter_the_invalid_username_and_password() throws Exception {
	           driver.findElement(By.id("Email")).sendKeys("harini.p@infy.com"); 
	           driver.findElement(By.id("Password")).sendKeys("112");
	          
		 @Then("^user should not be able to login$")
		 public void enter_the_invalid_username_and_password() throws Exception {
			 driver.findElement(By.id("btn_login")).click();
	           String error=driver.findElement(By.className("error")).getText();
	                System.out.println("Error Message:"+error);
	                Assert.assertEquals(error, "Incorrect login or password.");
	                driver.close();  
		 }}
