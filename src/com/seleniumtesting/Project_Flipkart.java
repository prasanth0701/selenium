package com.seleniumtesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_Flipkart {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	 WebElement topoffers = driver.findElement(By.xpath("//img[@alt='Top Offers']"));
	 
	 Thread.sleep(3000);
	 
	 Actions a = new Actions(driver);
	 a.contextClick(topoffers).build().perform();
	 
	 Robot r=new Robot();

	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 
}
}
