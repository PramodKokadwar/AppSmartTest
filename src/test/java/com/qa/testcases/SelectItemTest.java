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

public class SelectItemTest extends TestBase  {


	TestUtil testUtil;
	CartPage cartPage;
	HomePage homePage;


	public SelectItemTest() {
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
	public void clickBremenRestaurant() throws InterruptedException, IOException {


		// click on bremen restarurant
		homePage.clickBremen();

		// click on burger menu
		cartPage.clickOnBurgerTab();

		// click on humburger
		cartPage.clickOnHumBurger();

		// verrify item added and  do checkout. 
		cartPage.clickonCheckoutButton();


	}




	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
