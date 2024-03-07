package com.xcp.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xcp.qa.base.TestBase;

public class BML_AddCustomerinvalid_Page extends TestBase {
	
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

	public BML_AddCustomerinvalid_Page() {
		PageFactory.initElements(driver, this);
	}
	 public void loginAsBankManager() {
		 Bank_Manager_Login_Button.click();
	    }
	        
	 public void addCustomerWithInvalidData(String firstNamein, String lastNamein, String postCodein) {
	        Add_Customer_Button.click();
	        First_Name.sendKeys(firstNamein);
	        Last_Name.sendKeys(lastNamein);
	        PostCode.sendKeys(postCodein);
	        AddCustbtn.click();
	        
	        // Validate if an alert is displayed for invalid data
	        if (isAlertPresent()) {
	            Alert alert = driver.switchTo().alert();
	            String alertText = alert.getText();
	            alert.accept();
	            System.out.println("Alert Message: " + alertText);
	        } else {
	            System.out.println("No alert message displayed for invalid data.");
	        }
	    }
	    
	    private boolean isAlertPresent() {
	        try {
	            driver.switchTo().alert();
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }
	}
	

