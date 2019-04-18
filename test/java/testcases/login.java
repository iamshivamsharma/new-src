package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Driver.driver;

public class login extends driver {
	@Test
	public void app() 
	{
	System.out.println("Test cases");
	driver.findElement(By.id("email")).sendKeys(("Shivam"));
	driver.findElement(By.id("pass")).sendKeys("Sharma");
	driver.findElement(By.id("loginbutton")).click();
	
	}
}
