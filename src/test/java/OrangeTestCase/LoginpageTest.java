package OrangeTestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import OrangePage.LoginPage;

public class LoginpageTest  extends TestBase{

	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test(enabled = false)
	public void verifyLoginLogoTest() throws Exception
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyCurrentUrlTest()
	{
		String exptUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actUrl = login.verifyCurrentUrl();
		Assert.assertEquals(exptUrl, actUrl);
	}
	@Test(enabled = false)
	public void verifyLoginTest() 
	{
		boolean result = login.verifyLogin();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyMultipleLinksTest()
	{
		String expTitle ="OrangeHRM";
		String actTitle = login.verifyMultipleLinks();
		Assert.assertEquals(expTitle, actTitle);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
