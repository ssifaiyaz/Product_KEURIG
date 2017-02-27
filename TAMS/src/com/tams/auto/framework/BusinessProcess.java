package com.tams.auto.framework;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tams.auto.pageControl.Button;
import com.tams.auto.pageObjects.HomePage;
import com.tams.auto.pageObjects.LogIn;
import com.tams.auto.pageObjects.Logout;
import com.tams.auto.pageObjects.Select_Business_Process;
import com.tams.auto.utility.Config;

public class BusinessProcess {
	  public WebDriver driver;
	  WebElement webElement = null;
    
@BeforeTest
	 
	  public void beforeMethod() {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
@Test(priority=1)
	     public void Check(){
		 driver.get(Config.Page_URl());
		 driver.manage().window().maximize();
		 LogIn.txtbox_UserName(driver).sendKeys(Config.Username());
	     LogIn.txtbox_password(driver).sendKeys(Config.Password());
	     //Button.btn(driver,"submit");
	     LogIn.btn_Login(driver).click();
	     HomePage.lnk_SelectBusinessProcess(driver).click();
	     
		
	     if ( !Select_Business_Process.Check_box(driver).isSelected() )
	     {
	          Select_Business_Process.Check_box(driver).click();
	          Select_Business_Process.btn_Save(driver).click();
	          //Button.btn(driver, "submit");
	          String actual_msg=Select_Business_Process.Save_msg(driver).getText();
	          String expect="Data Saved Successfully!!";
	          Assert.assertEquals(actual_msg, expect);
	          
	          
	     }
	     else{
	    	 Select_Business_Process.btn_Save(driver).click();
	    	 String actual_msg=Select_Business_Process.Save_msg(driver).getText();
	          String expect="Data Saved Successfully!!";
	          Assert.assertEquals(actual_msg, expect);
	    	 
	     }
	     }
	
	@Test(priority=2)
	public  void Uncheck_BP(){
	     if ( Select_Business_Process.Check_box(driver).isSelected() )
	     {
	         Select_Business_Process.Check_box(driver).click();
	         if(!Select_Business_Process.Check_box(driver).isSelected())
	        	Select_Business_Process.Chckbox_3(driver).click();
	         	Select_Business_Process.btn_Save(driver).click();
	         	String actual_msg1=Select_Business_Process.Save_msg(driver).getText();
		        String expect1="Changes saved!!";
		        Assert.assertEquals(actual_msg1, expect1);
		    	 
	     }
	}
@Test(priority=3)
public void UncheckAll_BP(){
	Select_Business_Process.btn_DeselectAll(driver).click();
	if(!Select_Business_Process.Check_box(driver).isSelected()){
		Select_Business_Process.btn_Save(driver).click();
		String actual_msg=Select_Business_Process.Save_msg(driver).getText();
        String expect="Changes saved!!";
        Assert.assertEquals(actual_msg, expect);
       
	}
	
}

@Test(priority=4)
public void Select_All(){
	
	Select_Business_Process.btn_SelectAll(driver).click();
	int j=0;
	//boolean c=Select_Business_Process.Chckbox_3(driver).isSelected();
	List<WebElement> selectElements= driver.findElements(By.cssSelector("input[type='checkbox']"));
	int numberOfBoxes_Select = selectElements.size();
	for(WebElement checkbox : selectElements){
	    if(checkbox.isSelected()){
	    	j++;	    	
	      //System.out.println("Clicked");
	    }
	}
	Assert.assertEquals(numberOfBoxes_Select, j);
}

@Test(priority=5)
public void Deselect_All(){
	int i=0;
	Select_Business_Process.btn_DeselectAll(driver).click();
	List<WebElement> selectElements1= driver.findElements(By.cssSelector("input[type='checkbox']"));
	int numberOfBoxes = selectElements1.size();
	for(WebElement checkbox1 : selectElements1){
	    if(!checkbox1.isSelected()){
	    	i++;
	     // System.out.println("Not Clicked");
	    }
	  
	}
	Assert.assertEquals(numberOfBoxes, i);
	}

@Test(priority=6)
public void Select_Multiple(){
	Select_Business_Process.Chckbox_3(driver).click();
	Select_Business_Process.Check_box(driver).click();
	Select_Business_Process.btn_Save(driver).click();
	HomePage.lnk_SelectApplication(driver).click();
	
}
@AfterTest
public void Log_out(){
	Logout.lnk_Logout(driver).click();
	Logout.btn_Return_to_Login(driver).click();
	driver.quit();
	
}
}


