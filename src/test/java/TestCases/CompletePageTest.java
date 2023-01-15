package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.CheckoutPage2;
import Pages.CompletePage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CompletePageTest extends TestBase {

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutPage checkout;
	CheckoutPage2 chkPage2;
	CompletePage complt;
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		checkout = new CheckoutPage();
		chkPage2 = new CheckoutPage2();
		complt = new CompletePage();
		login.verifyLoginTo();
		invent.verifyYourCart();
		cart.verifyCheckoutBtn();
		checkout.verifyContBtn();
		chkPage2.verifyFinish();
	}
	@Test(enabled = false)
	public void verifyCheckoutCompletTest ()
	{
		boolean result = complt.verifyCheckoutComplete();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void verifyPonyLogoTest()
	{
		boolean result = complt.verifyPonyLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyThanksLableTest()
	{
		boolean result = complt.verifyThanksLable();
		Assert.assertEquals(result, true);
		System.out.println(complt.verifyThanksLable());
	}

	@Test(enabled = false)
	public void verifyBackHomeTest()
	{
		String exptUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = complt.verifyBackHome();
		Assert.assertEquals(exptUrl, actUrl);
	}
	@AfterMethod
	public void closeBrowser() throws Exception
	{
		Thread.sleep(1000);
		driver.close();
	}
}
