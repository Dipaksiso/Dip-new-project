package OrangeTestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import OrangePage.DashboardPage;
import OrangePage.LoginPage;

public class DashboardPageTest extends TestBase {

	LoginPage login;
	DashboardPage dash;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		dash = new DashboardPage();
		login.verifyLogin();
	}
	
	@Test(enabled = false)
	public void verifyCurrentUrlTest() throws Exception
	{
		String exptUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actUrl = dash.verifyCurrentUrl();
		Assert.assertEquals(exptUrl, actUrl);
	}
	@Test(enabled = false)
	public void verifyPichartLogoTest() throws Exception
	{
		boolean result = dash.verifyPichartLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyTitleTest()
	{
		String exptTitle = "OrangeHRM";
		String actTitle = dash.verifyTitle();
		Assert.assertEquals(exptTitle, actTitle);
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}
}
