package com.automationpractice.pages;

import org.openqa.selenium.By;

public class MyOrders {
	
	public By detailsButton = By.xpath("//a[@class='btn btn-default button button-small']/span[contains(text(),'Details')]");

	public By productDescription = By.xpath("//td[@class='bold']/label[contains(@for,'cb')]");
}
