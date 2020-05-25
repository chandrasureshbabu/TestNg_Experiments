package TestNG_DAY2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReoOutbroker_InvoicIng {
	
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void reoBrokerinvoicetoServicer(String weburl)
	{
		System.out.println("7 Invoice Frm ReoBrkr --> Servicer");
		System.out.println(weburl);
	}
	
	@Parameters({"url"})
	@Test
	public void reoBrokeraddOTAamount(String weburl)
	{
		System.out.println("ReoBroker-Adding amount to line item");
		System.out.println(weburl);
	}
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void reobrokerInvoiceToOutosurcer(String weburl)
	{
		System.out.println("8 Invoice Frm ReoBrkr --> Outsourer --> servicer");
		System.out.println(weburl);
	}
	
	


}
