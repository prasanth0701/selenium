package com.seleniumtesting;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_4_Xpath_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("the wings of fire");
		Thread.sleep(3000);
		
		//for click search symbol
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		Thread.sleep(4000);
		
		//select
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
	
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
	    Thread.sleep(4000);
		
	    //screenshot
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File des = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\amazonxpath.png");
	    FileUtils.copyFile(source,des);
	}

}
