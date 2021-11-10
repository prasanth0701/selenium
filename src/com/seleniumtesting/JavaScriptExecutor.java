package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)","");
		Thread.sleep(2000);	
		//js.executeScript("window.scroll(0,-2000)","");
       
		WebElement table = driver.findElement(By.xpath("//a[text()='Office Tables']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arugument[0].scrollIntoView(true);", table);
		js1.executeScript("arugument[0].click();", table);


	}
	

}
