package HandlingYourLogo;

import Base.BaseYourLogo;

import PageYourLogo.Page_Window_Hand;

public class WindowHandling {
	
	public static BaseYourLogo base_window_object;
	
	public static void Class_Handling_window() {
		
		base_window_object= new BaseYourLogo();
		base_window_object.driver.get("http://www.seleniumframework.com/Practiceform/");
		
		System.out.println("Clicking the new Browser buton");
		Page_Window_Hand.click_NewBrowserbtn();
		System.out.println("Clicked new browser button");
		
		System.out.println("Started handing the child window");
		Page_Window_Hand.Handling_multiple_window();
		System.out.println(" child window handled successfully");
		
		System.out.println("Click the alert box");
		Page_Window_Hand.Handling_Alert();
		System.out.println("Clicked the alert box");
		
		System.out.println("Started performing Drag and Drop");
		
		Page_Window_Hand.Perform_DragandDrop();
		
		System.out.println("Performed Drag and Drop succesffuly");
	}

}
