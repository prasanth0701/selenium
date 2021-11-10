package com.seleniumtesting;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Day_13_WebTable {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("http://www.leafground.com/pages/table.html");
    	driver.manage().window().maximize();
    	
    //count no. of rows
     List<WebElement> rows = driver.findElements(By.tagName("Tr"));
    int rowcount = rows.size();
    System.out.println("The number of row in the table is: "+rowcount);
    
    //count no.of column
    List<WebElement> column = driver.findElements(By.tagName("Th"));
    int columncount = column.size();
    System.out.println("The number of column is :"+columncount);
    
    //find the element by using following keyword
    WebElement percent = driver.findElement(By.xpath("//td[normalize-space() = 'Learn to interact using Keyboard, Actions']//following::td[1]"));
    System.out.println(percent.getText());	
    
    WebElement week = driver.findElement(By.xpath("//td[normalize-space() = 'Learn XPath']//following::td[3]"));
    System.out.println(week.getText());
    
    WebElement remarks = driver.findElement(By.xpath("//td[normalize-space() = 'Gopi']//following::td[1]"));
    System.out.println(remarks.getText());
    
    WebElement nxtheading = driver.findElement(By.xpath("//th[normalize-space() = 'Progress']//following::th[1]"));
    System.out.println(nxtheading.getText());  //heading
    
    driver.findElement(By.xpath("//td[normalize-space() = '100%']//following::td[1]")).click();
    
    
    //compare and select the smallest element
    List<WebElement> allvalues = driver.findElements(By.xpath("//td[2]"));
    
    List<Integer> allvalueslist = new ArrayList<Integer>();
    
    for(WebElement i:allvalues) {
    	
    	String allindividualvalue = i.getText().replace("%", "");
    	int parseIntvalue = Integer.parseInt(allindividualvalue);    //convert string into int
    	allvalueslist.add(parseIntvalue);
    	
    }
    System.out.println(allvalueslist);
    Integer  minvalue = Collections.min(allvalueslist);
    System.out.println(minvalue);
    
    String minvaluestring = Integer.toString(minvalue)+"%";
    System.out.println(minvaluestring);
    
    String finalXpath = "//td[normalize-space()="+"\""+ minvaluestring +"\""+"]"+"//following::td[1]";
    System.out.println(finalXpath);
    
    WebElement check = driver.findElement(By.xpath(finalXpath));
    Thread.sleep(2000);
    check.click();
    
    
    
    
    
    
    }

}
