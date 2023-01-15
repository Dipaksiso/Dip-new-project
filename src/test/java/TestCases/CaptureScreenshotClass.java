package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreenshotClass extends TestBase {

	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception 
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test(priority = 0 , groups = "Sanity" , enabled = false)
	public void verifyTitleTest()
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of the application = " + actTitle);
	}
	
	@Test(priority = 1)
	public void verifyCurrentUrlTest()
	{
		String expUrl = "https://www.saucedemo.com/point";
		String actUrl = login.verifyCurrentUrl();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("Current Url of the application = " + actUrl);

	}
	@Test(priority = -20 , enabled = false)
	public void verifyLoginLogoTest() 
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Login Logo of the application = " + result);

	}
	@Test(priority = -30 , enabled = false)
	public void verifyBotLogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
		Reporter.log("Bot Logo of the application = " + result);

	}
	
	@Test(priority = 98 , enabled = false)
	public void verifyLoginToTest() throws Exception
	{
		String exptTitle = "https://www.saucedemo.com/inventory.html";
		String actTitle = login.verifyLoginTo();
		Assert.assertEquals(exptTitle, actTitle);
		Reporter.log("Login To  the application = " + actTitle);

		
	}
	@Test(priority = 8 , enabled = false)
	public void verifyProductsTest() throws Exception
	{
		boolean result = login.verifyProducts();
		Assert.assertEquals(result, true);
		Reporter.log("Products of the application = " + result);

	}
	
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())
		{
//			System.out.println(ITestResult.FAILURE);
//			System.out.println(a.getStatus());
			UtilityMethod.screenShot(a.getName());
		}
		
		driver.close();
	}
}
