package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompletePage extends TestBase{


	@FindBy(xpath = "//span[@class='title']")private WebElement cheoutComplete;
	@FindBy(xpath = "//img[@class='pony_express']") private WebElement ponyLogo;
	@FindBy(id ="back-to-products") private WebElement backHome;
	@FindBy(xpath = "//h2[@class='complete-header']") WebElement thanksLable;
	public  CompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyCheckoutComplete()
	{
		return cheoutComplete.isDisplayed();
	}
	public boolean verifyPonyLogo()
	{
		return ponyLogo.isDisplayed();
	}
	public boolean verifyThanksLable()
	{
		return thanksLable.isDisplayed();
	}
	public String verifyBackHome()
	{
		backHome.click();
		return driver.getCurrentUrl();
	}
}
