package com.xcp.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.xcp.qa.base.TestBase;

public class BML_OPen_Account_page extends BML_AddCustomer_Page {
	@FindBy(xpath = "//button[@ng-click ='openAccount()']")
	WebElement Open_AccountBtn;

	@FindBy(id = "userSelect")
	WebElement Name_List;

	@FindBy(xpath = "//option[text() = 'Roshan Khapekar']")
	WebElement Name_Selection;
	
	@FindBy(xpath = "//select[@ng-model = 'currency']")
	WebElement Currency_List;

	@FindBy(xpath = "//option[text() = 'Dollar']")
	WebElement Currency_Selection;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement ProcessBtn;
	

	@FindBy(xpath = "//select[@ng-model = 'custId']")
	WebElement Field_Validate;


	

	public BML_OPen_Account_page() {
		PageFactory.initElements(driver, this);
	}

	public void OpenAccoount_valid () {
		
		Open_AccountBtn.click();
		System.out.println("User clicked on Opeen Account");
		Name_List.click();
		System.out.println("User clicked on Name Dropdown");
		Name_Selection.click();
		System.out.println("User selected name as Roshan Khapekar");
		Currency_List.click();
		System.out.println("User clicked on Currency Dropdown");
		Currency_Selection.click();
		System.out.println("User selected currency as Dollar");
		ProcessBtn.click();
	
		Alert alert1 = driver.switchTo().alert();
        String alert1text1 = alert1.getText();
        alert1.accept();
        System.out.println(alert1text1);
        
	}
	public void OpenAccoount_invalid () {
		
		Name_List.click();
		System.out.println("User clicked on Name Dropdown");
		Currency_List.click();
		System.out.println("User clicked on Currency Dropdown");
		ProcessBtn.click();    
        Assert.assertTrue(Field_Validate.isDisplayed());
        System.out.println("Error will come as Please select item in list");
}}
