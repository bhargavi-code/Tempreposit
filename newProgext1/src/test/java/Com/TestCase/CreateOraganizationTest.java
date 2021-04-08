package Com.TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOraganizationTest 
{
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void Createorg()
	{
		System.out.println("success create");	
	}
	@Test(groups= {"Regression"})
	public void Modifyorg()
	{
		System.out.println("success Modified");
	}
	@Test(groups= {"Regression","Integration"})
	public void Deleteorg()
	{
		System.out.println("success Delete");
	}
	@Test(groups= {"Integration"})
	public void Validateorg()
	{
		System.out.println("success Validate");
	}
}
