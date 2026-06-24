package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.Setup;


public class LogoutPage {

	/** @FindBy **/

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement burgerMenu;
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutButton;
	@FindBy(how = How.ID, using = "about_sidebar_link")
	public static WebElement aboutButton;
	@FindBy(how = How.XPATH, using = "//div[@class='login_logo']")
	public WebElement titlePage;
	@FindBy(how = How.XPATH, using = "//h1[contains(., \"The World's Only Full-Lifecycle AI-Quality Platform\")]")
	public WebElement aboutText;

	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/** Create Methods **/
	public void clickOnBurgerMenu() {
		burgerMenu.click();
	}

	public void logout() {
		logoutButton.click();

	}

	public void goToAbout() {
		aboutButton.click();
		
	}
}
