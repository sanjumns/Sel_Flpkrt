package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cosntants.AppConstants;
import elementRepo.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testCase implements AppConstants {
	@Given("I am on the Amazon homepage")
	public void i_am_on_the_amazon_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I search for {string}")
	public void i_search_for(String string) {
		HomePage h=new HomePage(driver);
		h.getSearchbar().sendKeys("laptops");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I add the first result to the cart")
	public void i_add_the_first_result_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the item should be added successfully")
	public void the_item_should_be_added_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
