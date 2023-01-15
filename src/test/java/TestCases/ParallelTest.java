package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	@Test
	public void test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecharge.in/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test2() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test3() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test4() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test5() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		Thread.sleep(2000);
		driver.close();
	}

	
}
