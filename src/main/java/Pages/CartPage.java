package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{

	@FindBy(id = "remove-sauce-labs-backpack") private WebElement backpackRemove;
	@FindBy(id = "remove-sauce-labs-bike-light") private WebElement bikelightremove;
	@FindBy(id = "shopping_cart_container") private WebElement cart;
	@FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement qty;
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement despcription;
	@FindBy(id = "checkout") private WebElement chekoutBtn;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	public boolean verifyRemoveProduct() throws Exception
	{
		backpackRemove.click();
		Thread.sleep(2000);
		bikelightremove.click();
		Thread.sleep(2000);
		cart.click();
		return cart.isDisplayed();
	}
	public boolean verifyQty()
	{
		return qty.isDisplayed();
	}
	public boolean verifyDescription()
	{
		return despcription.isDisplayed();
	}
	public String verifyCheckoutBtn() throws Exception
	{
		chekoutBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
}
