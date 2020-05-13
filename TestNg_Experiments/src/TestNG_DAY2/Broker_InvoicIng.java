package TestNG_DAY2;

import org.testng.annotations.Test;

public class Broker_InvoicIng {
	
	
	@Test(groups= {"smoke"})
	public void brokernvoicetoServicer()
	{
		System.out.println("4 Invoice Frm Brkr --> Servicer");
	}
	
	
	
	public void brokeraddOTAamount()
	{
		System.out.println("Adding amount to line item");
	}
	
	@Test(groups= {"smoke"})
	public void brokerInvoiceToOutosurcer()
	{
		System.out.println("5 Invoice Frm Brkr --> Outsourer --> servicer");
	}
	
	@Test(groups= {"smoke"})
	public void brokerInvoiceTOReoOutosurcer()
	{
		System.out.println(" 6 Invoice Frm Brkr --> REOOutsourer --> servicer");
	}

}
