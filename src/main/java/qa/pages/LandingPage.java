package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class LandingPage extends TestBase{

	//@FindBy(id="autocomplete")
	By suggestion = By.xpath("//div[@id='select-class-example']/fieldset/input");
	
	
	public void initializeElemetns(WebDriver driver)
	{
		PageFactory.initElements(driver, this);;
	}
	public WebElement getSugesstionBox()
	{
		//return suggestion;
		return driver.findElement(suggestion);
	}
	
	public void enterValueInSuggestion(String val, WebElement suggest)
	{
		if(suggest.isEnabled())
		{
			suggest.sendKeys(val);
			
		}
		else
		{
			System.out.println("SuggestionsBox not visible");
		}
	}
	
	public void verifyIfSuggestionsReturned(WebElement suggest)
	{
		Actions act = new Actions(driver);
		act.sendKeys(suggest, Keys.ENTER);
	}
}
