package com.seleniumtesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2_NavigateMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		//driver.switchTo();
		
		
		driver.navigate().to("https://www.fb.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.instagram.com/");
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		driver.close();
		driver.quit();           //close=it's used to close the tap
	}                            //quit=it's used to close the browser

}
