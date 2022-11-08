package com.objectRepository;

import javax.activation.MailcapCommandMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class AddDoctorPage extends WebDriverUtility {
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement DoctorSpecialization;
	
	@FindBy(xpath ="//input[@name=\"docname\"]" )
private WebElement DoctorName ;
	
	@FindBy(xpath ="//textarea[@name='clinicaddress']" )
	private WebElement ClinicAdress ;
	
	@FindBy(xpath = "//input[@name='docfees']")
	private WebElement DocFees;
	
	@FindBy(xpath = "//input[@name='doccontact']")
	private WebElement DocContact ;
	
	@FindBy(xpath = "//input[@id='docemail']")
	private WebElement DocEmail ;
	
	@FindBy(xpath = "//input[@name='npass']")
	private WebElement  Password;
	
	@FindBy(xpath = "//input[@name='cfpass']")
	private WebElement ConfirmPassword ;
	
	@FindBy(xpath = "//button[@name='submit']")
	private  WebElement submit;
	
 public AddDoctorPage (WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }

public WebElement getDoctorSpecialization() {
	return DoctorSpecialization;
}

public WebElement getDoctorName() {
	return DoctorName;
}

public WebElement getClinicAdress() {
	return ClinicAdress;
}

public WebElement getDocFees() {
	return DocFees;
}

public WebElement getDocContact() {
	return DocContact;
}

public WebElement getDocEmail() {
	return DocEmail;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getConfirmPassword() {
	return ConfirmPassword;
}

public WebElement getSubmit() {
	return submit;

}
 public void AddDoctor(String dropdown,String dname, String cadd, String amount, String doctorcontactno, String password, String confirm) {
	 DoctorSpecialization.click();
	 selectByVisibleText(DoctorSpecialization,dropdown);
	 DoctorName.sendKeys(dname);
	 ClinicAdress.sendKeys(cadd);
	 DocFees.sendKeys(amount);
	 getDocContact().sendKeys(doctorcontactno);
	 DocEmail.sendKeys();
	 Password.sendKeys(password);
	 ConfirmPassword.sendKeys(confirm);
	 submit.click();
 }


	
}

