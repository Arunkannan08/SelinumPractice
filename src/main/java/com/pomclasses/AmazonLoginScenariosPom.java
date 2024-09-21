package com.pomclasses;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interface.AmazonLogin;
import com.Interface.LoginInterface;
import com.practiceSelenium.BaseClass;

public class AmazonLoginScenariosPom extends BaseClass implements AmazonLogin{
	WebDriver driver;
	
	public AmazonLoginScenariosPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id=email_id)
	private WebElement emaild;
	
	@FindBy(xpath=continue_xpath)
	private WebElement continueBtn;
	
	@FindBy(xpath = emailErrorMessage_xpath)
	private WebElement emailErrorMessage;
	
	public void checkLoginWithoutEmailId()
	{
		click(driver, emaild);
		click(driver, continueBtn);
		getText(driver, emailErrorMessage);
	}

}
