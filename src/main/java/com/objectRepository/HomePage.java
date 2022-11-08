package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath = "//h3[.='Patients']/..//div//a")
	private WebElement patientLpoginPage;
	@FindBy(xpath = "//h3[.='Doctors Login']/..//div//a") 
	private WebElement DoctorLoginPage;
	@FindBy(xpath = "//h3[.='Admin Login']/..//div//a")
	private WebElement adminLoginPage;
	
@FindBy(xpath = "//a[.='Home']")
private WebElement homeLink;
@FindBy(xpath = "//a[.='contact']")
private WebElement contactLink; 

//Initialization
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//Utilization
public WebElement getPatientLoginPage() {
	return patientLpoginPage;
}
public WebElement getDoctorLoginPage()
{
	return DoctorLoginPage;
	
}

public WebElement getAdminLoginPage()
{
	return adminLoginPage;
	
}
public WebElement getHomeLink()
{
	return homeLink;

	
}
public WebElement getContactLink() {
	return contactLink;
	
}  
//Business library
private void patientLoginPage() {
	patientLpoginPage.click();
}
public void DoctorLogin() {
	DoctorLoginPage.click();
}

public void AdminLogin()
{
	adminLoginPage.click();
	
}
}
