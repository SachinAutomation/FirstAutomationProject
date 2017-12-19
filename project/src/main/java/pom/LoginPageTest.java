package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.credentials;

public class LoginPageTest implements credentials {
	
	WebDriver driver;
	
	public LoginPageTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
  
	@FindBy(id="email")
	public static WebElement userName;
	
	@FindBy(id="passwd")
	public static WebElement pwd;
	
	@FindBy(id="SubmitLogin")
	public static  WebElement submit;
	
	@FindBy(xpath="//*[@class='login']")
	public static  WebElement loginButton;
	
	
	
	public void loginToApp()
	{
	loginButton.click();
	userName.sendKeys(uName);
	pwd.sendKeys(passd);
	submit.click();
	}
	
	
	
}
