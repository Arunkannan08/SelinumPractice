package com.pomclasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interface.*;

public class LoginPagePom implements LoginInterface {
	private WebDriver driver;

	// Create Constructor
	public LoginPagePom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = username_name)
	private WebElement user;

	public WebElement getuserName() {
		return user;
	}

	@FindBy(id = password_id)
	private WebElement pass;

	public WebElement getpassword() {
		return pass;
	}

	@FindBy(className = loginBtn_className)
	private WebElement submit;

	public WebElement loginbtn() {
		return submit;
	}

}
