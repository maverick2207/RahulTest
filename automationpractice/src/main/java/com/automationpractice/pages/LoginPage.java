package com.automationpractice.pages;

import org.openqa.selenium.By;




public class LoginPage {

	public By signInButton = By.xpath("//a[@class='login']");

	public By emailAdressTextbox = By.id("email");

	public By passwordTextbox = By.id("passwd");

	public By submitButton = By.id("SubmitLogin");

}
