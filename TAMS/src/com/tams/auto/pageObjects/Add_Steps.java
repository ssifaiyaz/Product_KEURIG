package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_Steps {
	
	private static WebElement element = null;
	public static WebElement SelectBP_Dropdown(WebDriver driver){
		 
        element = driver.findElement(By.name("bpName"));

        return element;

        }
	
	public static WebElement TestSuite_Dropdown(WebDriver driver){
		 
        element = driver.findElement(By.name("testSuite"));

        return element;

        }
	
	
	public static WebElement TestScenario_Dropdown(WebDriver driver){
		 
        element = driver.findElement(By.name("scenario"));

        return element;

        }
	
	
}
