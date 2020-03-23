package com.automationpractice.commonaction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationpractice.util.TestUtil;

import cucumber.api.java.After;

public class CommonAction {

	public static WebDriver driver;
	public static Properties prop;
	static String browserName;
	private WebDriverWait wait;
	private Actions action;

	public String getProperties(String key) {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/automationpractice/config/config.properties");

			prop.load(fis);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);
	}

	public void initializeDriver() {

//		CommonAction ca = new CommonAction();

		browserName = getProperties("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
//			option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			driver = new ChromeDriver(option);
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver = new FirefoxDriver();
		}

//		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

	

	public WebElement findElement(final By ele) {

		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
		return driver.findElement(ele);
	}

	public void getPropertyAndsendKeys(final By ele, String value) {
		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).sendKeys(getProperties(value));
	}

	public void sendKeys(final By ele, String value) {
		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).sendKeys(value);
	}

	public void click(final By ele) {
		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

	public Boolean PageTitleContains(String value) {
		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		return wait.until(ExpectedConditions.titleContains(value));

	}

	public Boolean PageTitleIs(String value) {
		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		return wait.until(ExpectedConditions.titleIs(value));

	}

	public String getText(final By ele) {
		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).getText();
	}

	public void scrollToElement(final By ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", findElement(ele));

	}

	public void moveToElemenet(final By ele) {
		action = new Actions(driver);
		action.moveToElement(findElement(ele)).build().perform();

	}

	public void moveToElemenetAndClick(final By ele) {
		action = new Actions(driver);
		action.moveToElement(findElement(ele)).click().build().perform();

	}

	public boolean getPageSource(String value) {
		return driver.getPageSource().contains("value");
	}

	public void clearTextbox(final By ele) {

		wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).clear();
	}
	
	public void driverQuit() {
		driver.close();
	}

}
