package TestNG_DAY2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vendor_InvoicIng {
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void createInvoiceServicer(String weburl)
	{
		System.out.println(" 1 Invoice Frm Vendr --> Servicer");
		System.out.println(weburl);
	}
	
	@Parameters({"url"})
	@Test
	public void addOTAamount(String weburl)
	{
		System.out.println("Vendor-Adding amount to line item");
		System.out.println(weburl);
	}
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void createInvoiceOutosurcer(String weburl)
	{
		System.out.println("2 Invoice Frm Vendr --> Outsourer --> servicer");
		System.out.println(weburl);
	}
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void createInvoiceReoOutosurcer(String weburl)
	{
		System.out.println(" 3 Invoice Frm Vendr --> REOOutsourer --> servicer");
		System.out.println(weburl);
	}

}
