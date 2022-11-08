package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class patientDashbord {
	@FindBy(xpath = "//span[.=' Dashboard ']")
	private WebElement patientDashbordButton;
	
	@FindBy(xpath ="//span[contains(.,' Book Appointment')]" )
private WebElement bookAppointmentButton;
	
	@FindBy(xpath ="//span[.=' Appointment History ']" )
	private WebElement AppointmentHistoryButton;
	
	@FindBy(xpath = "//span[.=' Medical History ']")
	private WebElement medicalHistoryButton;
	
	@FindBy(xpath = "//span[@class='username']")
	private WebElement logOutDropdownButton;
	
	@FindBy(xpath = "//a[contains(.,'Log Out')]")
	private WebElement LogOutButton;
	
	public patientDashbord(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//utilization
	public WebElement getPatientDashbordButton() {
		return patientDashbordButton;
	}

	public WebElement getBookAppointmentButton() {
		return bookAppointmentButton;
	}

	public WebElement getAppointmentHistoryButton() {
		return AppointmentHistoryButton;
	}

	public WebElement getMedicalHistoryButton() {
		return medicalHistoryButton;
	}

	public WebElement getLogOutDropdownButton() {
		return logOutDropdownButton;
	}

	public WebElement getLogOutButton() {
		return LogOutButton;
		
	}
	

}
	
