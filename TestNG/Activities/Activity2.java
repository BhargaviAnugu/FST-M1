package examples;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice/");
	}
	
	@Test
	public void test1() {
		
		String title = driver.getTitle();
		System.out.println("Title of the page is " +title);
		assertEquals(title, "Selenium: Target Practice");
	}
	
	@Test
	public void test2() {
		WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");	
	}
	
	@Test(enabled = false)
	public void test3() {
		String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
	}
	@Test
	public void test4() {
		throw new SkipException("Skipping test case");
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}

}
