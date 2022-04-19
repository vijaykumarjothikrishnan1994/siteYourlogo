package TestYourLogo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseYourLogo;
import PageYourLogo.PageDress;
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
	}
}
