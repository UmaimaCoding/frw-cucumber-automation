package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_objects.RegisterPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitions {
	private RegisterPage registerPage;

	public RegisterStepDefinitions() {
		this.registerPage = new RegisterPage();
	}

	@Given("I open the registration page")
	public void iOpenTheRegistrationPage() {
		registerPage.goToUrl();
	}

	@When("I enter first name {string}")
	public void iEnterFirstName(String name) {
		registerPage.fillFirstName(name);
	}

	@When("I enter last name {string}")
	public void iEnterLastName(String lastname) {
		registerPage.fillLastName(lastname);
	}

	@When("I enter phone {string}")
	public void iEnterPhone(String phoneNumber) {
		registerPage.fillPhone(phoneNumber);
	}

	@When("I enter email {string}")
	public void iEnterEmail(String email) {
		registerPage.fillEmail(email);
	}

	@When("I enter address {string}")
	public void iEnterAddress(String address) {
		registerPage.fillAddress(address);
	}

	@When("I enter city {string}")
	public void iEnterCity(String city) {
		registerPage.fillCity(city);
	}

	@When("I enter state {string}")
	public void iEnterState(String state) {
		registerPage.fillState(state);
	}

	@When("I enter postal code {string}")
	public void iEnterPostalCode(String postalCode) {
		registerPage.fillPostalCode(postalCode);
	}

	@When("I select country {string}")
	public void iSelectCountry(String country) {
		registerPage.fillCountry(country);
	}

	@When("I enter username {string}")
	public void iEnterUsername(String username) {
		registerPage.fillUserName(username);
	}

	@When("I enter password {string}")
	public void iEnterPassword(String pwd) {
		registerPage.fillPassword(pwd);
	}

	@When("I confirm password {string}")
	public void iConfirmPassword(String confirmPwd) {
		registerPage.fillConfirmPassword(confirmPwd);
	}

	@When("I click on submit button")
	public void iClickOnSubmitButton() {
		registerPage.ClickOnSendBtn();
	}

	@Then("I should see registration success message {string}")
	public void iShouldSeeRegistrationSuccessMessage(String text) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOf(RegisterPage.registerMessage));

	    String registerMessage = RegisterPage.registerMessage.getText();

	    assertTrue(registerMessage.contains(text));

	}

}
