package com.xcp.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.xcp.qa.base.TestBase;

public class Homepage_Page extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	WebElement CL_Button;

	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement Home_Button;

	@FindBy(xpath = "(//button[normalize-space()='Bank Manager Login'])[1]")
	WebElement BML_Button;



public Homepage_Page() {
	PageFactory.initElements(driver, this);
}

public void Homepagefunction() {
	
	String title = driver.getTitle();
	Assert.assertEquals(title, "XYZ Bank", "Title is Wrong");
	System.out.println("Title Matched : XYZ Bank");

	waitForElementToBeVisible(CL_Button).click();
	System.out.println("Clicked on Customer Login Button");
	waitForElementToBeVisible(Home_Button).click();
	System.out.println("Clicked on Home Button");
	waitForElementToBeVisible(BML_Button).click();
	System.out.println("Clicked on Bank Manager Login Button");
	waitForElementToBeVisible(Home_Button).click();
	System.out.println("Clicked on Home Button");

}
private WebElement waitForElementToBeVisible(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.visibilityOf(element));
}
}