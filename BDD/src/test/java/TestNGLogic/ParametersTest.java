package TestNGLogic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Parameters("browser")
	@Test
	public void testMethod(String browser)
	{
		System.out.println(browser);
	}
}
