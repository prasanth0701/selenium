package com.seleniumtesting;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Day_9_Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		//click the frame 1 button
		driver.switchTo().frame(0);
        WebElement button1 = driver.findElement(By.xpath("//button[@id='Click']"));
        button1.click();
        
        //to get the text
        String text1 = button1.getText();
        System.out.println(text1);
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement button2 = driver.findElement(By.xpath("//button[@id='Click1']"));
        button2.click();
        
        String text2 = button2.getAttribute("src");
        System.out.println(text2);
        
        driver.switchTo().defaultContent();
        
       List<WebElement>  findElements= driver.findElements(By.tagName("img"));
       int size = findElements.size();
       System.out.println(size);
        
        
        
		
		
		
	}

}
