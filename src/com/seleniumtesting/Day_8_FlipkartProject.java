package com.seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_8_FlipkartProject {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		// ElementClickInterceptedException(the element is obscured we cann't able to find)	
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hair comb");  //for to click search box
		driver.findElement(By.xpath("//button[@type='submit']")).click();//click search key
		Thread.sleep(5000);
		
		
        driver.findElement(By.xpath("//a[text()='Beauty and Grooming'][1]")).click();
        Thread.sleep(3000);
        
        WebElement minamount = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
        Select min=new Select(minamount);
        min.selectByIndex(3);
        
        //driver.findElement(By.xpath("(//option[@value='100'])[1]")).click();
        
        WebElement max = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
        Select maxamount = new Select(max);
        maxamount.selectByValue("1500");
        
        Thread.sleep(5000);
        
        
        
        //maxamount.deselectByValue("1500");   not possible
        //java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
    	
        
        //driver.findElement(By.xpath("(//option[@value='200'])[2]")).click();
       
        
        //if want to change the selected option you should use this method
        WebElement mini = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
        Select minii=new Select(mini);
        minii.selectByIndex(0);
        
        driver.findElement(By.xpath("(//img[@height='21'])[1]")).click(); //flipkart assured
     Thread.sleep(3000);
        //brand are selected below
        driver.findElement(By.xpath("//div[contains(text(),'K')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'Joy')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(text(),'NutriGlow')]")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//span[contains(text(),'720')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[contains(text(),'AARI')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Aamivi')]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[text()='F']")).click();
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("//div[text()='FeelFree']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='feelhigh']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kai");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Kai']")).click();
        
        
        
        
       
        
		
		
	}



}
