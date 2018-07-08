package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public static WebDriver driver;
	
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By verifyFeaturedCourse = By.xpath("//*[@id=\"content\"]/div/div/h2");
	By verifyFaturedCourse1 = By.xpath("//*[@id=\"content\"]/div/div/h2");
	
	
	//*[@id="content"]/div/div/h2
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement verifyFaturedCourse()
	{
		return driver.findElement(verifyFeaturedCourse);
	}
	
	public WebElement verifyFaturedCourse1()
	{
		return driver.findElement(verifyFaturedCourse1);
	}
	
}
