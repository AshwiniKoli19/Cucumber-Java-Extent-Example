package com.example.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.example.ui.elements.HomePageUIElements;
import com.example.ui.helper.ConfigFileReader;
import com.example.ui.helper.WaitHelper;

public class HomePageDyp_POM {

    public WebDriver driver;
    WaitHelper wait;
	
	ConfigFileReader configReader = new ConfigFileReader();
	HomePageUIElements homePageElements = new HomePageUIElements();
	
	By loginRegisterButton = By.xpath(homePageElements.loginRegisterButtonElement);
	By userName = By.id(homePageElements.userNameElement);
	By password = By.id(homePageElements.passwordElement);
	By loginButton = By.xpath(homePageElements.loginButtonElement);
	By systemNotif = By.xpath(homePageElements.systemNotifElement);

	public HomePageDyp_POM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_login_register_button()
	{
		driver.findElement(loginRegisterButton).click();
	}
	
	public void enter_username_password()
	{
		driver.findElement(userName).sendKeys(configReader.getPropertyValues("username"));
		driver.findElement(password).sendKeys(configReader.getPropertyValues("password"));	
	}
	
	public void click_on_login_button()
	{
		driver.findElement(loginButton).click();
	}
	
	public void verify_dyp_iu_dashboard_page()
	{
		//List<WebElement> systemNotif = driver.findElements(systemNotif);
		
		Assert.assertEquals(driver.findElements(systemNotif).size(), 2);	
	}
}

















