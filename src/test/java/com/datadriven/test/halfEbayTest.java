package com.datadriven.test;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.testUtil;

public class halfEbayTest {
 WebDriver driver;
 
 @BeforeMethod
 public void setUp(){
	 System.setProperty("webdriver.firefox.marionette", "C:\\Program Files\\geckodriver.exe");
	    driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
}
 @DataProvider
 public Iterator<Object[]> getTestData(){
	 ArrayList<Object[]> testData= testUtil.getDataFromExcel();
	 return testData.iterator();
 }
 
 
 @Test(dataProvider="getTestData")
 public void halfEbayTest(String UserID, String Password, String ConfirmPassword, String SecurityQuestion){
	 driver.findElement(By.id("userRegistrationForm:userName")).sendKeys(UserID);
	 driver.findElement(By.id("userRegistrationForm:password")).sendKeys(Password);
	 driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys(ConfirmPassword);
	 driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys(SecurityQuestion);
 }
 
 @AfterMethod
 public void tearDown(){
	 driver.quit();
 }
}