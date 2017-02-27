package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
	 private static WebElement element = null;
	public static WebElement txtbox_UserName(WebDriver driver){
		 
        element = driver.findElement(By.id("userName"));

        return element;

        }

	
	public static WebElement txtbox_password(WebDriver driver){
		 
        element = driver.findElement(By.id("password"));

        return element;

        }
	public static WebElement btn_Login(WebDriver driver){
		 
        element = driver.findElement(By.name("submit"));

        return element;

        }
}
