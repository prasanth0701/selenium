package com.seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_7_Alert {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert.click();
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		Thread.sleep(3000);
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		
		

	}

}
