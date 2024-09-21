package com.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
	private WebDriver driver;

	// Create Constructor
	public SearchHotelPom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement location() {
		return location;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	public WebElement hotels() {
		return hotels;
	}

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	public WebElement roomType() {
		return roomType;
	}

	@FindBy(id = "room_nos")
	private WebElement numberOfRooms;

	public WebElement noOfRooms() {
		return numberOfRooms;
	}

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkIn;

	public WebElement checkIn() {
		return checkIn;
	}

	@FindBy(xpath = "datepick_out")
	private WebElement checkOut;

	public WebElement checkOut() {
		return checkOut;
	}

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultPerRoom;

	public WebElement adultPerRoom() {
		return adultPerRoom;
	}

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childPerRoom;

	public WebElement childPerRoom() {
		return childPerRoom;
	}

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submitbtn;

	public WebElement submitbtn() {
		return submitbtn;
	}

	@FindBy(xpath = "//input[@value='Reset']")
	private WebElement resetbtn;

	public WebElement resetbtn() {
		return resetbtn;
	}
}
