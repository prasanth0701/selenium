package com.seleniumtesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_13_SmallWebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/table.html");

		// find number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		System.out.println(rows.size());

		// find column
		List<WebElement> column = driver.findElements(By.xpath("//th"));
		System.out.println(column.size());

		// no.of data in the webtable
		List<WebElement> data = driver.findElements(By.xpath("//td"));
		System.out.println(data.size());

		// get preceding value
		WebElement previousvalue = driver.findElement(By.xpath("//td[normalize-space()='100%']//preceding::td[1]"));
		System.out.println(previousvalue.getText());

		WebElement next = driver.findElement(By.xpath("//td[normalize-space()='100%']//following::td[1]"));
		next.click();
		
		//compare the percentage data and find small data
		
		List<WebElement> values = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> valueslist = new ArrayList<Integer>();
		
		for(WebElement i:values) {
			String valuetext = i.getText().replace("%", "");
			int valueInt = Integer.parseInt(valuetext);
			valueslist.add(valueInt);
			
		}
		Integer minvalue = Collections.min(valueslist);
		System.out.println(minvalue);
		
		String stringvalue = Integer.toString(minvalue)+"%";
		System.out.println(stringvalue);
		
		////td[normalize-space='20%']//following::td[1]
		String finalXpath="//td[normalize-space()="+"\""+ stringvalue +"\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);	
		
		WebElement check = driver.findElement(By.xpath(finalXpath));
	    Thread.sleep(2000);
	    check.click();
	    

	}

}
