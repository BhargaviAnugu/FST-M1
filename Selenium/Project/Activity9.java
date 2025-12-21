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

public class Activity9 {
	
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
	public void LeadsInfoTest() {
		int nameCol = 0, userCol=0;
		WebElement username = driver.findElement(By.id("user_name"));
    	username.sendKeys("admin");
    	
    	WebElement password = driver.findElement(By.id("username_password"));
    	password.sendKeys("pa$$w0rd");
    	
    	driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
    	
    	//click on sales
    	driver.findElement(By.xpath("//a[text()='Sales']")).click();
    	
    	//click on Leads
    	driver.findElement(By.xpath("//a[text()='Leads']")).click();
    	
    	//Get the row header values
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//table[contains(@class,'list view')]")));
    	
    	List<WebElement> headers = table.findElements(By.xpath(".//th"));
    	
    	for (int i = 0; i < headers.size(); i++) {
            String headerText = headers.get(i).getText().trim();

            if (headerText.equalsIgnoreCase("Name")) {
                 nameCol = i+1;
            }
            if (headerText.equalsIgnoreCase("User")) {
                userCol = i+1;
            }
        }
    	
    	List<WebElement> rows = table.findElements(
                By.xpath(".//tr[contains(@class,'ListRowS1')]"));

    System.out.println("First 10 Name and User values:");
        
    	int count = 1;
        for (WebElement row : rows) {
            if (count > 10) break;

            String name = row.findElement(By.xpath("./td[" + nameCol + "]")).getText();
            String user = row.findElement(By.xpath("./td[" + userCol + "]")).getText();

            System.out.println(count + ": Name = " + name + ", User = " + user);
            count++;
        }
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
    }


}
