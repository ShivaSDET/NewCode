package Pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//nav[@aria-label=\"Primary Navigation\"]//ul//li[3]")
	private WebElement jobsIcon;
	
	@FindBy(xpath="//input[@aria-label=\"Search by title, skill, or company\"][1]")
	private WebElement searchSkill;
	
	@FindBy(xpath="//div[@id='search-reusables__filters-bar']/div")
	private WebElement allFiltersbtn;
	
	public HomePage()
	{
		super(); 
		PageFactory.initElements(driver, HomePage.class);
	}

	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void searchJobs()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(jobsIcon)).click();
		
		searchSkill.sendKeys(prop.getProperty("input"));
		searchSkill.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(allFiltersbtn)).click();
	}
}
