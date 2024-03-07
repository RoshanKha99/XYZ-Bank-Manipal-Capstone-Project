package com.xcp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import com.xcp.qa.base.TestBase;

public class CL_Transaction_page extends CL_Deposit_page {
    
    
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    public
    WebElement Transactions_Button;
    
    @FindBy(xpath = "//input[@id='start']")
    WebElement dateBtn1;
    
    @FindBy(xpath = "//input[@id='end']")
    WebElement dateBtn2;
    
    @FindBy(xpath = "//button[@ng-show='right']")
    WebElement arrowBtn;
    
    @FindBy(xpath = "//button[@ng-click='reset()']")
    public
    WebElement Reset_Button;
    
    @FindBy(xpath = "//button[@ng-click='back()']")
    public
    WebElement Back_Button;
    
    @FindBy(xpath = "//button[@ng-click='byebye()']")
    public
    WebElement Logout_Button;
    @FindBy(xpath = "//button[@ng-click='home()']")
	WebElement Home_Button;

    public CL_Transaction_page() {
        PageFactory.initElements(driver, this);
    }
    
    // Method to add a new customer with provided details
    public void Customer_Trans(){
   
		
		Transactions_Button.click();
		System.out.println("User selected name Transactions Button");
		dateBtn1.click();
		System.out.println("User selects start date");
		dateBtn2.click();
		System.out.println("User selects end date");
		arrowBtn.click();
		System.out.println("User clicks on arrow below");
		Reset_Button.click();
		System.out.println("User clicked Reset Button");
		Back_Button.click();
		System.out.println("User clicked Back Button");
		Logout_Button.click();
		System.out.println("User clicked Logout Button");
		Home_Button.click();
		System.out.println("User navigated to homepage");
		
        
        }
    
}
