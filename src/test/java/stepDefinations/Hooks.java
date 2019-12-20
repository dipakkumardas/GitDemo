package stepDefinations;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Before Mobile hook");
	}
	
	@After("@MobileTest")
	public void Aftervalidation()
	{
		System.out.println("After Mobile hook");
	}
	
	@After("@SeleniumTest")
	public void AfterSeleniumTest()
	{
		driver.close();
	}


}
