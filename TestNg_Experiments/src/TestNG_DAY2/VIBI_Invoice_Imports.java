package TestNG_DAY2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class VIBI_Invoice_Imports {
	
	@Test(enabled=true)
	public void downloadVIBItools()
	{
		System.out.println("14- PRQST1 fr VIBI- Tools Downloaded");
		
	}
	
	@Test(enabled=true)
	public void importInvoicesfromFilesGtoVIBI()
	{
		System.out.println("15- PRQST2 fr VIBI- Data imported to VI/BI");
	}
	@Parameters({"appurl"})
	@Test(dependsOnMethods= {"downloadVIBItools","importInvoicesfromFilesGtoVIBI"})
	public void importInvoicestoIMFrmVIBI(String AppInvoicing)
	{
		System.out.println("16- Invoices Imported Frm VIBI");
		System.out.println(AppInvoicing);
	}

}
