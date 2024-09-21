package com.practiceSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import com.pomclasses.LoginPagePom;

public class RunnerClass extends BaseClass{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		//Create Object for POM class 
		
		
		
		browserLaunch("chrome");
		getUrl(null);
		/*
		 * getTitle(); getCurrentUrl(driver); //navigateMethods(driver, "refresh");
		 * LoginPagePom login = new LoginPagePom(driver); getinput(driver,
		 * login.getuserName(), "Arunkumar08");
		 */
		
		/*
		 * waitTime(50); getUrl("https://www.amazon.in/");
		 * javaScript("window.scrollBy(0,1000)"); javaScript("window.scrollBy(0,-100)");
		 * amazonSearch("Iphone"); WebElement clickSearch =
		 * driver.findElement(By.id("nav-search-submit-button")); click(clickSearch);
		 * getTitle(); navigateTo("https://www.youtube.com/");
		 * takeScreenShot("youtube"); getTitle(); getCurrentUrl(); element =
		 * xpath("xpath","//yt-formatted-string[text()='History']"); getTexts(element);
		 * navigateBack(); System.out.println("After Back command Executed ");
		 * getTitle();
		 * 
		 * closeWindow("close");
		 */
		
	}

}
