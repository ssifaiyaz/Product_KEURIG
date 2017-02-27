package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Env {
	private static WebElement element = null;
	
	public static WebElement txtbx_CollectionName(WebDriver driver){
		 
        element = driver.findElement(By.id("collection"));

        return element;

        }

	public static WebElement txtbx_Application_Instance(WebDriver driver){
		 
        element = driver.findElement(By.id("appInstance"));

        return element;

        }

	public static WebElement txtbx_Application_URL(WebDriver driver){
		 
        element = driver.findElement(By.id("appUrl"));

        return element;

        }
	public static WebElement ApplicationName_Dropdown(WebDriver driver){
		 
        element = driver.findElement(By.id("application"));

        return element;

        }

	public static WebElement btn_Save(WebDriver driver){
		 
        element = driver.findElement(By.name("save"));

        return element;

        }

}



