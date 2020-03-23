package com.automationpractice.stepdefinationfile;

import com.automationpractice.commonaction.CommonAction;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.IdentityPage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.pages.MyOrders;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdefination {

	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	MyOrders mo = new MyOrders();
	IdentityPage ip = new IdentityPage();

	CommonAction commonActions = new CommonAction();
	String productDescriptionText, actualProduct;

	@Before
	public void beforeMethod() {

	}

	@After
	public void QuitBrowser() {

		commonActions.driverQuit();
	}

	@Given("^launch application$")
	public void launch_application() throws InterruptedException {
		commonActions.initializeDriver();
	}

	@Then("^verify page title is \"([^\"]*)\"$")
	public void verify_page_title_is(String pageTitle) throws InterruptedException {

		commonActions.PageTitleContains(pageTitle);
	}

	@Given("^login to the application using valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_to_the_application_using_valid_and(String userName, String password) throws InterruptedException {

		commonActions.click(lp.signInButton);
		commonActions.getPropertyAndsendKeys(lp.emailAdressTextbox, userName);
		commonActions.getPropertyAndsendKeys(lp.passwordTextbox, password);
		Thread.sleep(500);
		commonActions.click(lp.submitButton);

	}

	@When("^add tshirt to the cart$")
	public void add_tshirt_to_the_cart() throws InterruptedException {

		commonActions.click(hp.backToHomePageButton);
		Thread.sleep(500);
		commonActions.scrollToElement(hp.popularFirstDress);
		Thread.sleep(500);
		commonActions.moveToElemenet(hp.popularFirstDress);
		commonActions.click(hp.popularFirstDressAddtoCartBtn);

	}

	@Then("^complete the order process$")
	public void complete_the_order_process() throws InterruptedException {
		commonActions.click(hp.proceedToCheckoutBtn);
		Thread.sleep(500);
		commonActions.scrollToElement(hp.detailsproceedToCheckoutBtn);
		commonActions.click(hp.detailsproceedToCheckoutBtn);
		Thread.sleep(500);
		Assert.assertTrue("user is not on address page", commonActions.getPageSource("Addresses"));

		commonActions.scrollToElement(hp.addressProceedToCheckOutBtn);
		commonActions.click(hp.addressProceedToCheckOutBtn);

		Thread.sleep(500);
		Assert.assertTrue("user is not on shipping page", commonActions.getPageSource("Shipping"));

		Thread.sleep(500);
		commonActions.scrollToElement(hp.textTermsofServices);
		commonActions.moveToElemenetAndClick(hp.termsAndConditionText);
		commonActions.scrollToElement(hp.carrierProceedToChkBtn);
		commonActions.click(hp.carrierProceedToChkBtn);

		Thread.sleep(500);
		commonActions.scrollToElement(hp.productDescriptionText);
		productDescriptionText = commonActions.getText(hp.productDescriptionText);

		commonActions.scrollToElement(hp.payByBankWireOption);
		commonActions.click(hp.payByBankWireOption);

		Thread.sleep(500);
		commonActions.scrollToElement(hp.confirmMyorderButton);
		commonActions.click(hp.confirmMyorderButton);

		Thread.sleep(500);
		Assert.assertTrue("user is not on order confirmation", commonActions.getPageSource("Order confirmation"));
	}

	@Then("^verify in Order History$")
	public void verify_in_Order_History() throws InterruptedException {

		commonActions.scrollToElement(hp.myOrderLinkText);
		commonActions.click(hp.myOrderLinkText);

		Thread.sleep(500);
		Assert.assertTrue("User is not my order page", commonActions.PageTitleContains("Order history - My Store"));

		commonActions.click(mo.detailsButton);

		Thread.sleep(500);
		commonActions.scrollToElement(mo.productDescription);

		actualProduct = commonActions.getText(mo.productDescription);

		Assert.assertTrue("Product is not available in order history", actualProduct.contains(productDescriptionText));

	}

	@When("^navigate to my personal information page$")
	public void navigate_to_my_personal_information_page() throws InterruptedException {

		commonActions.scrollToElement(hp.myPersonalInfoLinkText);
		Thread.sleep(500);
		commonActions.click(hp.myPersonalInfoLinkText);
	}

	@Then("^update \"(.*)\" in the details section$")
	public void update_first_name_in_the_details_section(String lastName) throws InterruptedException {

		commonActions.scrollToElement(ip.lastNameTextBox);
		commonActions.clearTextbox(ip.lastNameTextBox);
		Thread.sleep(500);
		commonActions.sendKeys(ip.lastNameTextBox, lastName);
		Thread.sleep(500);
	}

	@Then("^enter old \"(.*)\"$")
	public void enter_old_password(String password) throws InterruptedException {
		commonActions.scrollToElement(ip.oldPasswordTextBox);
		commonActions.getPropertyAndsendKeys(ip.oldPasswordTextBox, password);
	}

	@Then("Click on save button")
	public void Click_on_save_button() throws InterruptedException {
		commonActions.scrollToElement(ip.saveDetailsButton);
		commonActions.click(ip.saveDetailsButton);
	}

	@Then("^verify \"([^\"]*)\" got update successfully$")
	public void verify_got_update_successfully(String lastName) throws Throwable {
		String accountName;
		accountName = commonActions.getText(ip.accountName);

		Assert.assertTrue("Name Didn't updated", accountName.contains(lastName));
	}

}
