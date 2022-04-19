package TestYourLogo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYourLogo;
import PageYourLogo.PagetabWomen;
import ReportYourLogo.Reporting;

public class TesttabWomen extends BaseYourLogo{
	
	
	@BeforeMethod
	public void testWomen_init() {
		
		Testlogin object_Testlogin=new Testlogin();
		object_Testlogin.Login_into_the_Website();
		
	}
	
	@Test
	public void Woment_Tab() {
		
		
		PagetabWomen object_PagetabWomen=new PagetabWomen(driver);
		
		
		object_PagetabWomen.Clickwomentab();
		System.out.println("Clicked Women  tab");
		
	}
	
	@AfterMethod
	public void tearDown_Womentab() {
		
		System.out.println("Gonna close the browser");
		
		
		
	}

}
