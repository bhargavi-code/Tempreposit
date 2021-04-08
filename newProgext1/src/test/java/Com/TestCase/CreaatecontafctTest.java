package Com.TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreaatecontafctTest 
{
	
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void Createcontafct()
	{
		System.out.println("success create");
	}
	@Test(groups= {"Smoketest"})
	public void Modifycontafct()
	{
		System.out.println("success modified");

	}
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void Deletecontafct()
	{
		System.out.println("success deleted");

	}
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void Validatecontafct()
	{
		System.out.println("success validate");

	}
}
