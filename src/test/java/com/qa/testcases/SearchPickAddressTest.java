package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.CartPage;
import com.qa.pages.PlaceOrderPage;
import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class SearchPickAddressTest extends TestBase  {


	TestUtil testUtil;
	CartPage cartPage;
	HomePage homePage;



	public SearchPickAddressTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		cartPage = new CartPage();
		homePage = new HomePage();

	}


	@Test(priority = 1)
	public void enterThePickupAddress() throws InterruptedException, IOException {


		homePage.enterthePickupAddress("macd berlin");

		// Verify title of home page
		String loginPageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(loginPageTitle, "Order now at Enjoy Pizza Bre-Del | Delivery service Bremen");

	}

	@Test(priority = 2)
	public void seachPickupaddress() throws InterruptedException, IOException {


		homePage.clickBremen();

		// Verify navigate to next page
		String loginPageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(loginPageTitle, "Order now at Enjoy Pizza Bre-Del | Delivery service Bremen");

	}




	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
