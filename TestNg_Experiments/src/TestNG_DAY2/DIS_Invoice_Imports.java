package TestNG_DAY2;

import org.testng.annotations.Test;

public class DIS_Invoice_Imports {
	
	@Test
	public void importproject()
	{
		System.out.println("PRQST1 fr DIS- project Imported is  1.4");
	}
	@Test(dependsOnMethods= {"importproject"})
	public void runAddInvoiceImageRequest()
	{
		System.out.println("PRQST2 fr DIS - Image ID is Generated");
	}
	@Test(enabled=false)//it is false it wont run the test
	public void  importDLInvoiceWithAttachment()
	{
		System.out.println("9 -DL_InvoiceRequestWithImage is Successfull");
	}
	
	
	
	

}
