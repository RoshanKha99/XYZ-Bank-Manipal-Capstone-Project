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

public class CL_Deposit_page extends CL_CustomerDetails_page {
	
	@FindBy(xpath = "//button[@ng-click='deposit()']")
	WebElement Deposit_btn;
	
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement inputDeposit;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Amount_deposit_button;
	
	 @FindBy(xpath = "//span[@ng-show='message']")
	    public
	    WebElement message;
	
	public CL_Deposit_page() {
		PageFactory.initElements(driver, this);
	}
     
		
		 public void CL_Deposittest(String am1,String am2,String am3,String am4,String am5){
		String[] amounts = {am1, am2, am3, am4, am5};

		// Loop to iterate through the amounts array
		for (String amount : amounts) {
		    WebElement visibledeposit = waitForElementToBeVisible(Deposit_btn);
		    visibledeposit.click();
		    System.out.println("Add Customer Button is Clicked :");
		    
		    inputDeposit.sendKeys(String.valueOf(amount));
		    Amount_deposit_button.click();
   Deposit_btn.click();
	        
	        
        
	}

}

private WebElement waitForElementToBeVisible(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.visibilityOf(element));
    }
		}
