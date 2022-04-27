package PageYourLogo;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseYourLogo;

public class Page_Window_Hand {
	
	static WebDriverWait wait_pwH=new WebDriverWait(BaseYourLogo.driver,Duration.ofSeconds(30));
	public static void click_NewBrowserbtn(){
		
		WebElement ele_click_window_btn= BaseYourLogo.driver.findElement(By.cssSelector("button#button1"));
		wait_pwH.until(ExpectedConditions.visibilityOf(ele_click_window_btn));
		ele_click_window_btn.click();
		
		
	}
	
	
	public static void Handling_multiple_window() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	String Get_CurrentWindow=	BaseYourLogo.driver.getWindowHandle();
	
	System.out.println("This is current Window : "+BaseYourLogo.driver.getTitle()+"And window id : "+BaseYourLogo.driver.getWindowHandle());
	BaseYourLogo.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	Set<String> Total_Windows= BaseYourLogo.driver.getWindowHandles();
	
	System.out.println("This is Total Windows : "+Total_Windows.size());
	
	for (String string : Total_Windows) {
		
		if(!Get_CurrentWindow.equalsIgnoreCase(string))
		{
		BaseYourLogo.driver.switchTo().window(string);
		
		System.out.println("This is child window :  "+BaseYourLogo.driver.getTitle()+"And child window id : "+BaseYourLogo.driver.getWindowHandle());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BaseYourLogo.driver.close();
		}
		
		  BaseYourLogo.driver.switchTo().window(Get_CurrentWindow); 
		  System.out.println("Window title"+BaseYourLogo.driver.getTitle());
		 
	}
		
	}
	
	public static void Handling_Alert() {
		System.out.println("Thiis is test Method");
		
		WebElement ele_Alertowait=BaseYourLogo.driver.findElement(By.cssSelector("button#alert"));
	
		wait_pwH.until(ExpectedConditions.visibilityOf(ele_Alertowait));
		ele_Alertowait.click();
		
		System.out.println("This is the alert text"+BaseYourLogo.driver.switchTo().alert().getText());
	
		
		BaseYourLogo.driver.switchTo().alert().accept();
	}
	
	public static void Perform_DragandDrop() {
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BaseYourLogo.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement ele_DD=	BaseYourLogo.driver.findElement(By.cssSelector("button#draga"));
	//	wait_pwH.until(ExpectedConditions.visibilityOf(ele_DD));
		
		
		WebElement ele_drop= BaseYourLogo.driver.findElement(By.cssSelector("button#dragb"));
		
		Actions act_dd=new Actions(BaseYourLogo.driver);
		
		act_dd.dragAndDrop(ele_DD, ele_drop).build().perform();
		
		
		
		
	}

}
