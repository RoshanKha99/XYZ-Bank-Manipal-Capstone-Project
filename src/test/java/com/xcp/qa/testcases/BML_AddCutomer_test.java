package com.xcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xcp.qa.base.TestBase;
import com.xcp.qa.pages.BML_AddCustomer_Page;



public class BML_AddCutomer_test extends TestBase {
	BML_AddCustomer_Page BML_AddcustPage;

	public BML_AddCutomer_test() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		BML_AddcustPage = new BML_AddCustomer_Page();
	}
	@Test
	 public void verifyAddCustomerFunctionality() {
        // Perform Bank Manager login
		BML_AddcustPage.loginAsBankManager();
        
        // Add a new customer with details from config properties
		BML_AddcustPage.addCustomervalid(prop.getProperty("firstnamev"), prop.getProperty("lastnamev"), prop.getProperty("postcodev"));
		BML_AddcustPage.addCustomerinvalid(prop.getProperty("firstnamein"), prop.getProperty("lastnamein"), prop.getProperty("postcodein"));
	}}


