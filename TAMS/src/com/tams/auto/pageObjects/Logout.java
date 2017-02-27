package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	 private static WebElement element = null;
		public static WebElement lnk_Logout(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='templateTable']/tbody/tr[2]/td/table/tbody/tr/td[17]/a"));

	        return element;

	        }
		
		public static WebElement btn_Return_to_Login(WebDriver driver){
			 
	        element = driver.findElement(By.xpath("//*[@id='body']/div/form/input"));
	      
	        return element;

	        }
}
