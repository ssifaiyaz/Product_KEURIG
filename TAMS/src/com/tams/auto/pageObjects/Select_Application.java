package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Application {
	private static WebElement element = null;
	public static WebElement Check_box(WebDriver driver){
		 
        element = driver.findElement(By.id("processArray1"));

        return element;

        }

 public static WebElement btn_SelectAll(WebDriver driver){
		 
         element = driver.findElement(By.name("selectAllApps"));
 
         return element;
 
         }

	 public static WebElement btn_DeselectAll(WebDriver driver){
		 
         element = driver.findElement(By.name("deselectAllBps"));
 
         return element;
 
         }
	 
	 

	 public static WebElement btn_Save(WebDriver driver){
		 
         element = driver.findElement(By.name("submit"));
 
         return element;
 
         }



}
