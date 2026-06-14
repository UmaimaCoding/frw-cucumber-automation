package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
	private ConfigFileReader configFileReader;

	/** @FindBy **/

	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.NAME, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement sendBtn;
	@FindBy(xpath = "//td[contains(.,'Thank you for registering')]")
	public static WebElement registerMessage;

	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/** Create Methods **/

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("register.url"));
	}

	public void fillFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void fillLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void fillPhone(String Mobilephone) {
		phone.sendKeys(Mobilephone);
	}

	public void fillEmail(String mail) {
		email.sendKeys(mail);
	}

	public void fillAddress(String addressTxt) {
		address.sendKeys(addressTxt);
	}

	public void fillCity(String cityTxt) {
		city.sendKeys(cityTxt);
	}

	public void fillState(String stateTxt) {
		state.sendKeys(stateTxt);
	}

	public void fillPostalCode(String postalCodeTxt) {
		postalCode.sendKeys(postalCodeTxt);
	}

	public void fillCountry(String countryTxt) {
		country.sendKeys(countryTxt);
	}

	public void fillUserName(String userEmail) {
		userName.sendKeys(userEmail);
	}

	public void fillPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void fillConfirmPassword(String confirmPwd) {
		confirmPassword.sendKeys(confirmPwd);
	}

	public void ClickOnSendBtn() {
		sendBtn.click();
	}
}
