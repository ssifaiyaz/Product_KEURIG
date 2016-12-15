package package_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {
	public static WebDriver driver=null;
	public static String url=null;
	
	public static void Login_function()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neeraj.sharma27\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		url = "http://tvmatp367321d:8080/KeurigPortalDev/login.jsp";
		driver.get(url);
		// taking data from Excel sheet and try logging in
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("email")).sendKeys("saranya.s@infy.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("mybutton")).click();
		
		// after login new tab opens so we should use window handler method to move control to new tab
		String tab2 = driver.getWindowHandle();
		driver.switchTo().window(tab2);
		
		
	}

}
