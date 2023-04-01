package com.ds.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result)
	{
		logger.info("TestCase Execution Start "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		logger.info("TestCase Execution Success "+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		logger.info("TestCase Execution Failure "+result.getName());
		Util.screenshot(result.getName()+System.currentTimeMillis());
		logger.info("Takes Screenshot");

	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		logger.info("TestCase Execution Skipped "+result.getName());

	}

	

	
}
