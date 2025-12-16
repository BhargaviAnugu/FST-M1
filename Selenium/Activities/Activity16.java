package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		
		System.out.println("Title of the page is " + driver.getTitle());
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
		
		Select selectSecondOption = new Select(dropdown);
		selectSecondOption.selectByVisibleText("Two");
		
		System.out.println("Second option is: " + selectSecondOption.getFirstSelectedOption().getText());
		
		selectSecondOption.selectByIndex(3);
		System.out.println("Third option is: " + selectSecondOption.getFirstSelectedOption().getText());
		
		selectSecondOption.selectByValue("four");
		System.out.println("fourth option is: " + selectSecondOption.getFirstSelectedOption().getText());
		
		List<WebElement> allOptions = selectSecondOption.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        
        driver.quit();
		
	}

}
