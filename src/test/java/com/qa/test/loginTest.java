package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class loginTest {
   WebDriver driver;
   Logger log=Logger.getLogger(loginTest.class);
   
   // What is log: Capturing info/activity at the time of program execution
   //type of logs
   // info, warn, fatal, debug
   @BeforeMethod
   public void setUp(){
	   System.setProperty("webdriver.firefox.marionette", "C:\\Program Files\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    log.info("Launching Browser");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.freecrm.com");
		log.info("Entering URL");
		log.warn("Hey its just a warning message");
		log.debug("its just a debug message");
		log.fatal("its a fatal error message");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		//driver.findElement(By.name("submit")).click();
   }
   
   @Test(priority=1)
   public void getFreeCrmTitleTest(){
	   String title=driver.getTitle();
	   System.out.println(title);
	   log.info("CRM title is--------> : "+ title);
	   Assert.assertEquals("CRM Title is: ", "#1 Free CRM software in the cloud for sales and service", title);
   }
   
   @Test (priority=2)
   public void getLogoTest(){
	  boolean b= driver.findElement(By.xpath("//img[@alt='free crm logo']")).isDisplayed();
	  Assert.assertTrue(b);
   }
   
   @AfterMethod
   public void tearDown(){
	   driver.quit();
   }
}
