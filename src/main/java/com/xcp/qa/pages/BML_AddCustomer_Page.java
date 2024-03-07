package com.xcp.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xcp.qa.base.TestBase;

public class BML_AddCustomer_Page extends TestBase {
	
	@FindBy(xpath = "//button[@ng-click='manager()']")
	WebElement Bank_Manager_Login_Button;
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement Add_Customer_Button;
	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement First_Name;
	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement Last_Name;
	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement PostCode;
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement AddCustbtn;

	public BML_AddCustomer_Page() {
		PageFactory.initElements(driver, this);
	}
	 public void loginAsBankManager() {
		 Bank_Manager_Login_Button.click();
	    }
	        public void addCustomervalid(String firstNamev, String lastNamev, String postCodev){
	   
	        Add_Customer_Button.click();
	        First_Name.sendKeys(firstNamev);
	        Last_Name.sendKeys(lastNamev);
	        PostCode.sendKeys(postCodev);
	        AddCustbtn.click();
	        Alert alert = driver.switchTo().alert();
	        String alerttext = alert.getText();
	        alert.accept();
	        System.out.println(alerttext);
	        
	        }public void addCustomerinvalid(String firstNamein, String lastNamein, String postCodein){
	     	   
		        Add_Customer_Button.click();
		        First_Name.sendKeys(firstNamein);
		        Last_Name.sendKeys(lastNamein);
		        PostCode.sendKeys(postCodein);
		        AddCustbtn.click();
		        Alert alert = driver.switchTo().alert();
		        String alerttext = alert.getText();
		        alert.accept();
		        System.out.println(alerttext);
	}}
		
	

