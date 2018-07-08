package TestInstitute;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.base;

public class HomePage extends base{
	
	private static Logger log = LogManager.getLogger(base.class.getName());

	
	@BeforeTest
	public void initilizedata() throws IOException
	{
		driver = initilizeDriver();
		log.info("Drivers are initilize");

	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password, String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		log.info("url triggered");
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		log.info("button clicked");
		LoginPage lpa = new LoginPage(driver);
		lpa.emailAddress().sendKeys(username);
		lpa.password().sendKeys(password);
		log.info("data set sucessfully");

		System.out.println(text);
		lpa.login().click();
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[2][3];
		obj[0][0]="manishkumar9321@gmail.com";
		obj[0][1]="manishkumar9321@gmail.com";
		obj[0][2]="manishkumar9321@gmail.com";
		
		obj[1][0]="manishkumar9321fffff@gmail.com";
		obj[1][1]="manishkumar9321@gmail.com";
		obj[1][2]="manishkumar9321@gmail.com";
		
		return obj;
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		
	}
	
}
