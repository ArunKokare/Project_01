package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class BuyFunctionality extends TestBase {
	
	
	@Test 
	public void verifyBuyFunctionalityWipro() throws InterruptedException
	{
		String Expected_Status_msg = "Order Created successfully";
		LoginPage login = new LoginPage();
		DashboardPage dash = new DashboardPage();
		ExchangePage exchange = new ExchangePage();
		//----- login ---------------
		login.enterEmailID("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		Thread.sleep(4000);
		//---------------------------------
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyOption();
		Thread.sleep(3000);
		//---------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		System.out.println(exchange.getStatus());
		Assert.assertEquals(exchange.getStatus(), Expected_Status_msg);
		
	}
	
	@Test 
	public void verifyBuyFunctionalityAxis() throws InterruptedException
	{
		String Expected_Status_msg = "Order Created successfully";
		LoginPage login = new LoginPage();
		DashboardPage dash = new DashboardPage();
		ExchangePage exchange = new ExchangePage();
		//----- login ---------------
		login.enterEmailID("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		Thread.sleep(4000);
		//---------------------------------
		dash.enterCompanyName("Axis");
		dash.clickOnCompanyOption();
		Thread.sleep(3000);
		//---------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		System.out.println(exchange.getStatus());
		Assert.assertEquals(exchange.getStatus(), Expected_Status_msg);
		
	}

}
