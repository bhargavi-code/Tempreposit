package Com.TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreatevendorTest 
{
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void Createvendor()
	{
		System.out.println("success create");	}
	@Test(groups= {"Regression","Integration"})
	public void Modifyvendor()
	{
		System.out.println("success modified");
	}
	@Test(groups= {"Smoketest"})
	public void Deletevendor()
	{
		System.out.println("success delete");
	}
	@Test(groups= {"Regression","Integration"})
	public void Validatevendor()
	{
		System.out.println("success validate");
	}
}
