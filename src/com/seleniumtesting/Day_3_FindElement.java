package com.seleniumtesting;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Day_3_FindElement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		WebElement username = driver.findElement(By.id("session_key"));
		username.sendKeys("kjm@gmail.com");
		
		WebElement userpassword = driver.findElement(By.id("session_password"));
		userpassword.sendKeys("151525");
		
		WebElement button = driver.findElement(By.className("sign-in-form__submit-button"));
		button.click();
		

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot//fblogin.png");
		FileUtils.copyFile(source,destination);	
	
		
		
	}
}
