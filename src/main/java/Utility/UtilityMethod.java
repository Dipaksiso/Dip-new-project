package Utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;

public class UtilityMethod  extends TestBase{

	
	public static void selectClass(WebElement ele,String option)
	{
		Select s= new Select(ele);
		s.selectByVisibleText(option);	
	}

	public static void MultipleLinks(List<WebElement> ele)
	{
		for(int i=0;i<ele.size();i++)
			System.out.println(ele.get(i).getText());
//		 for(int i=0;i<ele.size();i++) {
//			 String expStr = "FINISH";
//			 String actStr = ele.get(i).getText();		 
//		if(expStr.equals(actStr))
//		{
//			ele.get(i).click();
//			break;
//		}
//		
//	}
	}
	public static void screenShot( String Name) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Dipak\\eclipse-workspace\\Dip_Project\\ScreentShot/"+Name+".jpeg");
	    FileHandler.copy(source, dest);
	}
	
}
