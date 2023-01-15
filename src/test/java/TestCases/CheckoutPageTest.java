package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutPageTest extends TestBase{

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage checkout;
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		checkout = new CheckoutPage();
		login.verifyLoginTo();
		invent.verifyYourCart();
		cart.verifyCheckoutBtn();
	}
	@Test
	public void verifyContBtn() throws Exception
	{
		String excptUrl = "https://www.saucedemo.com/checkout-step-two.html";
		String actUrl = checkout.verifyContBtn();
		Assert.assertEquals(excptUrl, actUrl);
	}
	@Test
	public void verifyChecoutTitleTest()
	{
		boolean result = checkout.verifyChecoutTitle();
		Assert.assertEquals(result, true);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}


}
