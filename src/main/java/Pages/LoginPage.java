package Pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase{

	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usernameTextBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passTextBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//span[text()='Products']") private WebElement loginSucceses;
	//constructor is to initialize the element of the page
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();
	}
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public String verifyCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyLoginTo() throws Exception 
	{
		usernameTextBox.sendKeys(ReadData.readExcelData(0, 0));
		//usernameTextBox.sendKeys("standard_user");
		Thread.sleep(1000);
		//passTextBox.sendKeys(ReadData.readPrpertyFile("password"));
		passTextBox.sendKeys(ReadData.readExcelData(1, 0));
	//	passTextBox.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	public boolean verifyProducts() throws Exception
	{
		verifyLoginTo();
		return loginSucceses.isDisplayed();
	}
}