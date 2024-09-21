package com.practiceSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class CrossBrowser extends BaseClass{
	
	@Test 
	public void launchChrome()
	{
	 browserLaunch("chrome");
	 getUrl("https://www.facebook.com/");
	 closeWindow(driver, "quit");
	}
	
	@Test
	public void launchEdge()
	{
		browserLaunch("edge");
		getUrl("https://www.facebook.com/");
		closeWindow(driver, "quit");
	}
	
	@Test
	public void launchFirefox()
	{
		browserLaunch("firefox");
		getUrl("https://www.facebook.com/");
		closeWindow(driver, "quit");
	}

}
