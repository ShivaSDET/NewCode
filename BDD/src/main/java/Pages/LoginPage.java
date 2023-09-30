package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	//public WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signInbtn;
	
	//Initializing the page Objects
	public LoginPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String username, String pwd)
	{
		userName.sendKeys(username);
		password.sendKeys(pwd);
		signInbtn.click();
		return new HomePage();
	}
}
