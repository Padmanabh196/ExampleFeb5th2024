package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
	
	public static WebDriver oBrowser=null; 
	public static void main(String[] args) {
		
		LaunchBrowser();
		navigateURL();
		closeApplication();
		
		
		
	}
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURL()
	{
		try
		{
			
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(5000);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
