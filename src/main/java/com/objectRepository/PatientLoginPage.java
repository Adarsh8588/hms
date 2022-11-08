package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLoginPage {


	//declaration
	@FindBy(xpath = "//input[@name='username']")
	private WebElement patientusername;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement patientpassword;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement patientSubmitButton;
	
	//initilization
	public PatientLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getpatientusername() {
		return patientusername;
		
			}
	public WebElement getpatientpassword() {
		return patientpassword;
		
	}
	public WebElement getpatientsubmitbutton() {
		return patientSubmitButton;
		
	}
	//business library
	public void patientLogin(String username,String password) {
		patientusername.sendKeys(username);
		patientpassword.sendKeys(password);
		patientSubmitButton.click();
	}
}

