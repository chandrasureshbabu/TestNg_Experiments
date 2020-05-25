package TestNG_DAY2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Create_LineItemExceptions {
	
	@Parameters({"url"})
	@Test
	public void servicerLineItemExceptions(String weburl)
	{
		System.out.println("11-ServicerLineItemExceptions Created");
		System.out.println(weburl);
	}
	@Parameters({"url"})
	@Test
	public void InvestorLineItemExceptions(String weburl)
	{
		System.out.println("12-InvestorLineItemExceptions Created");
		System.out.println(weburl);
	}
	
	@Parameters({"url"})
	@Test(timeOut=4000)//it will wait upto 4 sec
	public void servicerInvoice(String weburl)
	{
		System.out.println("13-servicerInvoiceExceptions Created");
		System.out.println(weburl);
	}

}
