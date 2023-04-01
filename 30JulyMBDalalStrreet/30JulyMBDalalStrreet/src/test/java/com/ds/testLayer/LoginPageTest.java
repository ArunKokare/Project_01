package com.ds.testLayer;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		login.enterEmailID("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		Thread.sleep(4000);
		String actual_url = login.getCURL();
		Assert.fail();
//		Reporter.log("Dalal First Report");
//		Assert.fail();
		
		Assert.assertEquals(actual_url, expected_url);
	}

}
