package crmtest;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm/");	
	}
	
    @Test
    public void pageTitleTest() {
    
    	String actualTitle = driver.getTitle();
    	String expectedTitle = "SuiteCRM";
 
    	assertEquals(actualTitle, expectedTitle);
    
    }
    
    @AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }
}
