package com.tams.auto.pageControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {
	public static WebElement element = null;
	 
	public static void btn(WebDriver driver, String name){
		
		element=driver.findElement(By.name(name));
		element.click();
		
	}

}
