package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class doctorLoginPage {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement doctorusername;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement doctorpassword;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement doctorSubmitButton;
	
	//initilization
	public doctorLoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	//utilization
	
	public WebElement getdoctorusername() {
		return doctorusername;
		
		
			}
	public WebElement getdoctorpassword() {
		return doctorpassword;
		
		
		
	}
	public WebElement getdoctorsubmitbutton() {
		return doctorSubmitButton;
		
		
	}
	//business library
	public void patientLogin(String username,String password) {
		doctorusername.sendKeys(username);
		doctorpassword.sendKeys(password);
		doctorSubmitButton.click();
	}

}
