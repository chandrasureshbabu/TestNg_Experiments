package TestNG_DAY2;

import org.testng.annotations.Test;

public class ReoOutbroker_InvoicIng {
	

	@Test(groups= {"smoke"})
	public void reoBrokerinvoicetoServicer()
	{
		System.out.println("7 Invoice Frm ReoBrkr --> Servicer");
	}
	
	
	
	public void reoBrokeraddOTAamount()
	{
		System.out.println("Adding amount to line item");
	}
	
	@Test(groups= {"smoke"})
	public void reobrokerInvoiceToOutosurcer()
	{
		System.out.println("8 Invoice Frm ReoBrkr --> Outsourer --> servicer");
	}
	
	


}
