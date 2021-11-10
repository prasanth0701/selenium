 package com.seleniumtesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_5_Single_Dropdown {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	Thread.sleep(5000);
	
	WebElement sd = driver.findElement(By.xpath("//select[@id='select-demo']"));
	Select sd1 = new Select(sd);
	sd1.selectByIndex(1);
	
	boolean multiple = sd1.isMultiple();
	System.out.println("multiple or not: "+multiple);

	WebElement option = sd1.getFirstSelectedOption();
	System.out.println("The selected option is: "+option.getText());
	
	 List<WebElement> sd2 = sd1.getOptions();
	 System.out.println("The days are: ");
	for (WebElement i : sd2) {
		System.out.println(i.getText());
		
	}
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\single_dd.png");
	FileUtils.copyFile(source,destination);
}
}
