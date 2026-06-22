package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']") WebElement myAccountLink;
	@FindBy(xpath="//a[text()='Register']") WebElement registerLink;
	@FindBy(xpath="//h3") WebElement featuredTxt;
	
	public void clickMyAccountLink()
	{
		myAccountLink.click();
	}
	
	public void clickRegisterLink()
	{
		registerLink.click();
	}
	
	public String getFeaturedText()
	{
		return featuredTxt.getText();
	}

}
