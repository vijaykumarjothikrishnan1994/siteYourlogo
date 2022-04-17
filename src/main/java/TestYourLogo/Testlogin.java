package TestYourLogo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYourLogo;
import PageYourLogo.PageLogin;
import Utilities.UtilitiesYourLogo;

public class Testlogin extends BaseYourLogo {
	
	PageLogin object_page;
	UtilitiesYourLogo object_utili;
	BaseYourLogo object_BaseYourLogo;
	
	@BeforeMethod(enabled = true)
	public void launchtheBrowser_init() {
		
		Initialize();
		
		System.out.println("Init worked sucessfully");
		
	}
	
@Test
public void Login_into_the_Website() {
	
	
	//object_utili=new UtilitiesYourLogo();
	
	//object_utili.Global_Wait(4000);
	 object_page=new PageLogin(driver);
	 //System.out.println("");
	 object_page.clickSigninButton();
	 System.out.println("Clicked Sigin button ");
	 object_page.enterUsername("automationtest1994@gmail.com");
	 System.out.println("Entered the username");
	 object_page.enterpassword("Automationtest1994");
	 System.out.println("Entered the Password");
	 object_page.clickLoginbtn();
	 System.out.println("Clicked login button ");
	
	 System.out.println("Capturing the title");
	// object_page.Verfify_title("My account - My Store");
	 System.out.println("Browser gonna close");
		//object_utili=new UtilitiesYourLogo();
		//object_utili.Global_Wait(4000);
		//object_BaseYourLogo=new BaseYourLogo(driver);
	//object_BaseYourLogo.driver.close();
	 //System.out.println("Browser Closed");
	 
}


@AfterMethod(enabled = false)
public void tearDown() {
	
	System.out.println("Broser gonna close");
	object_utili=new UtilitiesYourLogo();
	object_utili.Global_Wait(4000);
	object_BaseYourLogo=new BaseYourLogo();
	
	Testlogin object_Testlogin=new Testlogin();
	object_BaseYourLogo.driver.close();
	
	
	
	
	
}
}
