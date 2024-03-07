package com.xcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xcp.qa.base.TestBase;
import com.xcp.qa.pages.BML_AddCustomer_Page;
import com.xcp.qa.pages.BML_OPen_Account_page;
import com.xcp.qa.pages.BML_customer_page;



public class BML_Customers_test extends BML_OPen_Account_page {
	BML_AddCustomer_Page BML_AddcustPage;
	BML_OPen_Account_page BML_OpenACpage;
	BML_customer_page BMLCustpage;

	public BML_Customers_test() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		BML_AddcustPage = new BML_AddCustomer_Page();
		BML_OpenACpage = new BML_OPen_Account_page();
		BMLCustpage = new BML_customer_page();
	}
	@Test
	 public void OpenAccountCustomerTest() {
        // Perform Bank Manager login
		BML_AddcustPage.loginAsBankManager();
        
        // Add a new customer with details from config properties
		BML_AddcustPage.addCustomervalid(prop.getProperty("firstnamev"), prop.getProperty("lastnamev"), prop.getProperty("postcodev"));
		BML_AddcustPage.addCustomerinvalid(prop.getProperty("firstnamein"), prop.getProperty("lastnamein"), prop.getProperty("postcodein"));
		BML_OpenACpage.OpenAccoount_valid();
		System.out.println("Account Opened By Bank manager successfully");
		BML_OpenACpage.OpenAccoount_invalid();
		System.out.println("Error - Please select an item in the list");
		BMLCustpage.CustomersTabletest();
		System.out.println("Customer Roshan Deleted from list");
	}}


