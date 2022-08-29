package com.Centurion_University_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	// Declaration
	@FindBy(id = "u_id")
	private WebElement usernametextedit;

	@FindBy(id = "u_ps")
	private WebElement passwordtextedit;

	@FindBy(id = "u_sub")
	private WebElement submitbuttonclick;

//initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization

	public WebElement getUsernametextedit() {
		return usernametextedit;
	}

	public WebElement getPasswordtextedit() {
		return passwordtextedit;
	}

	public WebElement getSubmitbuttonclick() {
		return submitbuttonclick;
	}

	/**
	 * click on submit button
	 * 
	 * @Shridhar username
	 * @Shridhar password
	 * click submit
	 */
	public void loginToAppli(String username, String password) {
		usernametextedit.sendKeys(username);
		passwordtextedit.sendKeys(password);
		//submitbuttonclick.click();
	}

}
