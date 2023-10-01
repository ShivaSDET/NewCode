package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class SearchPage extends TestBase{
	
	@FindBy(how = How.ID, using="")
	private WebElement searchtxt;
	
	@FindBy(how = How.CSS, using="")
	private WebElement launchbtn;
	
	public SearchPage()
	{
		super();
		PageFactory.initElements(driver, SearchPage.class);
	}
}
