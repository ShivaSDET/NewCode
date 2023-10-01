package TestNGLogic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="getData")
	public void testExecution(String name, String surname)
	{
		System.out.println(name+" "+surname);
	}

	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
			{"Shivannarayana","Kundurthi"},
			{"Bhulakshmi","Kundurthi"},
			{"Jeshvick","Kundurthi"},
			{"Vedhanshi","Kundurthi"}
				};
	}
}
