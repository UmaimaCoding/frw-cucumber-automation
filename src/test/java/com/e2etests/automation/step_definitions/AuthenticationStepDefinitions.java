package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.e2etests.automation.page_objects.AuthenticationPage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AuthenticationStepDefinitions {
	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinitions() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("je me connecte sur l application Swaglabs")
	public void jeMeConnecteSurLApplicationSwaglabs() {
		authenticationPage.login();
	}

	@Then("je me redirige vers la page product {string}")
	public void jeMeRedirigeVersLaPageProduct(String expectedTitle) {
		String actualTitle = authenticationPage.titlePage.getText();

		assertEquals(expectedTitle, actualTitle);
	}

	@Given("je me connecte sur l application Swaglabs incorrect coordonnees username {string} et password {string}")
	public void jeMeConnecteSurLApplicationSwaglabsIncorrectCoordonneesUsernameEtPassword(String username,
			String password) {
		authenticationPage.loginWithIncorrectCredentials(username, password);
	}

	@Then("un message derror saffiche {string}")
	public void unMessageDerrorSaffiche(String expectedMessage) {

		String actualMessage = authenticationPage.errorMessage.getText();
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
