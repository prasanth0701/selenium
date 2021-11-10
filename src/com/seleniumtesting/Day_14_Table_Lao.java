package com.seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_14_Table_Lao {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","http://leafground.com/pages/table.html");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		
	}

}
