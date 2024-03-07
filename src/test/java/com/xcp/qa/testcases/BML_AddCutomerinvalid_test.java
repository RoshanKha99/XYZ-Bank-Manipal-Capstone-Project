package com.xcp.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xcp.qa.base.TestBase;
import com.xcp.qa.pages.BML_AddCustomer_Page;
import com.xcp.qa.pages.BML_AddCustomerinvalid_Page;



public class BML_AddCutomerinvalid_test extends TestBase {
	BML_AddCustomerinvalid_Page BML_AddcustinvalidPage;

	public BML_AddCutomerinvalid_test() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		BML_AddcustinvalidPage = new BML_AddCustomerinvalid_Page();
	}
	@Test
	 public void verifyAddCustomerFunctionality() {
        // Perform Bank Manager login
		BML_AddcustinvalidPage.loginAsBankManager();
        
        // Add a new customer with details from config properties
		
		BML_AddcustinvalidPage.addCustomerWithInvalidData(prop.getProperty("firstnamein"), prop.getProperty("lastnamein"), prop.getProperty("postcodein"));
		

	        // Assert that an error is displayed
	        assertTrue(isErrorDisplayed(), "Error message is not displayed for invalid data");
	    }

	    private boolean isErrorDisplayed() {
	        // Logic to check if error message is displayed
	        // For example, you can check if an error message element is present on the page
	        // If the error message is displayed, return true; otherwise, return false
	        return false; // Placeholder return value
	    }
	
		}


