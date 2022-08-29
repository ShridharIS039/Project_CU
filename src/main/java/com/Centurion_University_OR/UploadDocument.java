package com.Centurion_University_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadDocument {

	// Declaration
	@FindBy(id = "fpic")
	private WebElement PassportPhoto;

	@FindBy(id = "ftndoc")
	private WebElement tenthmarkscard;

	@FindBy(id = "ftcdoc")
	private WebElement tenthCertificate;
	
	@FindBy(id = "fdmdoc")
	private WebElement PUCmarksCard;

	@FindBy(id = "fide")
	private WebElement Idproof;

	@FindBy(id = "fdcdoc")
	private WebElement PUCCertificate;
	
	@FindBy(id = "fsig")
	private WebElement Signatiure;

	@FindBy(xpath = "//input[@value='I accept']")
	private WebElement checkBox;

//initialization

	public UploadDocument(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization

	
	public WebElement getPassportPhoto() {
		return PassportPhoto;
	}

	public WebElement getTenthmarkscard() {
		return tenthmarkscard;
	}

	public WebElement getTenthCertificate() {
		return tenthCertificate;
	}

	public WebElement getPUCmarksCard() {
		return PUCmarksCard;
	}

	public WebElement getIdproof() {
		return Idproof;
	}

	public WebElement getPUCCertificate() {
		return PUCCertificate;
	}

	public WebElement getSignatiure() {
		return Signatiure;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	/**
	 * click on submit button
	 * 
	 * @Shridhar username
	 * @Shridhar password
	 * click submit
	 */
	public void UploadDocument(String photo,String T_marksC, String T_Cer,String P_marksC, String P_Cer,String Id_proof, String Signature) {
		PassportPhoto.sendKeys(photo);
		tenthmarkscard.sendKeys(T_marksC);
		tenthCertificate.sendKeys(T_Cer);
		PUCmarksCard.sendKeys(P_marksC);
		PUCCertificate.sendKeys(P_Cer);
		Idproof.sendKeys(Id_proof);
		Signatiure.sendKeys(Signature);
		checkBox.click();
	}

}
