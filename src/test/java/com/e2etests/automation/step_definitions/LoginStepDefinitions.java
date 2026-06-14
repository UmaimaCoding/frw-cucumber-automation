package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefinitions {

	private LoginPage loginpage;

	public LoginStepDefinitions() {
		this.loginpage = new LoginPage();
	}

	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		loginpage.goToUrl();
	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		loginpage.fillUsername(name);
	}

	@When("je saaise le mot de passe {string}")
	public void jeSaaiseLeMotDePasse(String password) {
		loginpage.fillPassword(password);
	}

	@When("je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		loginpage.clickOnSubmit();
	}

	@Then("je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {

		String message = LoginPage.welcomeMsg.getText();
		assertEquals(message, text);
	}

}
