
package com.seleniumtesting;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day_14_AdactinHotelProject {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("username")).sendKeys("prasanth35");
		driver.findElement(By.id("password")).sendKeys("9976114764");
		driver.findElement(By.id("login")).click();
		

		
		WebElement location = driver.findElement(By.id("location"));
		
		Select location1 = new Select(location);
		location1.selectByVisibleText("Melbourne");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hotel1 = new Select(hotel);
		hotel1.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select room1 = new Select(room);
		room1.selectByIndex(2);

		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select roomno1 = new Select(roomno);
		roomno1.selectByIndex(2);
		
		
		WebElement in = driver.findElement(By.id("datepick_in"));
		in.clear();
		Thread.sleep(2000);
		in.sendKeys("23/12/2021");
		

		WebElement out = driver.findElement(By.id("datepick_out"));
		out.clear();
		Thread.sleep(2000);
		out.sendKeys("27/12/2021");
		
		
		WebElement adultno = driver.findElement(By.id("adult_room"));
		Select adultno1 = new Select(adultno);
		adultno1.selectByValue("4");
		
		WebElement childno = driver.findElement(By.id("child_room"));
		Select childno1 = new Select(childno);
		childno1.selectByValue("2");
		

		driver.findElement(By.id("Submit")).click();
		
		
		driver.findElement(By.id("radiobutton_0")).click();

		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Prasanth");
		driver.findElement(By.id("last_name")).sendKeys("S");
		driver.findElement(By.id("address")).sendKeys("9n,kamal theatre road,chennai");
		driver.findElement(By.id("cc_num")).sendKeys("4568654856321756");
		
		//credit card
		WebElement typeofcc = driver.findElement(By.id("cc_type"));
		Select type = new Select(typeofcc);
		type.selectByIndex(1);
		
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		Select month = new Select(ccmonth);
		month.selectByIndex(1);
		
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		Select year = new Select(ccyear);
		year.selectByVisibleText("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("636");
		driver.findElement(By.id("book_now")).click();
		
		
		

		WebElement itiner = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		itiner.click();
		
	    //cancel order
		driver.findElement(By.xpath("//tr[3]//td[1]")).click();
		driver.findElement(By.xpath("//tr[4]//td[1]")).click();
		
		driver.findElement(By.name("cancelall")).click();
	   
		WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.alertIsPresent());
		
		Alert popup = driver.switchTo().alert();
		popup.dismiss();
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\adactin.png");
		FileUtils.copyFile(source, des);
		
       //logout
		//driver.findElement(By.id("logout")).click();

	}	

}
