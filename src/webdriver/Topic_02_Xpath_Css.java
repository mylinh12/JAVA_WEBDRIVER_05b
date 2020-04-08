package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Topic_02_Xpath_Css {
	WebDriver driver;

	@Test
	public void TC_01_CheckUrlAndTitle() {
		String homPageTilte = driver.getTitle();
		Assert.assertEquals(homPageTilte, "Guru99 Bank Home Page");
		
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://demo.guru99.com/v4/");
		
		System.out.println("Changed file!!");
	}
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
