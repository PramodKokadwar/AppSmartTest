package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class PlaceOrderPage extends TestBase {


	//  **** Enter The personal address for delivery  *** //

	// Enter the First Name
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstName;

	// Enter the last Name
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastname;

	// Enter the Street
	@FindBy(xpath = "//input[@id='street']")
	WebElement street;

	// Enter the Street number
	@FindBy(xpath = "//input[@id='street_no']")
	WebElement streetNum;

	// Enter the zip
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zip;

	// Enter the city
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	// Enter the email
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	// Enter the phone
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;


	// Click on save address button
	@FindBy(xpath = "//button[normalize-space()='Checkout (2/3)']")
	WebElement CheckoutCntinueBtn;


	// Click on place order button
	@FindBy(xpath="//button[type='button']")
	WebElement PlaceOrderButton;


	// Initializing the Page Objects:
	public PlaceOrderPage() {
		PageFactory.initElements(driver, this);
	}




	// Enter the first name
	public void entertheFirstName(String firstname)
	{
		firstName.sendKeys(firstname);
	}



	// Enter the last name
	public void entertheLastName(String lastName)
	{
		lastname.sendKeys(lastName);
	}


	// Enter the street
	public void entertheStreet(String Street)
	{
		street.sendKeys(Street);

	}

	// Enter the street no
	public void entertheStreetNo(String StreetNo)
	{
		streetNum.sendKeys(StreetNo);
	}


	// Enter the zip
	public void entertheZip(String Zip)
	{
		zip.sendKeys(Zip);
	}

	// Enter the email
	public void entertheEmail(String Email)
	{
		email.sendKeys(Email);
	}


	// Enter the phone
	public void enterthePhone(String Phone)
	{
		phone.sendKeys(Phone);
	}


	// click on save nd countinue button
	public void checkoutsaveCntinueButton()
	{
		CheckoutCntinueBtn.click();
	}


	// click and place order button
	public void placeOrderButtonButton()
	{
		PlaceOrderButton.click();
	}


}
