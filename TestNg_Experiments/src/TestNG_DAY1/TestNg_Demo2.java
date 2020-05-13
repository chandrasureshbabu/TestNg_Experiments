package TestNG_DAY1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Demo2 {
	
	@AfterTest//this will execute after all tests at respective test level in xml
	public void Deletecokkiesaftertesting()
	{
		System.out.println("_@AfterTest- Deleteing_cookies");
	}
	
	
	@BeforeMethod// this will executed after every @test Method , and this is in class level only not in xml file
	public void beforemethodTag()
	{
		System.out.println("Before Every Method-----BM");
	}
	@AfterMethod// this will executed after every @test Method , and this is in class level only not in xml file
	public void AftermethodTag()
	{
		System.out.println("After Every Method----- AM");
	}
	
	@Test
	public void test1()
	{
		System.out.println("TestNg_Demo2- Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("TestNg_Demo2- Test2");
	}
	
	@Test
	public void demo3()
	{
		System.out.println("TestNg_Demo2 -Test3");
	}
	
	@BeforeTest//this will execute after all tests at respective test level in xml
	public void launchbrowser()
	{
		System.out.println("_@BeforeTest - Before Tests -lnvknng browser");
	}


}
