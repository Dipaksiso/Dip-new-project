package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception 
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.verifyLoginTo();
		
	}
	@Test(groups = "Smoke")
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyOptionBtnTest()
	{
		boolean result = invent.verifyOptionBtn();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		Assert.assertEquals(result, "3");
	}
	@Test(enabled = false)
	public void verifyFooterRobotTest()
	{
		boolean result = invent.verifyFooterRobot();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyYourCartTest() throws Exception
	{
		boolean result = invent.verifyYourCart();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyMoreLinkTest() 
	{
		boolean result = invent.verifyMoreLink();
		Assert.assertEquals(result,false);
	}
	@Test
	public void verifyTwitterLinkTest()
	{
		boolean result = invent.verifyTwitterLink();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyFacebookLinkTest()
	{
		boolean result = invent.verifyFacebookLink();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyLinkdinLinkTest()
	{
		boolean result = invent.verifyLinkdinLink();
		Assert.assertEquals(result, true);
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
}
