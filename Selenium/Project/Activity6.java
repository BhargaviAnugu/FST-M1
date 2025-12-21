package crmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	
	
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
	public void getActivitiesTest() {
		
		WebElement username = driver.findElement(By.id("user_name"));
    	username.sendKeys("admin");
    	
    	WebElement password = driver.findElement(By.id("username_password"));
    	password.sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
    	
    	WebElement activitiesMenu = driver.findElement(By.xpath("//a[text()='Activities']"));
    	
    	String activitiesText = activitiesMenu.getText();
    	System.out.println("Activities Menu Text is: " +activitiesText);
    	System.out.println("is Activities menu displayed: " +activitiesMenu.isDisplayed());
    	
    	Assert.assertTrue(activitiesMenu.isDisplayed(), "Activities menu is displayed");
 			
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }


}
