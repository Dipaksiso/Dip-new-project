package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutPage extends TestBase{

	@FindBy(id = "first-name") private WebElement firstName;
	@FindBy(id = "last-name") private WebElement lastName;
	@FindBy(id = "postal-code") private WebElement postalCode;
	@FindBy(id = "continue") private WebElement contBtn;
	@FindBy(xpath = "//span[@class='title']")private WebElement cheoutTitle;
	public  CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyContBtn() throws Exception
	{
		firstName.sendKeys("abc");
		Thread.sleep(1000);
		lastName.sendKeys("xyz");
		Thread.sleep(1000);
		postalCode.sendKeys("12456");
		Thread.sleep(1000);
		contBtn.click();
		return driver.getCurrentUrl();
	}
	public boolean verifyChecoutTitle()
	{
		return cheoutTitle.isDisplayed();
	}
	
	
	
	
	
	
}
