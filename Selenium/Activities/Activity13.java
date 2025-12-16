package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("Title of the page is " +driver.getTitle());
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		System.out.println("Number of columns in a table are " +cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
		System.out.println("Number of rows in a table are " +rows.size());
		
		List<WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
		
		System.out.println("Data in third row is: ");
		for(WebElement element:thirdrow) {
			
			System.out.print(" " +element.getText());
		}
		System.out.println();
        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));
		
		System.out.println("Data in second row and second column is: " +cellValue.getText());
		
		driver.quit();
				
			
	}
	

}
