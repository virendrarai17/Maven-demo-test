package TestngListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(customListeners.class)
public class screenShotTest extends Base {

	
	@BeforeMethod
	public void setUp(){
		initialize();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void takeScreenShotTest(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenShotTest1(){
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void takeScreenShotTest2(){
		Assert.assertEquals(false, true);
	}
}
