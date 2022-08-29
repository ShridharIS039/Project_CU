package com.Centurion_University_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupconfirmPage {
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbuttonclick;


//initialization

	public SignupconfirmPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSubmitbuttonclick() {
		return submitbuttonclick;
	}
	/**
	 * click on submit button
	 */
	public void ClickonSubmitbtn() {
		
		submitbuttonclick.click();
	}
}
