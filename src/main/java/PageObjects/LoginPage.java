package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;
	
	
	By emailAddress = By.cssSelector("input[id='user_email']");
	By password = By.cssSelector("input[id='user_password']");
	By login = By.cssSelector("input[value='Log In']");	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement emailAddress()
	{
		return driver.findElement(emailAddress);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement login()
	{
		return driver.findElement(login);
	}
	
}
