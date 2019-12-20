package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class stepDefination extends Base {
	
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	       System.out.println("Open Browser");
	       
	    }
	 
	 @Then("^verify selected (.+) items are displayed in the Checkout pages for purchase$")
	 public void verify_selected_items_are_displayed_in_the_checkout_pages_for_purchase(String strArg1)
				throws Throwable {
			Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
			Thread.sleep(2000);
		}
	 
	 
	 
	 
	 
	 
	 

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	        System.out.println("Navigate Url");
	    }

	    @Then("^Check browser is started$")
	    public void check_browser_is_started() throws Throwable {
	       System.out.println("Check Browser Title");
	    }
	
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		// Code To navigate login url
		System.out.println("Navigated To Login url");
	}

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("Supply User Name and Password");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		// Home page validation
		System.out.println("Validated Home Page");
	}

	
	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));

	}

	@And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed_something(String Arg1) throws Throwable {
		System.out.println("Validate Cards");
		System.out.println(Arg1);

	}
	
	 @When("^User login in to application with (.+) and (.+)$")
	    public void user_login_into_application_with_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }

}