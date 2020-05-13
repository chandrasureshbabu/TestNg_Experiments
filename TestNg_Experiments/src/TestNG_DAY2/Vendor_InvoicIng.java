package TestNG_DAY2;

import org.testng.annotations.Test;

public class Vendor_InvoicIng {
	
	@Test(groups= {"smoke"})
	public void createInvoiceServicer()
	{
		System.out.println(" 1 Invoice Frm Vendr --> Servicer");
	}
	
	
	@Test
	public void addOTAamount()
	{
		System.out.println("Adding amount to line item");
	}
	
	@Test(groups= {"smoke"})
	public void createInvoiceOutosurcer()
	{
		System.out.println("2 Invoice Frm Vendr --> Outsourer --> servicer");
	}
	
	@Test(groups= {"smoke"})
	public void createInvoiceReoOutosurcer()
	{
		System.out.println(" 3 Invoice Frm Vendr --> REOOutsourer --> servicer");
	}

}
