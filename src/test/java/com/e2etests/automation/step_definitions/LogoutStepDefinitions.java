package com.e2etests.automation.step_definitions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinitions {

	private LogoutPage logoutPage;
	private AuthenticationPage authenticationPage;

	public LogoutStepDefinitions() {
		this.logoutPage = new LogoutPage();
		this.authenticationPage = new AuthenticationPage();
	}

	@When("je click sur le menu burger")
	public void jeClickSurLeMenuBurger() throws InterruptedException {
		
		authenticationPage.login();
		
		Thread.sleep(2000);
		logoutPage.clickOnBurgerMenu();
	}

	@When("je click sur logout")
	public void jeClickSurLogout() throws InterruptedException {
		
		Thread.sleep(2000);
		logoutPage.logout();
	}

	@Then("je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String title) {
		
		String actualTitle = logoutPage.titlePage.getText();
		assertEquals(title, actualTitle);
	}

	@When("je click sur About")
	public void jeClickSurAbout() throws InterruptedException {
		authenticationPage.login();

		Thread.sleep(2000);
		logoutPage.clickOnBurgerMenu();

		Thread.sleep(2000);
		logoutPage.goToAbout();
	}

	@Then("je me redirige vers la page about")
	public void jeMeRedirigeVersLaPageAbout() {
		String expectedUrl = "https://saucelabs.com/";
		
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		boolean correctUrl = wait.until(ExpectedConditions.urlToBe(expectedUrl));
		assertTrue(correctUrl, "L'URL après le clic sur About n'est pas correcte !");
	}

}
