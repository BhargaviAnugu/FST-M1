package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver(); 
		
        driver.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Title of the page is " +driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='checkbox']"));
		checkbox.click();
		
		System.out.println("is checkbox clicked " + checkbox.isSelected());
		
		checkbox.click();
		System.out.println("is checkbox clicked " + checkbox.isSelected());
		
		driver.quit();
	}

}
