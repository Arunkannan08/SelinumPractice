package com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPom {

	WebDriver driver;

	// COnstructor
	public BookHotelPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement firstName;

	public WebElement firstName() {
		return firstName;
	}

	@FindBy(id = "last_name")
	private WebElement lastName;

	public WebElement lastName() {
		return lastName;
	}

	@FindBy(className = "txtarea")
	private WebElement address;

	public WebElement address() {
		return address;
	}

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccNumber;

	public WebElement ccNumber() {
		return ccNumber;
	}

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement ccType;

	public WebElement ccType() {
		return ccType;
	}

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement selectMonth;

	public WebElement selectMonth() {
		return selectMonth;
	}

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement selectYear;

	public WebElement selectYear() {
		return selectYear;
	}

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	public WebElement cvv() {
		return cvv;
	}

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	public WebElement bookNowBtn() {
		return booknow;
	}

	@FindBy(xpath = "//input[@name='cancel']")
	private WebElement cancel;

	public WebElement cancel() {
		return cancel;
	}
}
