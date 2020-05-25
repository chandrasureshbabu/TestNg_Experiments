package TestNG_InvocingLogin_Day3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvoicingLogin_UI_VIBITOOlS_Exp2 {
	
	
	@Test(dataProvider="login")
	public void toolLogin(String Un, String Pwd)
	{
		System.out.println("Tool Login");
		System.out.println("UserName: "+Un);
		System.out.println("password: "+Pwd);
	}
	
	
	
	
	@DataProvider(name="login")
	public Object[][] getlogins()
	{
		Object[][] data= new Object[3][2];
		
		//1st iteration 
		data[0][0]= "username1";
		data[0][1]="password1";

//1st iteration 
		data[1][0]= "username2";
		data[1][1]="password2";
		
//1st iteration 
		data[2][0]= "username3";
		data[2][1]="password3";		
		
		return data;		
	}

}
