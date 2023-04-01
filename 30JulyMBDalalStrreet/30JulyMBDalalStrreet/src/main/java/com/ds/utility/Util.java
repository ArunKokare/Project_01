package com.ds.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class Util extends TestBase {
	
	public Util()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void screenshot(String filename)  
	{  
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String path="D:\\Import_Project\\30JulyMBDalalStrreet\\30JulyMBDalalStrreet\\screenshot\\ ";
			File desc = new File(path + filename +".png");
			FileHandler.copy(src, desc);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
