package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
	
	public static void main(String[] args) {
		
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("Title of the page is " +driver.getTitle());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		System.out.println("Number of columns in a table are " +cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
		System.out.println("Number of rows in a table are " +rows.size());
		
        WebElement fifthrow = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
		
		System.out.println("BookName in fifth row is: " +fifthrow.getText());
		
		driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th[5]")).click();
		
		
		//after sorting
		WebElement fifthrowSort = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("BookName in fifth row after sorting is: " +fifthrowSort.getText());
		
		driver.quit();
		
	}

}
