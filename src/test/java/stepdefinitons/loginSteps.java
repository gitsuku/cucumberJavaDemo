package stepdefinitons;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;

public class loginSteps {
	@Given("user is loginpage")
	public void user_is_loginpage() {
		 System.out.println("user is in login page");
	   
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	  System.out.println("user enter login and password");
	    
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		 System.out.println("user clicks on log button");
	    
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		 System.out.println("user is on login page");
	    
	}


}
