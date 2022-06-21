package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	
	// enter the input pickup address
		@FindBy(id = "react-select-2-input")
		WebElement inputPickUp;
		
		
		@FindBy(id = "//div[@class='BranchCard card active']//button[contains(text(),'Pickup here')]")
		WebElement PickupBremen;
		
		// Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}



		// Enter the pickup address 
		public void enterthePickupAddress(String pickupaddress)
		{
			inputPickUp.sendKeys(pickupaddress);
		}

		
		// click on here on Bremen pickup address
		public void clickBremen()
		{
			PickupBremen.click();
		}
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}


}
