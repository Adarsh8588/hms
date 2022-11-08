package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement adminusername;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement adminpassword;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement adminSubmitButton;
	
	//initilization
	public AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement adminusername() {
		return adminusername;

		
		
			}
	public WebElement getadminpassword() {
		return adminpassword;
		
		
		
		
	}
	public WebElement getadminsubmitbutton() {
		return adminSubmitButton;
		
		
		
	}
	//business library
	public void AdminLoginPage(String username,String password) {
		adminusername.sendKeys(username);
		adminpassword.sendKeys(password);
		adminSubmitButton.click();
	}


}
