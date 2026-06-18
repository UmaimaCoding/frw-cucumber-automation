package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.e2etests.automation.page_objects.RegisterTcPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTcStepDefinitions {
	private RegisterTcPage registerTcPage;

	public RegisterTcStepDefinitions() {
		this.registerTcPage = new RegisterTcPage();
	}

	@Given("I open the Mercury registration page")
	public void iOpenTheMercuryRegistrationPage() {
		registerTcPage.openRegisterUrl();
	}

	@When("I fill first name {string}")
	public void iFillFirstName(String firstname) {
		registerTcPage.enterFirstName(firstname);
	}

	@When("I fill last name {string}")
	public void iFillLastName(String lastname) {
		registerTcPage.enterLastName(lastname);
	}

	@When("I fill phone number {string}")
	public void iFillPhoneNumber(String phoneNb) {
		registerTcPage.enterPhoneNumber(phoneNb);
	}

	@When("I fill email {string}")
	public void iFillEmail(String userEmail) {
		registerTcPage.enterEmail(userEmail);
	}

	@When("I fill address {string}")
	public void iFillAddress(String homeAddress) {
		registerTcPage.enterAddress(homeAddress);
	}

	@When("I fill city {string}")
	public void iFillCity(String cityName) {
		registerTcPage.enterCity(cityName);
	}

	@When("I fill state {string}")
	public void iFillState(String stateName) {
		registerTcPage.enterState(stateName);
	}

	@When("I fill postal code {string}")
	public void iFillPostalCode(String postalCodeNb) {
		registerTcPage.enterPostalCode(postalCodeNb);
	}

	@When("I fill username {string}")
	public void iFillUsername(String username) {
		registerTcPage.enterUserName(username);
	}

	@When("I fill password {string}")
	public void iFillPassword(String password) {
		registerTcPage.enterPassword(password);
	}

	@When("I enter the same password {string}")
	public void iEnterTheSamePassword(String confirmPassword) {
		registerTcPage.confirmPassword(confirmPassword);
	}

	@When("I click on send button to submit the registration form")
	public void iClickOnSendButtonToSubmitTheRegistrationForm() {
		registerTcPage.clickSubmitButton();
	}

	@Then("I see the registration success message {string}")
	public void iSeeTheRegistrationSuccessMessage(String text) {
		String actualMessage = registerTcPage.getSuccessMessage();
		assertTrue(actualMessage.contains(text));
	}
}
