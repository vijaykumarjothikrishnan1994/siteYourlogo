package PageYourLogo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseYourLogo;

public class PagetabWomen extends BaseYourLogo{
	
	
	@FindBy(xpath  = "//a[text()='Women']")
	WebElement ClickWomentTab;
		
		public PagetabWomen(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		WebDriverWait waitPTW=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		public void Clickwomentab()
		{
			waitPTW.until(ExpectedConditions.visibilityOf(ClickWomentTab));
			
			ClickWomentTab.click();
			
		}

}
