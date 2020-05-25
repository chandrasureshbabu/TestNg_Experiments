package TestNG_DAY2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Broker_InvoicIng {
	
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void brokernvoicetoServicer(String weburl)
	{
		System.out.println("4 Invoice Frm Brkr --> Servicer");
		System.out.println(weburl);
	}
	
	@Parameters({"url"})
	@Test
	public void brokeraddOTAamount(String weburl)
	{
		System.out.println("Broker - Adding amount to line item");
		System.out.println(weburl);
	}
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void brokerInvoiceToOutosurcer(String weburl)
	{
		System.out.println("5 Invoice Frm Brkr --> Outsourer --> servicer");
		System.out.println(weburl);
	}
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void brokerInvoiceTOReoOutosurcer(String weburl)
	{
		System.out.println(" 6 Invoice Frm Brkr --> REOOutsourer --> servicer");
		System.out.println(weburl);
	}

}
