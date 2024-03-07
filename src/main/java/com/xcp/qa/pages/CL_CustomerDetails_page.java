package com.xcp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.xcp.qa.base.TestBase;

public class CL_CustomerDetails_page extends BML_customer_page {
	
	@FindBy(xpath = "//button[@ng-click='customer()']")
	WebElement CustomerLogin;

	@FindBy(id = "userSelect")
	WebElement Yourname_list;

	@FindBy(xpath = "//option[text() = 'Roshan Khapekar']")
	WebElement Name_Selected;
	
	@FindBy(xpath = "//button[@class ='btn btn-default']")
	WebElement LoginButton;

	@FindBy(xpath = "//strong[normalize-space()='1016']")
	WebElement accNumber;

	@FindBy(xpath = "//strong[normalize-space()='0']")
	WebElement accBalance;
	@FindBy(xpath = "//span[contains(text(),'Roshan Khapekar')]")
	WebElement text;

	@FindBy(xpath = "(//strong[normalize-space()='Dollar'])[1]")
	WebElement currency;
	
	public CL_CustomerDetails_page() {
		PageFactory.initElements(driver, this);
	}

	
		public void CL_Customerdetails() {
			
			 CustomerLogin.click();
		        System.out.println("User clicked on Customer Login");
		        Yourname_list.click();
		        System.out.println("User clicked on Name Dropdown");
		        Name_Selected.click();
		        System.out.println("User selected name as Roshan Khapekar");
		        LoginButton.click();
		        System.out.println("User clicked on Login Button");
		
			String S1 = accNumber.getText();
			String S2 = accBalance.getText();
			String S3 = text.getText();
			String S4 = currency.getText();

			Assert.assertEquals(S1, "1016", "Account Number is WRONG.");
			System.out.println("Actual Account Number : 1016");
			
			Assert.assertEquals(S2, "0", "Account Balance is WRONG.");
			System.out.println("Actual Account Balance : 0");
			
			Assert.assertEquals(S3, "Roshan Khapekar", "Customer name is Wrong");
			System.out.println("Customer name matched : Roshan Khapekar");
			
			Assert.assertEquals(S4, "Dollar", "Account currency is Wrong");
			System.out.println("Account currency matched : Dollar");
		
		
		}}
