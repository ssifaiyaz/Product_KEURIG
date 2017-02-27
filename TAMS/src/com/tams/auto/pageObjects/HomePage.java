package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	 private static WebElement element = null;

	public static WebElement lnk_SelectBusinessProcess(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));

        return element;

        }
	
	
	public static WebElement lnk_SelectApplication(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
        return element;

        }
	
	public static WebElement lnk_CreateTestSuite(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[5]/a"));

        return element;

        }
	
	public static WebElement lnk_AddSteps(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[9]/a"));

        return element;

        }
	
	public static WebElement lnk_TestEnv(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[11]/a"));

        return element;

        }
	
	
	
	public static WebElement lnk_RunTest(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[13]/a"));

        return element;

        }
	
	
	public static WebElement lnk_TestResult(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[15]/a"));

        return element;

        }


}
