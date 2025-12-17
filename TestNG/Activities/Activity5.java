package examples;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;
    
    @BeforeClass(alwaysRun = true)
    public void setup() {
    	
    	driver = new FirefoxDriver();
    	driver.get(" https://training-support.net/webelements/target-practice");
    }
    
    @Test(groups = { "HeaderTests", "ButtonTests" })
    public void titleTest() {
    	
    	String title = driver.getTitle();
    	System.out.println("Title of the page is " +title);
    	assertEquals(title, "Selenium: Target Practice");
    }
    
    @Test(dependsOnMethods = { "titleTest" }, groups = { "HeaderTests"})
    public void headerTest1() {	
    	WebElement header3 = driver.findElement(By.xpath("//h3[contains(@class, 'orange')]"));
        Assert.assertEquals(header3.getText(), "Heading #3");
    }
    
    @Test(dependsOnMethods = { "titleTest" }, groups = { "HeaderTests"})
    public void headerTest2() {
    	String emeraldText = driver.findElement(By.xpath("//button[contains(@class, 'bg-emerald-200')]")).getText();
    	System.out.println("Colour of the emerald button is " +emeraldText);
    	assertEquals(emeraldText, "Emerald");
    }
    
    @Test(dependsOnMethods = { "titleTest" }, groups = { "ButtonTests" })
    public void buttonTest1() {
    	String thirdHeaderText = driver.findElement(By.cssSelector("h3.text-orange")).getText();
    	System.out.println("Text of the thridHeader is " +thirdHeaderText);
    	assertEquals(thirdHeaderText, "Heading #3");
    }
    
    @Test(dependsOnMethods = { "titleTest" }, groups = { "ButtonTests" })
    public void buttonTest2() {
    	Color button2Color = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'purple')]")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#581c87");
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.close();
    }


}
