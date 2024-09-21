package com.practiceSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.pomclasses.AmazonLoginScenariosPom;

public class AmazonRunner extends BaseClass {
	
	//WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		//driver = BaseClass.browserLaunch("Chrome");
		browserLaunch("Chrome");
		getUrl("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	
	@Test
	public void loginValidation()
	{
		AmazonLoginScenariosPom lo = new AmazonLoginScenariosPom(driver);
	    lo.checkLoginWithoutEmailId();	
	}
	

}
