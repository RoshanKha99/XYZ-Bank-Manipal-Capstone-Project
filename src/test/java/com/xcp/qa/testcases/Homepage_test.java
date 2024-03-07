package com.xcp.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xcp.qa.base.TestBase;
import com.xcp.qa.pages.Homepage_Page;

public class Homepage_test extends TestBase {
	Homepage_Page homepage;

public Homepage_test() {
	super();
}
@BeforeMethod
public void setUp() {
initialization();
homepage = new Homepage_Page();
}
@Test
public void Homepagefun() {
	homepage.Homepagefunction();

}
}