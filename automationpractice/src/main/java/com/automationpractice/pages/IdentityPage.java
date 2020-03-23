package com.automationpractice.pages;

import org.openqa.selenium.By;

public class IdentityPage {
	public By firstNameTextBox = By.id("firstname");
	public By lastNameTextBox = By.id("lastname");
	public By saveDetailsButton = By.xpath("//button[@name='submitIdentity']");

	public By oldPasswordTextBox = By.id("old_passwd");
	
	public By accountName = By.xpath("//a[@title='View my customer account']/span");
}
