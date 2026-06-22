package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	public String randomString()
	{
		return RandomStringUtils.randomAlphabetic(5);
	}
	
	public String randomNumber()
	{
		return RandomStringUtils.randomNumeric(10);
	}
	
	public String randomAplphaNumeric()
	{
		return RandomStringUtils.randomAlphabetic(5)+"@"+RandomStringUtils.randomNumeric(2);
	}

}
