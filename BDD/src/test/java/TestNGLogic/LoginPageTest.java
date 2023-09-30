package TestNGLogic;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import util.TestUtil;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
		String actualTitle = loginPage.validateLoginPageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, TestUtil.loginPage_Title);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
