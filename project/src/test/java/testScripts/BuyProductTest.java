package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.BaseClassTest;
import Generics.credentials;
import pom.LoginPageTest;

public class BuyProductTest extends BaseClassTest{


		
		WebDriver driver;
	
		
		@Test
		public void buyTop()
		{
		System.out.println("Driver in main Script");
			LoginPageTest login=new LoginPageTest(driver);
			login.loginToApp();
		
		driver.findElement(By.xpath("//*[@class='sf-with-ul' and @title='Women']")).click();
		
		
		WebElement w1=driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(w1).perform();
		
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		

		}
		

	

}
