package TestNGLogic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderAnnotations {
	
	@Test
	public void testMethod()
	{
		System.out.println("Test Method");
	}
	
	@Test
	public void newTestMethod() {
		System.out.println("New Test Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
}
