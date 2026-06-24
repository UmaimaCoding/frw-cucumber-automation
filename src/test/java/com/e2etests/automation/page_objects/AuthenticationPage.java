package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthenticationPage {
	private ConfigFileReader configFileReader;

	/** @FindBy **/

	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement loginButton;
	@FindBy(how = How.TAG_NAME, using = "h3")
	public WebElement errorMessage;
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public WebElement titlePage;

	public AuthenticationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/** Create Methods **/

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("swaglabs.url"));
		
		username.clear();
		username.sendKeys(configFileReader.getProperties("swaglabs.login"));
		
		password.clear();
		password.sendKeys(configFileReader.getProperties("swaglabs.password"));
		
		loginButton.click();

	}

//	public String getProductTitle() {
//		return titlePage.getText();
//	}

	public void loginWithIncorrectCredentials(String user, String pwd) {

		Setup.getDriver().get(configFileReader.getProperties("swaglabs.url"));

		username.clear();
		username.sendKeys(user);

		password.clear();
		password.sendKeys(pwd);

		loginButton.click();
	}

//	public void goToUrl() {
//		Setup.getDriver().get(configFileReader.getProperties("swaglabs.url"));
//	}
//
//	public void fillUsername() {
//		username.clear();
//		username.sendKeys(configFileReader.getProperties("swaglabs.login"));
//	}
//
//	public void fillPassword() {
//		password.clear();
//		password.sendKeys(configFileReader.getProperties("swaglabs.password"));
//	}
//
//	public void clickOnSubmit() {
//		loginButton.click();
//	}

}
