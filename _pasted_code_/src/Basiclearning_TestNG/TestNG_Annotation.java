package Basiclearning_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {

//	@BeforeSuite
//	public void beforesuite() {
//		
//		System.out.println("This is before Suite annotaion");
//	
//	}
//	@BeforeTest
//    public void beforeTest() {
//		
//		System.out.println("This is before Test annotaion");
//	
	//}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("This is before class annotaion");
	
	}
	
	@BeforeMethod 
public void beforeMethod() {
		
		System.out.println("This is BeforeMethod annotaion");
	
	}
	
	
	@Test
public void LoginTest() {
		
		System.out.println("This is login annotaion");
	
	}
	
	
	@AfterMethod
    public void afterMethod() {
		
		System.out.println("This is after Method annotaion");
	
	}
	
//	@AfterClass
//	
//public void afterClass() {
//		
//		System.out.println("This is after Class annotaion");
//	
//	}
//	
//	@AfterTest
//public void aftertest() {
//		
//		System.out.println("This is after Test annotaion");
//	
//	}
	
	@AfterSuite
public void afterSuite() {
		
		System.out.println("This is after Suite annotaion");
	
	}
	
	
}
