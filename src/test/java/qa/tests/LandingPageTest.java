package qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.LandingPage;

public class LandingPageTest extends TestBase{

	LandingPage l = new LandingPage();
	@Test
	public void testTitle() throws IOException
	{
		initializeDriver();
		System.out.println("Title : " + driver.getTitle());	
	}
	
	@Test
	public void getIndiaSuggestion()
	{
		//l.initializeElemetns(driver);
		WebElement s = l.getSugesstionBox();
		l.enterValueInSuggestion("Ind", s);
		l.verifyIfSuggestionsReturned(s);

	}
	
}
