package com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPOM {
	WebDriver driver;

	public SelectHotelPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radio;

	public WebElement radiobtn() {
		return radio;
	}

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;

	public WebElement continueBtn() {
		return continueBtn;
	}

	@FindBy(xpath = "//input[@id='cancel']")
	private WebElement cancleBtn;

	public WebElement cancleBtn() {
		return cancleBtn;
	}

}
