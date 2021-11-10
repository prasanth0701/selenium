package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_14_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
        driver.get("http://www.dhtmlgoodies.com/scripts/highlight-table-row/highlight-table-row.html");
        driver.manage().window().maximize();
        
        System.out.println("----------all data----------");
        driver.findElements(By.xpath("//table[@id='myTable']"));
        
        
        
		
	}

}
