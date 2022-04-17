package Validation;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;

import Base.BaseYourLogo;

public class ValidateElements  {
	BaseYourLogo PbjectBase;
	
	/*
	 * public ValidateElements() { this.driver=driver; // TODO Auto-generated
	 * constructor stub }
	 */

	//BaseYourLogo PbjectBase;
	
	public void VerifyPageTitle(String title_captured) {
		
		try {
			PbjectBase=new BaseYourLogo();
			System.out.println(PbjectBase.driver.getTitle());
			
			Assertion asserSoft=new Assertion();
			asserSoft.assertEquals(title_captured,PbjectBase.driver.getTitle(),"Not Expected result");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//My account - My Store
		
	}

}
