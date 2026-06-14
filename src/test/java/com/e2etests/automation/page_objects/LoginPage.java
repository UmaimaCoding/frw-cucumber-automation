package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {

	private ConfigFileReader configFileReader;

	/** @FindBy **/

	@FindBy(how = How.NAME, using = "userName")
	public static WebElement username;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnSubmit;
	@FindBy(how = How.TAG_NAME, using = "h3")
	public static WebElement welcomeMsg;

	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/** Create Methods **/

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void fillUsername(String name) {
		username.sendKeys(name);
	}

	public void fillPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickOnSubmit() {
		btnSubmit.click();
	}

}
