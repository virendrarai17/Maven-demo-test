package com.qa.test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class demoTest2 {

	@Test
	public void testFB2(){
		System.out.println("Facebook is working expected");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	
	public void testGmail2(){
		System.out.println("Gmail is working as expected");
		int a=100;
		int b=260;
		Assert.assertEquals(360, a+b);
}
	@Test
	public void testGmail3(){
		System.out.println("Just check in my code in git");
	}
	@Test
	public void gitchanges(){
		System.out.println("Just change in my code in git");
	}

} 
