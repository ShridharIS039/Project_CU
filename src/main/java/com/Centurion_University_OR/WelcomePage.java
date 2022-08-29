package com.Centurion_University_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(xpath = "//a[text()='Sign Up ']")
	private WebElement signuplinkclick;


//initialization

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization
	public WebElement getsignuplinkclick() {
		return signuplinkclick;
}
	public void ClickSignuplink() {
		
		signuplinkclick.click();
	}
}