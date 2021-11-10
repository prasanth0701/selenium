package com.seleniumtesting;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day_9_AutomationPracticeProject {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		
		//select 
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
		String title = driver.getTitle();
        System.out.println("The website title is: "+title);
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//img[@title='Blouse'])[1]")).click();
//		Thread.sleep(3000);
//       System.out.println("==========");
//        driver.switchTo().frame(0);
//        System.out.println("==========");
        
		
		WebElement clickcart = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]")); //add to cart
		 clickcart.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement proceed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Proceed to checkout']")));
		proceed.click();
//		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("email_create")).sendKeys("sppras95@gmail.com");  //email box
        driver.findElement(By.name("SubmitCreate")).click();
		
        WebDriverWait wait2 =new WebDriverWait(driver,30);
        WebElement gender = wait2.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        gender.click();
        
       // driver.findElement(By.id("id_gender1")).click();       //gender mr
        driver.findElement(By.id("customer_firstname")).sendKeys("praz");  //first name
        driver.findElement(By.id("customer_lastname")).sendKeys("sp");  //customer_lastname box
        driver.findElement(By.id("passwd")).sendKeys("55455455");  //password
        
        String titl1 = driver.getTitle();
        System.out.println(titl1);
        
        //DOB     //select[@id='days']
		WebElement date = driver.findElement(By.xpath("//select[@id='days']"));
		Select bdate=new Select(date);
		bdate.selectByIndex(8);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select bmonth = new Select(month);
		bmonth.selectByVisibleText("January ");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select byear = new Select(year);
		byear.selectByValue("1999");
		
		//address details  
		driver.findElement(By.id("company")).sendKeys("Jupiter private limited");  //company name

        driver.findElement(By.id("address1")).sendKeys("12B,muthalamman street");  
        driver.findElement(By.id("address2")).sendKeys("mount road");  
        driver.findElement(By.id("city")).sendKeys("chennai");  
        
        //state
        WebElement state = driver.findElement(By.id("id_state"));
        Select bstate = new Select(state);
        bstate.selectByVisibleText("New Jersey");
        
        //postcode
        driver.findElement(By.id("postcode")).sendKeys("65425");
        
        //additional information
        driver.findElement(By.id("other")).sendKeys("65824857552");
        
        driver.findElement(By.id("phone_mobile")).sendKeys("998754552");

        driver.findElement(By.id("alias")).sendKeys("12b,gandhi nagar");
        
        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(3000);
        
        //next level address
        driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]")).click();
  
        
        //shipping
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();      //check box

        WebElement proceedkey = driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]"));
        proceedkey.click();
        
        WebDriverWait wait1 = new WebDriverWait(driver,30);
         WebElement bankwire = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='bankwire']")));
         bankwire.click();
        
        
        //payment
        //driver.findElement(By.xpath("//a[@class='bankwire']")).click();
        
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        Thread.sleep(3000);

        
        WebElement slip = driver.findElement(By.xpath("//div[@class='box']"));
        String ss = slip.getText();
        System.out.println("Invoice for your product: "+ss);
  
        driver.manage().window().maximize();
        
        //javascript
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,500)", "");
        Thread.sleep(3000);

        //takesScreenshot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\autopractice.png");
        FileUtils.copyFile(source, des);




	}
	
	}


