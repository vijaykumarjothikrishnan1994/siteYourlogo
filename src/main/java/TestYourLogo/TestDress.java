package TestYourLogo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYourLogo;
import PageYourLogo.PageDress;
import Utilities.UtilitiesYourLogo;
import Validation.ValidateElements;

public class TestDress extends BaseYourLogo{
	//ValidateElements object_ValidateElements;
	//Women - My Store
	@BeforeMethod
	public void init_TestDress()
	{
		Testlogin object_Testlogin_Td=new Testlogin();
		object_Testlogin_Td.Login_into_the_Website();
	}
	
	
	@Test
	public void TestDress_init() {
		
		
		PageDress object_PageDress=new PageDress(driver);
		object_PageDress.Click_DressTab();
		
		System.out.println("Clicked Dress  tab");
		object_PageDress.selectDDTshirtsort("In stock");
		System.out.println("Selected Value in T-shirt DD ");
		 
		// object_PageDress.TshirtGetAttributeValue();
		 
		 System.out.println("Attribute value captured ");
		 
		 object_PageDress.ScrollDownTheDressPage();
		 
		 System.out.println("Right click on the properties element");
		 
		// object_PageDress.RightClickOnProperties();
		 UtilitiesYourLogo.takeScreenShot("Right click operation for Properties element");
		 
		 System.out.println("Right click performed sucessfully");
		 
		 System.out.println("Performing mousehour action");
		 //object_PageDress.ScrollDownTheDressPage();
		 object_PageDress.mousehourDresspage();
		 
		 System.out.println("Performed mousehour action sucessfully");
		 
		 System.out.println("Opening the new tab in dress page ");
		 
		 object_PageDress.Automate_tab();
		 System.out.println("opening the tab action performed successfully");
	}
}
