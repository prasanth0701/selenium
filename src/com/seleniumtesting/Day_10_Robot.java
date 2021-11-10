package com.seleniumtesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Day_10_Robot {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/register");
	
	WebElement gender = driver.findElement(By.id("gender-male"));
	gender.click();
	
	Actions a=new Actions(driver);
	
	WebElement fname = driver.findElement(By.id("FirstName"));
	a.click(fname).build().perform();
    fname.sendKeys("dhivin");
    
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_S);

    
    r.keyPress(KeyEvent.VK_R);
    r.keyRelease(KeyEvent.VK_R);

    
    r.keyPress(KeyEvent.VK_I);
    r.keyRelease(KeyEvent.VK_I);

    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    
    
    

	
	
	
}
}
