package com.seleniumtesting;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_12_DragandDrop_FindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement s1 = driver.findElement(By.id("box1"));
		WebElement d1 = driver.findElement(By.xpath("//div[text()='Italy']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(s1, d1).build().perform();
		Thread.sleep(2000);
		
		WebElement s2 = driver.findElement(By.id("box2"));
		WebElement d2 = driver.findElement(By.xpath("//div[text()='Spain']"));
		a.dragAndDrop(s2, d2).build().perform();
		Thread.sleep(2000);

		WebElement s3 = driver.findElement(By.id("box3"));
		WebElement d3 = driver.findElement(By.xpath("//div[text()='Norway']"));
		a.dragAndDrop(s3, d3).build().perform();
		Thread.sleep(2000);
		
		WebElement s4 = driver.findElement(By.id("box4"));
		WebElement d4 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		a.dragAndDrop(s4, d4).build().perform();
		Thread.sleep(2000);
		
		WebElement s5 = driver.findElement(By.id("box5"));
		WebElement d5 = driver.findElement(By.xpath("//div[text()='South Korea']"));
		a.dragAndDrop(s5, d5).build().perform();
		Thread.sleep(2000);

		WebElement s6 = driver.findElement(By.id("box6"));
		WebElement d6 = driver.findElement(By.xpath("//div[text()='Sweden']"));
		a.dragAndDrop(s6, d6).build().perform();
		Thread.sleep(2000);

		WebElement s7 = driver.findElement(By.id("box7"));
		WebElement d7 = driver.findElement(By.xpath("//div[text()='United States']"));
		a.dragAndDrop(s7, d7).build().perform();
		Thread.sleep(2000);
		
		//minimize
		Dimension di = new Dimension(1000, 800);
		driver.manage().window().setSize(di);


	}

}
