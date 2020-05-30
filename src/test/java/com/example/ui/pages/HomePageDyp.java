package com.example.ui.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.example.ui.elements.HomePageUIElements;
import com.example.ui.helper.ConfigFileReader;
import com.example.ui.helper.WaitHelper;

public class HomePageDyp {
	private static Logger log = Logger.getLogger(HomePage.class);
    public WebDriver driver;
    WaitHelper wait;
	private static HomePageDyp homePageDyP_Instance = null;
	ConfigFileReader configReader = new ConfigFileReader();
	
	
	 public static HomePageDyp getInstance(WebDriver driver) 
	  {
	  
	  if (homePageDyP_Instance == null) 
		 homePageDyP_Instance = new HomePageDyp(driver);
	  
	  return homePageDyP_Instance;
	  }
	 
	  public HomePageDyp(WebDriver webDriver) 
	  { 
		 driver = webDriver; 
		 wait = new WaitHelper(); 
		 PageFactory.initElements(driver, this); 
	  }
	
	public void click_home_login_register_button()
	{
		WebElement loginRegisterButton = driver.findElement(HomePageUIElements.loginRegisterButton);
		loginRegisterButton.click();
	}
	
	public void enter_username_password()
	{
		WebElement userName = driver.findElement(HomePageUIElements.userName);
		WebElement password = driver.findElement(HomePageUIElements.password);
		
		System.out.println("Login Creds ==="+configReader.getPropertyValues("username")+" "+configReader.getPropertyValues("password"));
		userName.sendKeys(configReader.getPropertyValues("username"));
		password.sendKeys(configReader.getPropertyValues("password"));
		
	}
	
	public void click_on_login_button()
	{
		WebElement loginButton = driver.findElement(HomePageUIElements.loginButton);
		wait.waitForElement(driver,loginButton,5);
		loginButton.click();
	}
	
	public void verify_dyp_iu_dashboard_page()
	{
		List<WebElement> systemNotif = driver.findElements(HomePageUIElements.systemNotif);
		Assert.assertEquals(systemNotif.size(), 2);
		
	}
}
