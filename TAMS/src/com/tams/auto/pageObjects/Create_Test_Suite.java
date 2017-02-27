package com.tams.auto.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Create_Test_Suite {

	private static WebElement element = null;
	public static WebElement Select_BP_Listbox(WebDriver driver){
		 
        element = driver.findElement(By.name("bpName"));

        return element;

        }

	public static WebElement txtbx_TestSuite(WebDriver driver){
		 
        element = driver.findElement(By.id("testSuite"));

        return element;

        }
	public static WebElement ShowEntries_Dropdown(WebDriver driver){
		 
        element = driver.findElement(By.xpath("//*[@id='selectScenarioDT_length']/label/select"));

        return element;

        }

	public static WebElement btn_Save(WebDriver driver){
		 
        element = driver.findElement(By.name("save"));

        return element;

        }

}
