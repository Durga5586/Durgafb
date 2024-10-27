package Stepdefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllPages.Loginpg;
import Utilities.GenericMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefination extends Loginpg {

	GenericMethods GM = new GenericMethods();

	@Given("user is on Login Page")
	public void user_is_on_login_page() throws IOException {
		ApplicationLaunch();
		ExtentCucumberAdapter.addTestStepLog("Launched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
	}

	@When("^user enters valid username\"([^\"]*)\"$")
	public void user_enters_valid_username(String username) throws IOException {
		Enter_Emaild(username);
		ExtentCucumberAdapter.addTestStepLog("Entered username successfully +username");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
	}

	@When("user enters valid password\"([^\"]*)\"$")
	public void user_enters_valid_password(String password) throws IOException {
		Enter_password(password);
		ExtentCucumberAdapter.addTestStepLog("Entered username successfully +password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GM.captureScreenshot());
	}

	@Then("clicks on submit")
	public void clicks_on_submit() {
		Login();
		ExtentCucumberAdapter.addTestStepLog("Clicked on Login successfully");
		closeBrowser();
	}

//@When("user enters valid username {string}")
//public void user_enters_valid_username(String username) {
//	Enter_Emaild(username);
//}

//@When("user enters valid password {string}")
//public void user_enters_valid_password(String password) {
//	Enter_password(password);
//}

}
