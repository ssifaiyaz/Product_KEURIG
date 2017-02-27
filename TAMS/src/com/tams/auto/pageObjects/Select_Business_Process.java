package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Business_Process {

	 private static WebElement element = null;
	 
	 
	 public static WebElement Check_box(WebDriver driver){
		 
         element = driver.findElement(By.id("processArray1"));
 
         return element;
 
         }
 
	 
	 public static WebElement btn_SelectAll(WebDriver driver){
		 
         element = driver.findElement(By.name("selectAllBps"));
 
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

public static WebElement Save_msg(WebDriver driver){
		 
         element = driver.findElement(By.xpath("//*[@id='selectBPForm']/p"));
 
         return element;
 
         }
	 
public static WebElement Chckbox_3(WebDriver driver){
	 
    element = driver.findElement(By.xpath("//*[@id='processArray3']"));

    return element;

    }

public static WebElement Save_msg1(WebDriver driver){
	 
    element = driver.findElement(By.xpath("//*[@id='selectBPForm']/p"));

    return element;

    }
}
