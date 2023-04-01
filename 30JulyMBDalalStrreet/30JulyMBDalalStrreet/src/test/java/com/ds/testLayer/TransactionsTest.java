package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TransactionsPage;
import com.ds.testBase.TestBase;

public class TransactionsTest extends TestBase {
	
	@Test
	public void getTransDetails() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		DashboardPage dash = new DashboardPage();
		TransactionsPage trans = new TransactionsPage();
		//---------------------------------------------
		login.enterEmailID("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		Thread.sleep(4000);
		//---------------------------------------------
		dash.clickOnTransactionsLink();
		Thread.sleep(4000);
		trans.getTransactionsDetails();
	}

}
