package com.seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_7_AlertWithText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		
		Thread.sleep(3000);
		
		Alert msgbox = driver.switchTo().alert();
		msgbox.sendKeys("Welcome to Selenium");
		msgbox.accept();
		
		WebElement enteredtext = driver.findElement(By.id("demo1"));
		System.out.println("the entered text in the text box is: "+enteredtext);
		String text = enteredtext.getText();
		System.out.println(text);
		
		String substring = text.substring(6,25);
		System.out.println(substring);
		
		
		
	}

}
