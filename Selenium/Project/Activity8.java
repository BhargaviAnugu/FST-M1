package crmtest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	
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
	public void accountNamesTest() {
		WebElement username = driver.findElement(By.id("user_name"));
    	username.sendKeys("admin");
    	
    	WebElement password = driver.findElement(By.id("username_password"));
    	password.sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
    	
    	//Click on Sales
    	driver.findElement(By.xpath("//a[text()='Sales']")).click();
    	
    	//Click on Accounts
    	driver.findElement(By.xpath("//a[text()='Accounts']")).click();
    	
    	//Get the table rows
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	 List<WebElement> oddRows = wait.until(ExpectedConditions
                 .presenceOfAllElementsLocatedBy(By.xpath("//table[@class='list view table-responsive']//tr[contains(@class,'oddListRow')]")));

         System.out.println("First 5 odd-numbered row names:");

         
         for(int i=0;i<5;i++) {
        	 WebElement row = oddRows.get(i);
        	 String accountName = row.findElement(By.xpath("./td[3]")).getText();
        	 System.out.println((i + 1) + ": " + accountName); 
        	 }    
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }

}
