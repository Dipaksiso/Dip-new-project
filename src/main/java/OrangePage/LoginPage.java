package OrangePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.UtilityMethod;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//div[@class='orangehrm-login-logo']") private WebElement loginLogo;
	@FindBy(xpath = "//input[@name='username']") private WebElement usernameTextbox;
	@FindBy(xpath = "//input[@name='password']") private WebElement passTextbox;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']") private WebElement dashboardLabel;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLoginLogo() throws Exception
	{
		Thread.sleep(5000);
		return loginLogo.isDisplayed();
	}
	public String verifyCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	public boolean verifyLogin() 
	{
		usernameTextbox.sendKeys("Admin");
		passTextbox.sendKeys("admin123");
		loginBtn.click();
		return dashboardLabel.isDisplayed();
	}
	public String verifyMultipleLinks()
	{
		UtilityMethod.MultipleLinks(driver.findElements(By.tagName("a")));;
		return driver.getTitle();
		
	}
}
