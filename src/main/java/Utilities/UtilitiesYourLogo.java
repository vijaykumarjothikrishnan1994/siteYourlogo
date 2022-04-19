package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import Base.BaseYourLogo;

public class UtilitiesYourLogo extends BaseYourLogo{
	
	
	public void Global_Wait(int enter_wait ) {
		
		try {
			Thread.sleep(enter_wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void takeScreenShot(String ScrennshotfileName)
	{
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File ScrFile=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(ScrFile, new File("C:\\Users\\Vijay Krishnan\\Desktop\\Software\\New Location\\YourLogo\\ScreenShots\\"+ScrennshotfileName+".png"));
			System.out.println("Screen shots taken sucessfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
