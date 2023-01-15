package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod;

public class CheckoutPage2 extends TestBase {

	@FindBy(xpath = "//span[@class='title']")private WebElement cheoutOverview;
	@FindBy(xpath = "//div[@class='summary_info']//div") private WebElement ele;
	@FindBy(id ="finish") private WebElement finishBtn;
	public  CheckoutPage2()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyCheckoutOverview()
	{
		return cheoutOverview.isDisplayed();
	}
	public boolean verifyLinks()
	{
		//UtilityMethod.MultipleLinks(ele.findElements(By.xpath("//div[@class='summary_info']//div")));
		return ele.isDisplayed();
	}
	public String verifyFinish() throws Exception
	{
		finishBtn.click();
		return driver.getCurrentUrl();
	}
}
