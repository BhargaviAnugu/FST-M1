package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		
		//Title of the page
		
		System.out.println("Title of the page is " +driver.getTitle());
		
		driver.findElement(By.linkText("About Us")).click();
		
		//Title of the new page
		System.out.println("Title of the new page is " +driver.getTitle());
		
		//quit the driver
		driver.quit();
	
	}

}
