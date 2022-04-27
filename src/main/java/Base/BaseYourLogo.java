package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import ReportYourLogo.Reporting;
import Utilities.UtilitiesYourLogo;
import Validation.ValidateElements;

public class BaseYourLogo {
	
	public static WebDriver driver;
	FileReader file;
	public static Properties prob;
	ValidateElements ObjectValidateElements;
	public BaseYourLogo() {
		// TODO Auto-generated constructor stub
		//public WebDriver driver;
		//this.driver=driver;
		
		
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
		
			
			//Reporting.Report_Extend();
		
		
		
		
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
		
		UtilitiesYourLogo.takeScreenShot("Launched Application");
		
		 ObjectValidateElements=new ValidateElements();
		 
	//	ObjectValidateElements.VerifyPageTitle();
		
		
		
	}
	
	//@Test
	@Parameters("Browser")
	public static void ChooseBrowser(String Browser)
	{
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Vijay Krishnan\\Desktop\\Software\\Driver\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver(option);
		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver firefox=new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver",
					"C:\\\\Users\\\\Vijay Krishnan\\\\Desktop\\\\Software\\\\Driver\\\\Chrome\\\\chromedriver.exe");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			
			
		}
		else if(Browser.equalsIgnoreCase("ie"))
		{
			EdgeDriver edge=new EdgeDriver();
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Vijay Krishnan\\\\Desktop\\\\Software\\\\Driver\\\\Chrome\\\\chromedriver.exe");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			
		}
			
	}
	
	

}
