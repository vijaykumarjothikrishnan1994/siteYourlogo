package PageYourLogo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseYourLogo;
import Utilities.UtilitiesYourLogo;
import Validation.ValidateElements;

public class PageLogin extends BaseYourLogo{
	
	//BaseYourLogo object_PL_BYL=new BaseYourLogo();
	
	
	//BaseYourLogo object_BYL;
	ValidateElements object_ValidateElements;
	
	@FindBy(xpath =  "//a[@title='Log in to your customer account']")
	WebElement ylclicksigninbtn;
	@FindBy(xpath = "//label[text()='Email address']//following-sibling::input[@name='email']")
	WebElement ylusername ;
	@FindBy(xpath = "//span//input[@name='passwd']")
	WebElement ylpassword;
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	WebElement ylclickloginbtn;
	//private WebDriver driver;
	
	public PageLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
		
		
	}
	
	
	public void enterUsername(String UsernametobeEntered)
	{
		
		WebDriverWait 
		waitforelement=new WebDriverWait(driver, Duration.ofSeconds(30));
		waitforelement.until(ExpectedConditions.visibilityOf(ylusername));
		ylusername.sendKeys(UsernametobeEntered);
		
		System.out.println(ylusername.getAttribute("value"));
		
		//return enterUsername;
	}
	
	
	public void clickSigninButton()
	{WebDriverWait 
		waitforelement=new WebDriverWait(driver, Duration.ofSeconds(30));
		waitforelement.until(ExpectedConditions.visibilityOf(ylclicksigninbtn));
		ylclicksigninbtn.click();
		
	}
	public void enterpassword(String UserpasswordtobeEnterd)
	{WebDriverWait 
		waitforelement=new WebDriverWait(driver, Duration.ofSeconds(30));
		waitforelement.until(ExpectedConditions.visibilityOf(ylpassword));
		ylpassword.sendKeys(UserpasswordtobeEnterd);
		System.out.println(ylpassword.getAttribute("value"));
	}
	
	public void clickLoginbtn()
	{WebDriverWait 
		waitforelement=new WebDriverWait(driver, Duration.ofSeconds(30));
		waitforelement.until(ExpectedConditions.visibilityOf(ylclickloginbtn));
		ylclickloginbtn.click();
	}
	
	
	public void Verfify_title(String Actual_title)
	{
		 object_ValidateElements=new ValidateElements();
		 object_ValidateElements.VerifyPageTitle(Actual_title);
		
		
	}
	

}
