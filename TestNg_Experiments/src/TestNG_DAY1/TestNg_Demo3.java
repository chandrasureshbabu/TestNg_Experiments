package TestNG_DAY1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg_Demo3 {
	
	@BeforeClass// this will executed after every @test Method , and this is in class level only not in xml file
	public void beforeClasstag()
	{
		System.out.println("Before Class- TestNg_Demo3");
	}
	
	
	@BeforeSuite// this is at suite level in xml file 
	public void beforesuitetag()
	{
		
		System.out.println("before_suite_Invoke all Site Req's -Before Suite");
	}
	
	
	@Test
	public void WebLogin()
	{
		System.out.println("Welcome 2 Website");
	}
	
	@Test
	public void AppLogin()
	{
		System.out.println("Hello -__FC APP");
		Assert.assertTrue(false);
	}
	
	
	@AfterSuite// this is at suite level in xml file 
	public void AfterSuitetag()
	{
		System.out.println("Clear All Catches/Cookies-Ater Suite ");
	}
	@AfterClass// this will executed after every @test Method , and this is in class level only not in xml file
	public void AfterClasstag()
	{
		System.out.println("AfterClasstag- TestNg_Demo3");
	}

}
