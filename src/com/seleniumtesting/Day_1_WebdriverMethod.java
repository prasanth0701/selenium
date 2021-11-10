package com.seleniumtesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day_1_WebdriverMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
        driver.get("https://www.linkedin.com/");
        
        String title = driver.getTitle();
        System.out.println(title);
        
        String Url = driver.getCurrentUrl();
        System.out.println(Url);
        
        String source = driver.getPageSource();
        System.out.println(source);
        
        Thread.sleep(5000);
        
        
	}

}
