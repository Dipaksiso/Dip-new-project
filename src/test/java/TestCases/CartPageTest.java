package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		login.verifyLoginTo();
		invent.verifyYourCart();
	}
	@Test(enabled = false)
	public void verifyCurrentUrlTest()
	{
		String exptUrl = "https://www.saucedemo.com/cart.html";
		String actUrl = cart.verifyCurrentUrl();
		Assert.assertEquals(exptUrl, actUrl);
	}
	@Test(enabled = false)
	public void verifyRemoveProductTest() throws Exception
	{
		boolean result = cart.verifyRemoveProduct();
		Assert.assertEquals(result, true);
				
	}
	@Test(enabled = false)
	public void  verifyQtyTest() throws Exception
	{
		boolean result = cart.verifyQty();
		Assert.assertEquals(result, true);
				
	}
	@Test(enabled = false)
	public void verifyDescription () throws Exception
	{
		boolean result = cart.verifyDescription();
		Assert.assertEquals(result, true);
				
	}
	@Test
	public void verifyCheckoutBtnTest() throws Exception
	{
		String exptUrl = "https://www.saucedemo.com/checkout-step-one.html";
		String actUrl = cart.verifyCheckoutBtn();
		Assert.assertEquals(exptUrl, actUrl);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
