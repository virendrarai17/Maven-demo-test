package com.qa.test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class demoTest {
	
		@Test
		public void testFB(){
			System.out.println("Facebook is working expected");
			int a=10;
			int b=20;
			Assert.assertEquals(30, a+b);
		}
		
		@Test
		
		public void testGmail(){
			System.out.println("Gmail is working as expected");
			int a=100;
			int b=260;
			Assert.assertEquals(360, a+b);
			
		}
}
