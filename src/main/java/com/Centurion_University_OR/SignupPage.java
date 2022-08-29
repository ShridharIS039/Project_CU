package com.Centurion_University_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	

	// Declaration
	@FindBy(id = "in_name")
	private WebElement nametextedit;

	@FindBy(id = "in_dob")
	private WebElement Dobtextedit;

	@FindBy(id = "in_eml")
	private WebElement emailtextedit;
	
	@FindBy(id = "in_mob")
	private WebElement mobilenoextedit;

	@FindBy(id = "txt_captcha")
	private WebElement capchacodetextedit;

	@FindBy(id = "in_sub")
	private WebElement submitbuttonclick;

//initialization

	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization
	
	public WebElement getnametextedit() {
		return nametextedit;
	}

	public WebElement getDobtextedit() {
		return Dobtextedit;
	}

	public WebElement getEmailidtextedit() {
		return emailtextedit;
	}
		
		public WebElement getmobilenoextedit() {
			return mobilenoextedit;
		}

		public WebElement getcapchacodetextedit() {
			return capchacodetextedit;
		}

		public WebElement getSubmitbuttonclick() {
			return submitbuttonclick;
	}

	/**
	 * click on submit button
	 * 
	 * @Shridhar username
	 * @Shridhar password
	 */
	public void CreateNewUser(String NAME, String DOB,String EMAIL_ID , String MOB_NO,String CODE) {
		nametextedit.sendKeys(NAME);
		Dobtextedit.sendKeys(DOB);
		emailtextedit.sendKeys(EMAIL_ID);
		mobilenoextedit.sendKeys(MOB_NO);
		capchacodetextedit.sendKeys(CODE);
		submitbuttonclick.click();
	}

}
