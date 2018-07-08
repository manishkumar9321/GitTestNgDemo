package TestInstitute;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.base;

public class ValidateTitle extends base{

	private static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilizedata() throws IOException
	{
		driver = initilizeDriver();
		log.info("Drivers are initilize");
		driver.get(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
	}
		
	@Test()
	public void basePageNavigation() throws IOException
	{
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.verifyFaturedCourse().getText(), "FEATURED COURSES");
	
		Assert.assertTrue(lp.verifyFaturedCourse1().isDisplayed());

	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
}
