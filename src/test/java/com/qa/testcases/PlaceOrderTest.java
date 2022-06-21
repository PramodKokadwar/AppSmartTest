package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CartPage;
import com.qa.pages.HomePage;
import com.qa.pages.PlaceOrderPage;
import com.qa.util.TestUtil;

public class PlaceOrderTest  extends TestBase {


	TestUtil testUtil;
	CartPage cartPage;
	HomePage homePage;
	PlaceOrderPage placeOrderPage;



	public PlaceOrderTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		cartPage = new CartPage();
		homePage = new HomePage();
		placeOrderPage = new PlaceOrderPage();

	}


	@Test(priority = 1)
	public void selectItemAndPlaceTheOrder() throws InterruptedException, IOException {


		homePage.clickBremen();

		// Verify navigate to next page
		String loginPageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(loginPageTitle, "Order now at Enjoy Pizza Bre-Del | Delivery service Bremen");


		// click on bremen restarurant
		homePage.clickBremen();

		// click on burger menu
		cartPage.clickOnBurgerTab();

		// click on humburger
		cartPage.clickOnHumBurger();

		// verrify item added and  do checkout. 
		cartPage.clickonCheckoutButton();

		
		
		// fill the address for the delivery
		
		placeOrderPage.entertheFirstName("Pramod");
		placeOrderPage.entertheLastName("Kokadwar");
		placeOrderPage.entertheStreet("neugass");
		placeOrderPage.entertheStreetNo("2");
		placeOrderPage.entertheZip("65183");
		placeOrderPage.enterthePhone("+49 1736554788");
		placeOrderPage.entertheEmail("pramodkokadwar@gmail.com");
		placeOrderPage.checkoutsaveCntinueButton();
		
		placeOrderPage.placeOrderButtonButton();
		
		
		// Verify navigate to next page
		String result = placeOrderPage.getSucessMessage();
		Assert.assertEquals(result, "Your order was successful!");


	}



	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
