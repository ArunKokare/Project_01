package com.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- Obj repo ---------------------
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement searchbox_txt;
	
	@FindBy(xpath="(//div[contains(@class,'m-4 card')])[2]")
	private WebElement option;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement transactions_lnk;
	
	
	//------------- Action methods ----------------
	public void enterCompanyName(String company_name)
	{
		searchbox_txt.sendKeys(company_name);
	}
	
	public void clickOnCompanyOption()
	{
		option.click();
	}
	
	public void clickOnTransactionsLink()
	{
		transactions_lnk.click();
	}
	

}
