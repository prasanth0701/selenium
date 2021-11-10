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

public class Day_6_Multiple_DropDown {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//select[@name='States']"));
		Select ccountry = new Select(country);
		
		
		List<WebElement> options = ccountry.getOptions();  //to get all the options
		System.out.println(options);                    // it's in computer language
		
		for (WebElement countries: options) {
			System.out.println("the countries in the list: "+countries.getText());
			
		}
		
		ccountry.selectByIndex(0);
		ccountry.selectByIndex(2);
		ccountry.selectByIndex(3);
		
		ccountry.selectByValue("Texas");
		ccountry.selectByVisibleText("Washington");
		
		ccountry.selectByIndex(7);
	
		WebElement firstSelectedOption = ccountry.getFirstSelectedOption();
		System.out.println("the first selceted country is: "+firstSelectedOption.getText());
		
		List<WebElement> allSelectedOptions = ccountry.getAllSelectedOptions();
		System.out.println("the selected options are: "+allSelectedOptions);
		
		ccountry.deselectByVisibleText("Washington");
		ccountry.deselectByValue("Texas");
		ccountry.deselectByIndex(0);//deselect may only used in multiselect dropdown.
		ccountry.deselectAll();
		
		
		 
		for (WebElement i : allSelectedOptions) {
			System.out.println(i.getText());
			
		}
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\multi_dd.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
	}
}
