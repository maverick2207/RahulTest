package com.automationpractice.pages;

import org.openqa.selenium.By;

public class HomePage {

	public By popularFirstDress = By.xpath("//div[@class='product-image-container']/a/img[1]");

	public By popularFirstDressAddtoCartBtn = By.xpath("//a[@title='Add to cart']/span[text()='Add to cart'][1]");

	public By proceedToCheckoutBtn = By.xpath("//a[@title='Proceed to checkout']/span");
	public By detailsproceedToCheckoutBtn = By.xpath("(//a[@title='Proceed to checkout']/span)[2]");
	public By addressProceedToCheckOutBtn = By.xpath("//button[@name='processAddress']");
	public By carrierProceedToChkBtn = By.xpath("//button[@name='processCarrier']");
	public By backToHomePageButton = By.xpath("//*[text()=' Home']");
	public By termsAndConditionCheckBox = By.xpath("//div[@id='uniform-cgv']/span/input[@id='cgv']");
	public By termsAndConditionText = By.xpath("//*[text()='I agree to the terms of service and will adhere to them unconditionally.']");
	public By payByBankWireOption = By.xpath("//a[@title='Pay by bank wire']");
	public By confirmMyorderButton = By.xpath("//span[text()='I confirm my order']");
	public By productDescriptionText = By.xpath("(//*[@class='product-name']/a)[2]");

	public By myOrderLinkText = By.xpath("//a[@title='My orders']");
	
	public By textTermsofServices = By.xpath("//*[text()='Terms of service']");
	
	public By myPersonalInfoLinkText = By.xpath("//a[@title='Manage my personal information']");
}
