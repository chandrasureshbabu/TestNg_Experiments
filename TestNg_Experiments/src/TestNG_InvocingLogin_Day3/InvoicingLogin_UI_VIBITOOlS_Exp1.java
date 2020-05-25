package TestNG_InvocingLogin_Day3;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvoicingLogin_UI_VIBITOOlS_Exp1 {
	
	//passing multiple values to the parameters from xml, but this at test level
	// when there is any thing defined in xml , we cant run class individually 
	@Parameters({"username","password"})
	@Test
	public void uiLogin(String Usrnme,String pswd)
	{
		System.out.println("UI Login - 1");
		System.out.println(Usrnme);
		System.out.println(pswd);
	}
	// when method need to iterate thgrh the  multiple values ,we need to provide DataProvider, 
	@Test(dataProvider="getlogins")
	public void tools_VIBILogins(String usernme, String pwd)
	{
		System.out.println("Tools Login -2");
		System.out.println(usernme);
		
		System.out.println(pwd);
	}

	@DataProvider
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
