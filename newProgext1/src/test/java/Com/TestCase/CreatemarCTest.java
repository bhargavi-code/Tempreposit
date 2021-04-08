package Com.TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreatemarCTest 
{
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void CreatemarC()
	{
		System.out.println("success create");
	}
	@Test(groups= {"Regression"})
	public void ModifymarC()
	{
		System.out.println("success Modified");
	}
	@Test(groups= {"Smoketest","Regression","Integration"})
	public void DeletemarC()
	{
		System.out.println("success Deleted");
	}
	@Test(groups= {"Integration"})
	public void ValidatemarC()
	{
		System.out.println("success Validate");
	}
}
