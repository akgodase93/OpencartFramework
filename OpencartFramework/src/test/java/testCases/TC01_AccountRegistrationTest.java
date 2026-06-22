package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_AccountRegistrationTest extends BaseClass
{
	
	
	@Test
	public void verifyAccountRegistration()
	{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccountLink();
		hp.clickRegisterLink();
		
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		arp.setFirstName("John");
		arp.setLastName("Abraham");
		arp.setEmail("john@abraham.com");
		arp.setPassword("John@123");
		arp.checkPolicy();
		arp.clickContinue();
		String confirmationMsg=arp.getConfirmationMsg();
		
		Assert.assertEquals(confirmationMsg, "Your Account Has Been Created!");
		
	}
	
	
}
