package Generics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClassTest implements credentials {
	

	
	WebDriver driver;
    @BeforeMethod
    
    public void beforeMethod() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\SampleProject\\project\\resources\\chromedriver.exe");
    	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("browser launched");
	}
    
    
    @AfterMethod
    public void afterMethod()
    {
    	
    	driver.quit();
    }

}
