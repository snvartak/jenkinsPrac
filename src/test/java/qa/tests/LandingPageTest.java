package qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.LandingPage;

public class LandingPageTest extends TestBase{

	LandingPage l = new LandingPage();
	
	
	@BeforeClass
	public void setUp() throws IOException
	{
		initializeDriver();	
	}
	
	@Test(priority=1)
	public void testTitle() throws IOException
	{
		String title = l.titleGetter();
		if(title.equalsIgnoreCase("Practice Page"))
		{
			System.out.println("Title : " + title + " is correct!!");
			AssertJUnit.assertTrue(true);
		}
		else
		{
			System.out.println("Title : " + title + " is not correct!!");
			AssertJUnit.assertTrue(false);	
		}
	}
	
	@Test(priority=2)
	public void getIndiaSuggestion()
	{
		WebElement s = l.getSugesstionBox();
		l.enterValueInSuggestion("Ind", s);
		l.verifyIfSuggestionsReturned(s);
	}
	
}
