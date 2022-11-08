package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	@FindBy(xpath = "//span[contains(.,' Dashboard ')]")
	private WebElement AdminDashbordButton;
	
	@FindBy(xpath ="//span[contains(.,' Doctors ')]" )
private WebElement adminPageDoctor;
	
	@FindBy(xpath =" //span[contains(.,'Doctor Specialization')]" )
	private WebElement doctorSpecializationInAdminPage;
	
	@FindBy(xpath = "//span[contains(.,' Add Doctor')]")
	private WebElement adddoctorButton;
	
	@FindBy(xpath = "//span[contains(.,' Manage Doctors')]")
	private WebElement manageDoctorButton;
	
	@FindBy(xpath = "//span[contains(.,' Users ')]")
	private WebElement UserButton;
	
	@FindBy(xpath = "//span[contains(.,' Manage Users ')]")
	private WebElement manageUserButton;
	
	@FindBy(xpath = "//span[contains(.,'Patients')]")
	private WebElement PatientPageInAdminPage;
	
	@FindBy(xpath = "//span[contains(.,' Manage Patients ')]")
	private WebElement ManagePtientButton;
	
	
	
	@FindBy(xpath ="//span[contains(.,' Appointment History')] " )
	private WebElement AppointmentHistoryButtoin;
	
	@FindBy(xpath = "//span[contains(.,' Conatctus Queries ')]")
	private WebElement conatctusQueriesButton;
	
	@FindBy(xpath = "//span[contains(.,'Unread Query ')]")
	private WebElement UnreadQueryButton ;
	
	@FindBy(xpath = "//span[contains(.,' Read Query ')]")
	private WebElement ReadQueryButton;
	
	@FindBy(xpath = "//span[contains(.,' Doctor Session Logs')]")
	private WebElement DoctorSessionLogsButton;
	
	@FindBy(xpath = "//span[contains(.,' User Session Logs ')]")
	private WebElement UserSessionLogsButton;
	
	@FindBy(xpath = "//span[contains(.,' Reports ')]")
	private WebElement AdminPageReportsButton;
	
	
	@FindBy(xpath = "//span[contains(.,'B/w dates reports ')]")
	private WebElement BetweenDatesButton  ;
	
	@FindBy(xpath = "//span[contains(.,' Patient Search ')]")
	private WebElement patientSearchButton ;
	
	@FindBy(xpath = "//i[@class='ti-angle-down']")
	private WebElement AdminDropDownButton ;
	
	@FindBy(xpath = "//a[contains(.,'Change Password')] ")
	private WebElement  adminPasswordChangeButton;
	
	@FindBy(xpath = "//a[contains(.,'Log Out')] ")
	private WebElement  AdminLogOutButton;
	
			public AdminHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			//Utilization

			public WebElement getAdminDashbordButton() {
				return AdminDashbordButton;
			}

			public WebElement getAdminPageDoctor() {
				return adminPageDoctor;
			}

			public WebElement getDoctorSpecializationInAdminPage() {
				return doctorSpecializationInAdminPage;
			}

			public WebElement getAdddoctorButton() {
				return adddoctorButton;
			}

			public WebElement getManageDoctorButton() {
				return manageDoctorButton;
			}

			public WebElement getUserButton() {
				return UserButton;
			}

			public WebElement getManageUserButton() {
				return manageUserButton;
			}

			public WebElement getPatientPageInAdminPage() {
				return PatientPageInAdminPage;
			}

			public WebElement getManagePtientButton() {
				return ManagePtientButton;
			}

			public WebElement getAppointmentHistoryButtoin() {
				return AppointmentHistoryButtoin;
			}

			public WebElement getConatctusQueriesButton() {
				return conatctusQueriesButton;
			}

			public WebElement getUnreadQueryButton() {
				return UnreadQueryButton;
			}

			public WebElement getReadQueryButton() {
				return ReadQueryButton;
			}

			public WebElement getDoctorSessionLogsButton() {
				return DoctorSessionLogsButton;
			}

			public WebElement getUserSessionLogsButton() {
				return UserSessionLogsButton;
			}

			public WebElement getAdminPageReportsButton() {
				return AdminPageReportsButton;
			}


			public WebElement getBetweenDatesButton() {
				return BetweenDatesButton;
			}

			public WebElement getPatientSearchButton() {
				return patientSearchButton;
			}

			public WebElement getAdminDropDownButton() {
				return AdminDropDownButton;
			}

			public WebElement getAdminPasswordChangeButton() {
				return adminPasswordChangeButton;
			}

			public WebElement getAdminLogOutButton() {
				return AdminLogOutButton;
			}
			
			//business library
			
			public void AdminDoctorPage() {
				adminPageDoctor.click();
			}
			public void adddoctorButton() {
				adddoctorButton.click();
			}
			public void manageDoctorButton() {
				manageDoctorButton.click();
			}
			public void AppointmentHistoryButtoin(){
				AppointmentHistoryButtoin.click();
			}
}

	