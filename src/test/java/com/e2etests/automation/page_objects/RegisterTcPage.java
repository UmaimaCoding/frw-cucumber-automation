package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterTcPage {
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

	public RegisterTcPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/** Create Methods **/

	public void openRegisterUrl() {
		Setup.getDriver().get(configFileReader.getProperties("register.url"));
	}

	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void enterPhoneNumber(String mobilePhone) {
		phone.sendKeys(mobilePhone);
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void enterAddress(String homeAddress) {
		address.sendKeys(homeAddress);
	}

	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}

	public void enterState(String stateName) {
		state.sendKeys(stateName);
	}

	public void enterPostalCode(String postalCodeNb) {
		postalCode.sendKeys(postalCodeNb);
	}

	public void selectCountry(String countryName) {
		Select select = new Select(country);
		select.selectByValue(countryName);
	}

	public void enterUserName(String userEmail) {
		userName.sendKeys(userEmail);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void confirmPassword(String confirmPwd) {
		confirmPassword.sendKeys(confirmPwd);
	}

	public void clickSubmitButton() {
		sendBtn.click();
	}

	public String getSuccessMessage() {
		return registerMessage.getText();
	}

}
