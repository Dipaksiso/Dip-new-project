package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.CheckoutPage2;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutPage2Test extends TestBase{

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage checkout;
	CheckoutPage2 chkPage2;
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		checkout = new CheckoutPage();
		chkPage2 = new CheckoutPage2();
		login.verifyLoginTo();
		invent.verifyYourCart();
		cart.verifyCheckoutBtn();
		checkout.verifyContBtn();
	}
	@Test(enabled = false)
	public void verifyCheckoutOverview()
	{
		boolean result = chkPage2.verifyCheckoutOverview();
		Assert.assertEquals(result, true);
		Reporter.log("The Checkout overview title = " + result);
	}
	@Test
	public void verifyLinksTest()
	{
		boolean result = chkPage2.verifyLinks();
		Assert.assertEquals(result, true);
		Reporter.log("multiple links are = " + result);
	}
	@Test(enabled = false)
	public void verifyFinishTest() throws Exception
	{
		String exptUrl = "https://www.saucedemo.com/checkout-complete.html";
		String actUrl = chkPage2.verifyFinish();
		Assert.assertEquals(exptUrl, actUrl);
	}
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(2000);
		driver.close();
	}
}
