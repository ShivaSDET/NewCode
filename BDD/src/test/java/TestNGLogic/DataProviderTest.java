package TestNGLogic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@Test(dataProvider = "getData")
	public void testMethod(String name, String surname)
	{
		System.out.println(name+" "+surname);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
			{"Shiva","K"},
			{"Bhulakshmi","K"},
			{"Jeshvick","K"},
			{"Vedhanshi","K"}
				};
	}
}
