package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get(" https://training-support.net/webelements/dynamic-attributes");
		
		System.out.println("Title of the page is " +driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys("Bhargavi");
		//driver.findElement(By.xpath("//input[@name='bcf4-email']")).sendKeys("bhargavi@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("bhargavi@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2025-12-16");
		driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]")).sendKeys("Dynamic Attributes");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")))
                .getText();
        System.out.println("Success message: " + message);

        
        driver.quit();
		
	}

}
