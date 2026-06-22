package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstName;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLastName;
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
	@FindBy(xpath="//input[@type='checkbox'][@name='agree']") WebElement chkPolicy;
	@FindBy(xpath="//button[@type='submit']") WebElement btnContinue;
	@FindBy(xpath="//div[@id='content']/h1") WebElement msgConfirmation;
	
	public void setFirstName(String firstName)
	{
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		txtLastName.sendKeys(lastName);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void checkPolicy()
	{
		chkPolicy.click();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmationMsg()
	{
		try
		{
			return msgConfirmation.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
}
