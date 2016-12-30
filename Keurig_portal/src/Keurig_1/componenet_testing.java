package Keurig_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import common.Assert;
public class componenet_testing {


ChromeDriver driver;
   @Test
  
    public void open_chrome_and_start() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chittranjan01\\Desktop\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://timetracker.anuko.com/login.php");
    }

   
    public void enter_the_invalid_username_and_password() throws Exception {
           driver.findElement(By.id("Email")).sendKeys("harini.p@infy.com"); 
           driver.findElement(By.id("Password")).sendKeys("112");
    }

    
    public void user_should_not_be_able_to_login() throws Exception {
     
           driver.findElement(By.id("btn_login")).click();
           String error=driver.findElement(By.className("error")).getText();
                System.out.println("Error Message:"+error);
                Assert.assertEquals(error, "Incorrect login or password.");
                driver.close();  
                
    }
    
} 
