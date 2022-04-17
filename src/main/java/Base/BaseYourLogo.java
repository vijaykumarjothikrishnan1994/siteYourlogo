package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Validation.ValidateElements;

public class BaseYourLogo {
	
	public WebDriver driver;
	FileReader file;
	Properties prob;
	ValidateElements ObjectValidateElements;
	public BaseYourLogo() {
		// TODO Auto-generated constructor stub
		
		 try {
				file=new FileReader("C:\\Users\\Vijay Krishnan\\Desktop\\Software\\New Location\\YourLogo\\ConfigureData\\loadData.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 prob=new Properties();
			try {
				prob.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		
	}
	
	
	public void Initialize() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vijay Krishnan\\Desktop\\Software\\Driver\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver(option);
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		System.out.println("Browser Gonna  launch the following website :"+prob.getProperty("URL"));
		driver.get(prob.getProperty("URL"));
		System.out.println("Application lauched");
		
		 ObjectValidateElements=new ValidateElements();
		 
	//	ObjectValidateElements.VerifyPageTitle();
		
		
		
	}
	
	public void Close_driver() {
		
		driver.close();
		
	}
public void Close_quit() {
		
		driver.quit();
		
	}

}
