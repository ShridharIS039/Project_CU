package com.Centurion_University_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdmissionForm {

	

	// Declaration
	@FindBy(id = "uphn1")
	private WebElement mobilenotextedit;

	@FindBy(id = "uphn2")
	private WebElement mobilenotextedit2;

	@FindBy(id = "ufname")
	private WebElement Fathernametextedit;
	
	@FindBy(id = "ufocc")
	private WebElement FatherOccutextedit;

	@FindBy(id = "umname")
	private WebElement Mothernametextedit;

	@FindBy(id = "umocc")
	private WebElement MotherOccutextedit;
	
	@FindBy(id = "inc")
	private WebElement incometextedit;

	@FindBy(id = "umphn")
	private WebElement mobilenotextedit3;

	@FindBy(id = "ufphn")
	private WebElement mobilenotextedit4;
	
	@FindBy(id = "cadr")
	private WebElement addresstextedit;

	@FindBy(id = "cast")
	private WebElement Statetextedit;
	@FindBy(id = "capin")
	private WebElement Pintextedit;

	@FindBy(id = "camob")
	private WebElement mobilenotextedit5;

	@FindBy(id = "padr")
	private WebElement addresstextedit2;
	
	@FindBy(id = "past")
	private WebElement Statetextedit2;

	@FindBy(id = "papin")
	private WebElement Pintextedit2;

	@FindBy(id = "pamob")
	private WebElement mobilenotextedit6;
	
	@FindBy(id = "natn")
	private WebElement Nationalitytextedit;

	@FindBy(id = "relg")
	private WebElement Religiontextedit;

	@FindBy(id = "oarank")
	private WebElement Ranktextedit;
	
	@FindBy(id = "oabrn")
	private WebElement Branchextedit;

	@FindBy(id = "oaroll")
	private WebElement Rolltextedit;

	@FindBy(id = "pcm")
	private WebElement PCMtextedit;
	
	@FindBy(id = "nob1")
	private WebElement TenthUniversitytextedit;

	@FindBy(id = "yop1")
	private WebElement TenthPassingyeartextedit;

	@FindBy(id = "tm1")
	private WebElement Totalmarkstextedit;
	
	@FindBy(id = "mo1")
	private WebElement marksobextedit;

	@FindBy(id = "divs1")
	private WebElement TenthDivtextedit;

	@FindBy(id = "pom1")
	private WebElement Marksinpercentage;
	
	@FindBy(id = "nob2")
	private WebElement TwelthUniversitytextedit;

	@FindBy(id = "yop2")
	private WebElement TwelthPassingyeartextedit;

	@FindBy(id = "tm2")
	private WebElement Totalmarkstextedit2;
	
	@FindBy(id = "mo2")
	private WebElement marksobextedit2;

	@FindBy(id = "divs2")
	private WebElement TwelthDivtextedit;

	@FindBy(id="pom2")
	private WebElement MarksinpercentagePuc;
	
	@FindBy(xpath="//input[@id='frmnext']")
	private WebElement nextbtn;
	

//initialization

	public AdmissionForm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization

	public WebElement getnextbtn() {
		return nextbtn; 
	}
	public WebElement getMobilenotextedit() {
		return mobilenotextedit;
	}

	public WebElement getMobilenotextedit2() {
		return mobilenotextedit2;
	}

	public WebElement getFathernametextedit() {
		return Fathernametextedit;
	}

	public WebElement getFatherOccutextedit() {
		return FatherOccutextedit;
	}

	public WebElement getMothernametextedit() {
		return Mothernametextedit;
	}

	public WebElement getMotherOccutextedit() {
		return MotherOccutextedit;
	}

	public WebElement getIncometextedit() {
		return incometextedit;
	}

	public WebElement getMobilenotextedit3() {
		return mobilenotextedit3;
	}

	
	
	
	public WebElement getMobilenotextedit4() {
		return mobilenotextedit4;
	}

	public WebElement getAddresstextedit() {
		return addresstextedit;
	}

	public WebElement getStatetextedit() {
		return Statetextedit;
	}

	public WebElement getPintextedit() {
		return Pintextedit;
	}

	public WebElement getMobilenotextedit5() {
		return mobilenotextedit5;
	}

	public WebElement getAddresstextedit2() {
		return addresstextedit2;
	}

	public WebElement getStatetextedit2() {
		return Statetextedit2;
	}
	
	
	public WebElement getPintextedit2() {
		return Pintextedit2;
	}

	public WebElement getMobilenotextedit6() {
		return mobilenotextedit6;
	}

	public WebElement getNationalitytextedit() {
		return Nationalitytextedit;
	}

	public WebElement getReligiontextedit() {
		return Religiontextedit;
	}

	public WebElement getRanktextedit() {
		return Ranktextedit;
	}

	public WebElement getBranchextedit() {
		return Branchextedit;
	}

	public WebElement getRolltextedit() {
		return Rolltextedit;
	}

	public WebElement getPCMtextedit() {
		return PCMtextedit;
	}
	
	
	public WebElement getTenthUniversitytextedit() {
		return TenthUniversitytextedit;
	}

	public WebElement getTenthPassingyeartextedit() {
		return TenthPassingyeartextedit;
	}

	public WebElement getTotalmarkstextedit() {
		return Totalmarkstextedit;
	}

	public WebElement getMarksobextedit() {
		return marksobextedit;
	}

	public WebElement getTenthDivtextedit() {
		return TenthDivtextedit;
	}

	public WebElement getMarksinpercentage() {
		return Marksinpercentage;
	}

	public WebElement getTwelthUniversitytextedit() {
		return TwelthUniversitytextedit;
	}

	public WebElement getTwelthPassingyeartextedit() {
		return TwelthPassingyeartextedit;
	}

	public WebElement getTotalmarkstextedit2() {
		return Totalmarkstextedit2;
	}

	public WebElement getMarksobextedit2() {
		return marksobextedit2;
	}

	public WebElement getTwelthDivtextedit() {
		return TwelthDivtextedit;
	}

	public WebElement getMarksinpercentagePuc() {
		return MarksinpercentagePuc;
	}


/**
 * click on submit button
 * @Shridhar username
 * @Shridhar password
 */
public void EnterAllValiddetails(String MOB_NO, String MOB_NO2,String F_name , String F_occ,String M_name , String M_occ,String Pa_income , String MOB_NO3,String MOB_NO4 , String Address,String state , String Pin,String MOB_NO5 , String Address2,String state2 , String Pin2,String MOB_NO6, String Nationality , String Religion ,String Rank, String Al_branch,String Roll_no , String Pcm, String T_UN , String T_year,String T_TM , String T_marks_Ob, String T_div , String T_Per_Marks,String P_UN , String P_year , String P_TM , String P_marks_Ob,String P_div , String P_Per_Marks) {
	mobilenotextedit.sendKeys(MOB_NO);
	mobilenotextedit2.sendKeys(MOB_NO);
	Fathernametextedit.sendKeys(F_name);
	FatherOccutextedit.sendKeys(F_occ);
	Mothernametextedit.sendKeys(M_name);
	MotherOccutextedit.sendKeys(M_occ);
	incometextedit.sendKeys(Pa_income);
	mobilenotextedit3.sendKeys(MOB_NO);
	mobilenotextedit4.sendKeys(MOB_NO);
	addresstextedit.sendKeys(Address);
	Statetextedit.sendKeys(state);
	Pintextedit.sendKeys(Pin);
	mobilenotextedit5.sendKeys(MOB_NO);
	addresstextedit2.sendKeys(Address);
	Statetextedit2.sendKeys(state);
	Pintextedit2.sendKeys(Pin);
	mobilenotextedit6.sendKeys(MOB_NO);
	Nationalitytextedit.sendKeys(Nationality);
	Religiontextedit.sendKeys(Religion);
	Ranktextedit.sendKeys(Rank);
	Branchextedit.sendKeys(Al_branch);
	Rolltextedit.sendKeys(Roll_no);
	PCMtextedit.sendKeys(Pcm);
	TenthUniversitytextedit.sendKeys(T_UN);
	TenthPassingyeartextedit.sendKeys(T_year);
	Totalmarkstextedit.sendKeys(T_TM);
	marksobextedit.sendKeys(T_marks_Ob);
	TenthDivtextedit.sendKeys(T_div);
	Marksinpercentage.sendKeys(T_Per_Marks);
	TwelthUniversitytextedit.sendKeys(P_UN);
	TwelthPassingyeartextedit.sendKeys(P_year);
	Totalmarkstextedit2.sendKeys(P_TM);
	marksobextedit2.sendKeys(P_marks_Ob);
	TwelthDivtextedit.sendKeys(P_div);
	MarksinpercentagePuc.sendKeys(P_Per_Marks);
	nextbtn.click();
}

}
