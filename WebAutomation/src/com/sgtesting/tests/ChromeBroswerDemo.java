package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroswerDemo {
	
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
			oBrowser=new ChromeDriver();
			
			
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
			
			oBrowser.get("http://localhost/login.do");
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
