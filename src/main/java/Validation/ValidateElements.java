package Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

import Base.BaseYourLogo;

public class ValidateElements  extends BaseYourLogo{
	BaseYourLogo PbjectBase;
	Assertion asserSoft;
	/*
	 * public ValidateElements() { this.driver=driver; // TODO Auto-generated
	 * constructor stub }
	 */

	//BaseYourLogo PbjectBase;
	
	public void VerifyPageTitle(String title_captured) {
		
		try {
			PbjectBase=new BaseYourLogo();
			System.out.println(PbjectBase.driver.getTitle());
			
			 asserSoft=new Assertion();
			asserSoft.assertEquals(title_captured,PbjectBase.driver.getTitle(),"Not Expected result");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//My account - My Store
		
	}
	
	
	
	
	/*
	 * public void getAttrivutevalue(WebElement eleValueTobeCapturedTshirt,String
	 * ValueExpectedgetAttrivutevalue) {
	 * 
	 * PbjectBase=new BaseYourLogo();
	 * 
	 * String ValuegetAttribute=PbjectBase.driver.findElement(By.xpath(
	 * eleValueTobeCapturedTshirt)).getAttribute("text");
	 * 
	 * 
	 * 
	 * System.out.println("This is AttributeValue Captured "+ValuegetAttribute);
	 * asserSoft=new Assertion();
	 * asserSoft.assertEquals(ValueExpectedgetAttrivutevalue,
	 * eleValueTobeCapturedTshirt,"Not Expected result");
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
