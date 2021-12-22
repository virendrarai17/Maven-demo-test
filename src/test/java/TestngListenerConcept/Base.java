package TestngListenerConcept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;
	
	public static void initialize(){
		System.setProperty("webdriver.firefox.marionette", "C:\\Program Files\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.co.in/");
	}
	
	public void failed(String testMethodName){
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	             try {
					FileUtils.copyFileToDirectory(srcFile, new File("C:/Users/vicky-pc/workspaceLuna/MavenDemoTest/"
	             +"screenShot/"+testMethodName+".jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	}
}
