package crmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		//Get the firefox driver
		driver = new FirefoxDriver();
		
		//open the url
		driver.get("http://alchemy.hguy.co/crm/");	
		
		//maximize the window
		driver.manage().window().maximize();
	}
	
    @Test
    public void getImageUrlTest() {
    
    	//Get the image url using xpath
    	String imageUrl = driver.findElement(By.xpath("//img")).getAttribute("src");
    	
    	System.out.println("URL of the image is " +imageUrl);
    
    }
    
    @AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }

}
