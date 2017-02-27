package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestResult {
	private static WebElement element = null;
	
	
	public static WebElement DropDown_User(WebDriver driver){
		 
        element = driver.findElement(By.name("user"));

        return element;

        }
	
	public static WebElement DropDown_TestSuite(WebDriver driver){
		 
        element = driver.findElement(By.name("testSuite"));

        return element;

        }
	
	public static WebElement DropDown_RunDate(WebDriver driver){
		 
        element = driver.findElement(By.name("startTime"));

        return element;

        }

	public static WebElement btn_Refresh(WebDriver driver){
		 
        element = driver.findElement(By.name("refresh"));

        return element;

        }
	
	
}
