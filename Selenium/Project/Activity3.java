package crmtest;

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
		
		//Get the Firefox driver
		driver = new FirefoxDriver();
		
		//open the url
		driver.get("http://alchemy.hguy.co/crm/");	
		
		//maximize the window
		driver.manage().window().maximize();
	}
	
    @Test
    public void copyRightTest() {
    
    	String firstCopyRightText = driver.findElement(By.id("admin_options")).getText();
    	
    	System.out.println("Text of the first copy right on CRM page is " +firstCopyRightText);
    	
    	assertEquals(firstCopyRightText, "© Supercharged by SuiteCRM");
    
    }
    
    @AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }


}
