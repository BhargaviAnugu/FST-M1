package crmtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver;
	Actions actions;

	@BeforeClass
	public void setup() {
		
		//Get the Firefox driver
		driver = new FirefoxDriver();
		
		//open the url
		driver.get("http://alchemy.hguy.co/crm/");	
		
		//maximize the window
		driver.manage().window().maximize();
		actions = new Actions(driver);
	}
	
	@Test
	public void accountNames() {
		WebElement username = driver.findElement(By.id("user_name"));
    	username.sendKeys("admin");
    	
    	WebElement password = driver.findElement(By.id("username_password"));
    	password.sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
    	
    	//Click on Sales
    	driver.findElement(By.xpath("//a[text()='Sales']")).click();
    	
    	//Click on Leads
    	driver.findElement(By.xpath("//a[text()='Leads']")).click();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	WebElement additionalInfoIcon = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//span[@title='Additional Details'])[1]")));
        additionalInfoIcon.click();
        
        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@class='phone']"))); 

         String phoneNumber = phoneElement.getText().trim();

        // check if not getting text from the wrong field
        if (phoneNumber.isEmpty() || phoneNumber.equalsIgnoreCase("IBM")) {
            // Find the phone number by searching for the label 'Phone:'
           phoneNumber = driver.findElement(By.xpath("//div[contains(text(), 'Phone')]/following-sibling::div")).getText();
        }
        
        System.out.println("Lead Phone Number: " + phoneNumber);
        // Validating phone number
        Assert.assertEquals(phoneNumber, "12345678", "The phone number does not match!");
    
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }


}
