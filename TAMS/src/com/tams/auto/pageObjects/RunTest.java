package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunTest {
	private static WebElement element = null;
	
	public static WebElement btn_RunTest(WebDriver driver){
		 
        element = driver.findElement(By.name("runTest"));

        return element;

        }

	public static WebElement btn_ActiveSuites(WebDriver driver){
		 
        element = driver.findElement(By.name("activeSuites"));

        return element;

        }
	
	public static WebElement btn_Close(WebDriver driver){
		 
        element = driver.findElement(By.name("close"));

        return element;

        }
	
	public static WebElement checkBox_1(WebDriver driver){
		 
        element = driver.findElement(By.name("checkboxStatus1"));

        return element;

        }
	
	public static WebElement checkBox_2(WebDriver driver){
		 
        element = driver.findElement(By.name("checkboxStatus2"));

        return element;

        }
	
}
