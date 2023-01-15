package Pages;

import java.util.LinkedList;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;//
import Utility.UtilityMethod;

public class InventoryPage extends TestBase{

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement optionBtn;
	@FindBy(xpath = "//div[@class='peek']") private WebElement peekLogo;
	@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement backpack;
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement tshirt;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement bikeLight;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sorting;
	@FindBy(id = "shopping_cart_container") private WebElement cart;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement footerRobot;
	@FindBy(xpath = "//div[@class='header_secondary_container']") private WebElement yourCart;
	@FindBy(xpath = "//a[@href=\"https://twitter.com/saucelabs\"]") private WebElement twitter;
	@FindBy(xpath = "//a[@href=\"https://www.facebook.com/saucelabs\"]") private WebElement facebook;
	@FindBy(xpath = "//a[@href=\"https://www.linkedin.com/company/sauce-labs/\"]") private WebElement linkdin;
	@FindBy(tagName = "a")private List<WebElement> Morelink;
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
	}
	public boolean verifyOptionBtn()
	{
		optionBtn.click();
		return optionBtn.isDisplayed();
	}
	public String addProduct() throws Exception
	{
		UtilityMethod.selectClass(sorting,"Name (A to Z)");
		Thread.sleep(1000);
		backpack.click();
		Thread.sleep(1000);
		tshirt.click();
		Thread.sleep(1000);
		bikeLight.click();
		cart.click();
		Thread.sleep(1000);
		return cart.getText();
	}
	
	public boolean verifyFooterRobot()
	{
		return footerRobot.isDisplayed();
	}
	public boolean verifyYourCart() throws Exception
	{
		addProduct();
		return yourCart.isDisplayed();
	}
	
	public boolean verifyMoreLink()  
	{
		for(int i=0;i<Morelink.size();i++) 
		{
			 String expStr = "Careers";
			 String actStr = Morelink.get(i).getText();		 
		if(expStr.equals(actStr))
		{
			Morelink.get(i).click();
			//Thread.sleep(2000);
			break;
		}
		}
		return Morelink.isEmpty();
	}	 

	public boolean verifyTwitterLink()
	{
//		twitter.click();
		return twitter.isDisplayed();
	}
	public boolean verifyFacebookLink()
	{
//		facebook.click();
		return facebook.isDisplayed();
	}
	public boolean verifyLinkdinLink()
	{
//		linkdin.click();
		return linkdin.isEnabled();
	}
}	
	
