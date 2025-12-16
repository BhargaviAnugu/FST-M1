package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	
	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver(); 
		
        driver.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Title of the page is " +driver.getTitle());
		
		WebElement textbox = driver.findElement(By.xpath("//button[@id='textInputButton']"));
		System.out.println("is Input field Enabled: " + textbox.isEnabled());
		textbox.click();
		System.out.println("is Input field Enabled: " + textbox.isEnabled());
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='textInput']"));
		inputBox.sendKeys("hellooo");
        System.out.println("textbox properties " +inputBox.getDomProperty("value"));

        // Close the browser
        driver.quit();
		
		
	}

}
