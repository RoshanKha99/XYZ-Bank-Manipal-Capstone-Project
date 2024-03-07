package com.xcp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import com.xcp.qa.base.TestBase;

public class CL_Withdrawl_page extends CL_Deposit_page {
    
    
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    public
    WebElement Withdraw_Button;
    
    
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement inputWithdraw;
    
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawSubmitBtn;
  
    @FindBy(xpath = "//span[@ng-show='message']")
    public
    WebElement message;
    @FindBy(xpath = "//strong[normalize-space()='1016']")
    WebElement accNumber;

    @FindBy(xpath = "//strong[normalize-space()='531000']")
    WebElement accBalance;
  

    public CL_Withdrawl_page() {
        PageFactory.initElements(driver, this);
    }
    
    
    // Method to add a new customer with provided details
    public void Withdrawltest(String wd1,String wd2,String wd3,String wd4,String wd5,String wd6 ){
    	
    	String[] withdrawalAmounts = {wd1, wd2, wd3, wd4, wd5, wd6};

    	// Loop to iterate through the withdrawalAmounts array
    	for (String amount : withdrawalAmounts) {
    	    WebElement visiblewithdrawal = waitForElementToBeVisible(Withdraw_Button);
    	    visiblewithdrawal.click();
    	    System.out.println("Add Customer Button is Clicked :");
    	    inputWithdraw.sendKeys(amount);
    	    withdrawSubmitBtn.click();
    	   
    	}	
    	 /*String ACNo = accNumber.getText();
		String ACBa = accBalance.getText();
		
		Assert.assertEquals(ACNo, "1016", "Account Number is WRONG. Actual Account Number : " + accNumber.getText());
		Assert.assertEquals(ACBa, "531000", "Account Balance is WRONG. Actual Account Balance : " + accBalance.getText());
	        */
    
} private WebElement waitForElementToBeVisible(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.visibilityOf(element));
}}
