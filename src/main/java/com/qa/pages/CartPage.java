package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class CartPage extends TestBase {




	// click on burger tab
	@FindBy(xpath = "//div[@class='swiper-slide slider-link swiper-slide-next']")
	WebElement BugerTab;


	// click on Humburger
	@FindBy(xpath = "//div[@data-testid='product-price-on-btn'][1]")
	WebElement Humberger;


	// click on shopping cart button
	@FindBy(xpath = "//div[@id='shopping-cart-panel']")
	WebElement clickOnshoppingCart;


	// click on checkout button
	@FindBy(xpath = "//button[normalize-space()='Checkout (1/3)']")
	WebElement clickOnCheckoutButton;





	// Initializing the Page Objects:
	public CartPage() {
		PageFactory.initElements(driver, this);
	}


	// click on the Burger
	public void clickOnBurgerTab()
	{
		BugerTab.click();
	}


	// click on the HumBurger
	public void clickOnHumBurger()
	{
		Humberger.click();
	}


	// click on the shopping cart
	public void clickOnShoppingcart()
	{
		clickOnshoppingCart.click();
	}


	// click on the shopping cart
	public void clickonCheckoutButton()
	{
		clickOnCheckoutButton.click();
	}




}
