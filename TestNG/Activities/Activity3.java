package examples;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
	}
	
	@Test()
	public void LoginTest() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String successMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
		System.out.println("Success message is " +successMessage);
		assertEquals("A Simple Login Form!", successMessage);
	}
	
	@AfterMethod
	public void afterClass() {
		driver.quit();
	}

}
