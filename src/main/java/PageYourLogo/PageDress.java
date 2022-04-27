package PageYourLogo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import HandlingYourLogo.WindowHandling;
import Utilities.UtilitiesYourLogo;
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
	
	@FindBy(xpath = "//span[contains(text(),'Properties')]")
	WebElement rightclickProperties;
	
	@FindBy(css = "img[title='Faded Short Sleeve T-shirts']")
	WebElement mousehouronimage;
	
	@FindBy(css = "a[title='New products']")
	WebElement ClickNewtab;
	
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
			//waitPageDress.until(ExpectedConditions.visibilityOfAllElements(eleSelectAllTshirtsb));
			
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
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
	 
	
	
	public void RightClickOnProperties() {
		
		waitPageDress.until(ExpectedConditions.visibilityOf(rightclickProperties));
		Actions act=new Actions(driver);
		act.contextClick(rightclickProperties).build().perform();
		
	}
	
	public void ScrollDownTheDressPage()
	{
		JavascriptExecutor jssd=(JavascriptExecutor)driver;
		jssd.executeScript("window.scrollBy(0,550)", "");
	}
	
	
	public  void mousehourDresspage()
	{
		
		waitPageDress.until(ExpectedConditions.visibilityOf(mousehouronimage));
		
		//waitPageDress.until(ExpectedConditions.elementToBeClickable(mousehouronimage));
		Actions actimage=new Actions(driver);
		actimage.moveToElement(mousehouronimage).build().perform();
		
	}
	
	
	public void Automate_tab()
	{ /*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		waitPageDress.until(ExpectedConditions.visibilityOf(ClickNewtab));
		
		String Click_Newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		ClickNewtab.sendKeys(Click_Newtab);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String currentwindow=driver.getWindowHandle();
		ArrayList<String> available_tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(available_tab.get(1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UtilitiesYourLogo.takeScreenShot("This is the new tab");
		System.out.println("This is new window: "+driver.getTitle());
		
		/*driver.switchTo().window(available_tab.get(0));
		System.out.println("This is currenct window"+driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();*/
		
		
	//}
	/*
	 * System.out.println("Clicking the new Empty tab");
	 * 
	 * String click_new_tab= Keys.chord(Keys.CONTROL,"t");
	 * ClickNewtab.sendKeys(click_new_tab);
	 * System.out.println("new action working fine");
	 */
		
		/*driver.switchTo().window(available_tab.get(1));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		}*/	
	WindowHandling.Class_Handling_window();

}
}
