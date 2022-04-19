package PageYourLogo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseYourLogo;
import Validation.ValidateElements;

public class PageDress extends BaseYourLogo{
	
	@FindBy(xpath = "(//a[text()='T-shirts' ])[2]")
	WebElement eleClickDressTab;
	
	@FindAll(@FindBy(how=How.XPATH ,using = "//select[@id='selectProductSort']"))
	
	List<WebElement> listTShirtSortBy;
	
	
	@FindBy(id = "selectProductSort")
	WebElement eleSelectAllTshirtsb;
	
	
	@FindBy(xpath = "//div[@itemprop='offers']//span")
	WebElement eleValueTobeCapturedTshirt;
	
	
	
	public PageDress(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	WebDriverWait waitPageDress=new WebDriverWait(driver,Duration.ofSeconds(30));
	public void Click_DressTab() {
		
		waitPageDress.until(ExpectedConditions.visibilityOf(eleClickDressTab));
		
		try {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",eleClickDressTab );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			try {
				System.out.println("Js click is not working ");
				Actions act=new Actions(driver);
				act.click(eleClickDressTab).build().perform();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				System.out.println("Action click is not working");
				eleClickDressTab.click();
			}
			
		}
		
		
		
		
		
	}
	
	
	
	public void selectDDTshirtsort(String ValueFromtshirtDD)
	{
		System.out.println("Wait starts");
		try {
			waitPageDress.until(ExpectedConditions.visibilityOfAllElements(eleSelectAllTshirtsb));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Wait Ends");
		Select selectDD=new Select(eleSelectAllTshirtsb);
		
		selectDD.selectByVisibleText(ValueFromtshirtDD);
		
		
		
		
		
	}
	
	
	/*
	 * public void tshirtShotValue(String tshirtselectionActualvalue) {
	 * 
	 * waitPageDress.until(ExpectedConditions.visibilityOf(
	 * eleValueTobeCapturedTshirt)); ValidateElements object_PD_ValidateElements=new
	 * ValidateElements();
	 * object_PD_ValidateElements.getAttrivutevalue(eleValueTobeCapturedTshirt,
	 * tshirtselectionActualvalue );
	 * 
	 * 
	 * 
	 * }
	 */
	
	public void TshirtGetAttributeValue()
	{
		
	try {
		System.out.println("Value captured from GetAttribute"+eleValueTobeCapturedTshirt.getAttribute("text"))	;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			System.out.println("Value captured from Gettext()"+eleValueTobeCapturedTshirt.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 

}
