package Utilities;

import java.io.IOException;

public class DataDrivenTesting {
	
	
	public Object[][] dataproviderMethod() throws IOException
	{
		//Master_Data object_Master=new Master_Data("");
		//object_Master.g
		
		
		Master_Data object_m=new Master_Data("C:\\Users\\Vijay Krishnan\\Desktop\\Software\\New Location\\YourLogo\\ConfigureData\\MasterDeatailSheet.xlsx");
		
		Object[][] subobject=new Object[2][2]; 
		subobject[0][0]="";
		subobject[0][1]="";
		subobject[1][0]="";
		subobject[1][1]="";
		
		
		return subobject;
		
	}

	
}
