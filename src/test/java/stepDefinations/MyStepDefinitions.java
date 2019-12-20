package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {

	public WebDriver driver;
	HomePage h;

	@Given("^User in on Greencart Landing page$")
	public void user_in_on_greencart_landing_page() throws Throwable {
		driver = Base.getDriver();
		driver.get(prop.getProperty("url"));
		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	

	 @When("^User searched for (.+) Vegatable$")
	public void user_searched_for_vegatables(String strArg1) throws Throwable {
		h = new HomePage(driver);
		h.getSearch().sendKeys(strArg1);
		// driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
		Thread.sleep(3000);

	}

	@Then("^\"([^\"]*)\" result are displayed$")
	public void something_result_are_displayed(String strArg1) throws Throwable {
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	}

	

	@And("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}

	@And("^User proceeded to Checkout page for parchase$")
	public void user_proceeded_to_checkout_page_for_parchase() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	}

}
