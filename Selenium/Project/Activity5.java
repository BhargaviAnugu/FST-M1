package crmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;

	@BeforeClass
	public void setup() {
		
		//Get the Firefox driver
		driver = new FirefoxDriver();
		
		//open the url
		driver.get("http://alchemy.hguy.co/crm/");	
		
		//maximize the window
		driver.manage().window().maximize();
	}
	
	@Test
	public void getColor() {
		
		WebElement username = driver.findElement(By.id("user_name"));
    	username.sendKeys("admin");
    	
    	WebElement password = driver.findElement(By.id("username_password"));
    	password.sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
    	
		Color navbar = Color.fromString(driver.findElement(By.xpath("//nav[contains(@class, 'navbar-fixed-top')]")).getCssValue("color"));
        System.out.println("Navigation bar color as RGB: " + navbar.asRgb());
        System.out.println("Navigation bar color as hexcode: " + navbar.asHex());
    	
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }


}
