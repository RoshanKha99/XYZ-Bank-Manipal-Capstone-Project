package com.xcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xcp.qa.base.TestBase;
import com.xcp.qa.pages.BML_AddCustomer_Page;
import com.xcp.qa.pages.BML_OPen_Account_page;
import com.xcp.qa.pages.BML_customer_page;
import com.xcp.qa.pages.CL_CustomerDetails_page;
import com.xcp.qa.pages.CL_Deposit_page;
import com.xcp.qa.pages.CL_Transaction_page;
import com.xcp.qa.pages.CL_Withdrawl_page;



public class CL_transactions_test extends CL_Deposit_page {
	BML_AddCustomer_Page BML_AddcustPage;
	BML_OPen_Account_page BML_OpenACpage;
	BML_customer_page BMLCustpage;
	CL_CustomerDetails_page CLcustomerdetail;
	CL_Deposit_page Cldeposit;
	CL_Withdrawl_page Clwithdraw;
	CL_Transaction_page cLtransact;
	
	public CL_transactions_test() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		BML_AddcustPage = new BML_AddCustomer_Page();
		BML_OpenACpage = new BML_OPen_Account_page();
		BMLCustpage = new BML_customer_page();
		CLcustomerdetail= new CL_CustomerDetails_page();
		Cldeposit = new CL_Deposit_page();
		Clwithdraw = new CL_Withdrawl_page();
		cLtransact = new CL_Transaction_page();
	}
	@Test
	 public void Deposit_test() {
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
		CLcustomerdetail.CL_Customerdetails();
		Cldeposit.CL_Deposittest(prop.getProperty("deposit1"),prop.getProperty("deposit2"),prop.getProperty("deposit3"),prop.getProperty("deposit4"),prop.getProperty("deposit5"));
		System.out.println("Amount deposited");	
		Clwithdraw.Withdrawltest(prop.getProperty("withdrawal1"),prop.getProperty("withdrawal2"),prop.getProperty("withdrawal3"),prop.getProperty("withdrawal4"),prop.getProperty("withdrawal5"),prop.getProperty("withdrawal6"));
		cLtransact.Customer_Trans();
	}
	}


