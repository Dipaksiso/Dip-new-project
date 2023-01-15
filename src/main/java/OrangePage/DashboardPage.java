package OrangePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod;

public class DashboardPage extends TestBase{

	@FindBy(xpath = "//p[text()='Employee Distribution by Sub Unit']") private WebElement pichartLogo;
//	@FindBy(xpath = "//input[@name='username']") private WebElement usernameTextbox;
//	@FindBy(xpath = "//input[@name='password']") private WebElement passTextbox;
//	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") private WebElement loginBtn;
//	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']") private WebElement dashboardLabel;
//    @FindBy(xpath ="//div[@class='orangehrm-login-footer-sm']") private WebElement links;
	public  DashboardPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCurrentUrl() throws Exception
	{
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	public boolean verifyPichartLogo() throws Exception
	{
		Thread.sleep(2000);
	    return pichartLogo.isDisplayed();
	}
	public String verifyTitle()
	{
		UtilityMethod.MultipleLinks(driver.findElements(By.tagName("a")));
		return driver.getTitle();
	}
	

}
