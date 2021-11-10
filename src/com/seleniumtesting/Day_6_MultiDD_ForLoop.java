package com.seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Day_6_MultiDD_ForLoop {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement c = driver.findElement(By.xpath("//select[@name='States']"));
		Select c1 = new Select(c);
		List<WebElement> alloptions = c1.getOptions();

		// to find size
		int size = alloptions.size();
		System.out.println("the number of option are; " + size);
		System.out.println("_______________");

		System.out.println("the selected option are: ");

		for (int i = 0; i < size; i++) {
			if (i == 0 | i == 2 | i == 5 | i == 10) {

				c1.selectByIndex(i);

			}
		}

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\multi2.png");
			FileUtils.copyFile(source, des);
			
			System.out.println("-------------------------");

			WebElement firstSelectedOption = c1.getFirstSelectedOption();
			System.out.println("the first selected option is :" + firstSelectedOption.getText());
			
			List<WebElement> allSelectedOptions = c1.getAllSelectedOptions();
			System.out.println(allSelectedOptions);
			
			for (WebElement i1:allSelectedOptions) {
				System.out.println("the selected option are :"+i1.getText());
				
			}

		}

	}


