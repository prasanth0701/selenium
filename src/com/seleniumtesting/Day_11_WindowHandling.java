package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.awt.AWTException;

public class Day_11_WindowHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				
				
				"C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		
		WebElement topoffers = driver.findElement(By.xpath("(//div[text()='Top Offers'])[1]"));

		Actions a = new Actions(driver);
		a.contextClick(topoffers).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


		WebElement grocery = driver.findElement(By.xpath("//div[text()='Grocery']"));

		a.contextClick(grocery).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));

		a.contextClick(mobiles).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//parent window ID
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		
		
		//size of windows
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		
		
		//get all windows title
		Set<String> titles = driver.getWindowHandles();
		
		for(String i:titles) {
			String windowtitle = driver.switchTo().window(i).getTitle();
			System.out.println(windowtitle);
			
		}
		Thread.sleep(2000);
		
		
		//open specific child window
		
		String child = "Mobile Phones: The Big Billion Days Sale starts from 3rd October";
		for(String i1:titles) {
			if(driver.switchTo().window(i1).getTitle().equalsIgnoreCase(child)) {
			break;
			}		
			
			Thread.sleep(2000);

			
			
		//close all window except parent
//			for(String i2:titles) {
//				
//				if(!i2.equals(parentID)) {
//					
//					driver.switchTo().window(i2);
//					driver.close();
//				}
//				
//			}
		}
		
		
		
		
	}

}
