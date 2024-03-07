package com.xcp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.xcp.qa.base.TestBase;

public class BML_customer_page extends BML_OPen_Account_page {
	
	@FindBy(xpath = "//button[@ng-click ='showCust()']")
	WebElement Customersbtn;
	
	@FindBy(xpath = "//div[@class='marTop ng-scope']")
	WebElement table;
	
	@FindBy(xpath = "//input[@ng-model='searchCustomer']")
	WebElement Search_bar;
	
	@FindBy(xpath = "//button[@ng-click='deleteCust(cust)']")
	WebElement Delete_Button;
	
	@FindBy(xpath = "//button[@ng-click='home()']")
	WebElement Home_Button;
	//button[@ng-click='home()']

	public BML_customer_page() {
		PageFactory.initElements(driver, this);
	}

	public void CustomersTabletest () {
		
		Customersbtn.click();
		System.out.println("User clicked on Customers option");
		Assert.assertTrue(table.isDisplayed());
        System.out.println("User able to view details of customers table");
		Search_bar.click();
		Search_bar.sendKeys("R12345");
		System.out.println("User search for name Roshan");
		Delete_Button.click();
		System.out.println("Customer Roshan Deleted from the table");
		Home_Button.click();
		System.out.println("User navigated to homepage");
        
	}
}