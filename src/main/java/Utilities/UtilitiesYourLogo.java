package Utilities;

public class UtilitiesYourLogo {
	
	
	public void Global_Wait(int enter_wait ) {
		
		try {
			Thread.sleep(enter_wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
