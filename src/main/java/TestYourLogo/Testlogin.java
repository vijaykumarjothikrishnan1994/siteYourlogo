package TestYourLogo;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYourLogo;
import PageYourLogo.PageLogin;
import Utilities.UtilitiesYourLogo;

public class Testlogin extends BaseYourLogo {
	//WebDriver driver;
	PageLogin object_page;
	UtilitiesYourLogo object_utili;
	BaseYourLogo object_BaseYourLogo;
	
	@BeforeMethod(enabled = false)
	public void launchtheBrowser_init() {
		
		
		
		
		
	}
	
	
	public Testlogin() {
		// TODO Auto-generated constructor stub
Initialize();
		
		System.out.println("Init worked sucessfully");
		
	}
	
//@Test
public void Login_into_the_Website() {
	
	
	object_utili=new UtilitiesYourLogo();
	
	object_utili.Global_Wait(4000);
	 object_page=new PageLogin(driver);
	 //System.out.println("");
	 object_page.clickSigninButton();
	 
	 UtilitiesYourLogo.takeScreenShot("ClickSigninButton");
	 System.out.println("Clicked Sigin button ");
	 object_page.enterUsername(object_BaseYourLogo.prob.getProperty("loginUsername"));
	 System.out.println("Entered the username");
	 object_page.enterpassword("Automationtest1994");
	 System.out.println("Entered the Password");
	 object_page.clickLoginbtn();
	 System.out.println("Clicked login button ");
	
	 System.out.println("Capturing the title");
	object_page.Verfify_title("My account - My Store");
	 System.out.println("Browser gonna close");
	 
	 
		
}


@AfterMethod(enabled = false)
public void tearDown() {
	
	
	object_utili=new UtilitiesYourLogo();
	object_utili.Global_Wait(4000);
	object_BaseYourLogo=new BaseYourLogo();
	
	
	
	
	object_BaseYourLogo.driver.close();
	System.out.println("Broser has closed");
	
	
	
	
}
}
