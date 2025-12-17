package examples;
import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/");	
	}
	
	@Test(priority=1)
	public void homepageTest() {
		
		assertEquals(driver.getTitle(), "Training Support");
		driver.findElement(By.linkText("About Us")).click();
	}
	
	@Test(priority=2)
	public void aboutpageTest() {
		assertEquals(driver.getTitle(), "About Training Support");
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
