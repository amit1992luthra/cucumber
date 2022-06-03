package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("step 1 in background");
	}

	@When("user enter valid login id and password")
	public void user_enter_valid_login_id_and_password() {
		System.out.println("step 2 in background");
	}

	@Then("User navigates to the home page")
	public void user_navigates_to_the_home_page() {
		System.out.println("step 3 in background");
	}

	@Given("User is on Home page")
	public void user_is_on_Home_page() {
		System.out.println("step 1");
	}

	@When("User clicks on my profile link")
	public void user_clicks_on_my_profile_link() {
		System.out.println("step 2");
	}

	@When("click on save button")
	public void click_on_save_button() {
	 
	}

	@Then("changes are saved")
	public void changes_are_saved() {
	    
	}

	@When("user enter invalid input in the fields")
	public void user_enter_invalid_input_in_the_fields() {
	    
	}

	@Then("validation messages appeared")
	public void validation_messages_appeared() {
	   
	}

	@When("user enter invalid input {string} and Phone number {string}in the fields")
	public void user_enter_invalid_input_and_Phone_number_in_the_fields(String email, String phone) {
	    System.out.println("value of email and phone number is "+email+" "+phone );
	}

}
