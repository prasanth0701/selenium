package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;


public class Day_11_Xpath_TodaysDeal {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		//New tap for today's deal
		WebElement Todaysdeal = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		
		Actions a = new Actions(driver);
		a.contextClick(Todaysdeal).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//New tap for Customer Service
		WebElement CustomerService = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		
		a.contextClick(CustomerService).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//New tap for Registry
		WebElement Registry = driver.findElement(By.xpath("//a[text()='Registry']"));
		
		a.contextClick(Registry).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//new tap for Gift Cards
		WebElement GiftCards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		
		a.contextClick(GiftCards).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		
		
		//to find parent ID (WindowHandle)
		String windowHandle = driver.getWindowHandle();
		System.out.println("The parent ID is: "+windowHandle);
		
		//to find the size or number of windows open (WindowHandles)
		int size = driver.getWindowHandles().size();
		System.out.println("The size is"+size);
		
		//to find all parent ID
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String i:windowHandles) {
			
			String allID = driver.switchTo().window(i).getTitle();
			System.out.println(allID);
			
		}
		
		
//org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
		
	}

}
