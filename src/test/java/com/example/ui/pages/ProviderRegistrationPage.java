package com.example.ui.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.example.ui.elements.ProviderRegistrationUIElements;
import com.example.ui.helper.BaseWeb;
import com.example.ui.helper.WaitHelper;


public class ProviderRegistrationPage {

	private static Logger log = Logger.getLogger(HomePage.class);
    public WebDriver driver;
    WaitHelper wait;

	private static ProviderRegistrationPage providerRegInstance = null;
	
	public static ProviderRegistrationPage getInstance(WebDriver driver)
	{
		if(providerRegInstance == null)
			providerRegInstance = new ProviderRegistrationPage(driver);
		
		return providerRegInstance;
	}
	
	public ProviderRegistrationPage(WebDriver webDriver) 
	{
		driver = webDriver;
		wait = new WaitHelper();
		PageFactory.initElements(driver, this);
	}
	
	public void click_login_register_button()
	{
		WebElement loginRegisterButton = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.loginRegisterButton);
		loginRegisterButton.click();
	}
	
	public void click_register_button()
	{
		WebElement register = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.registerButton);
		register.click();
	}
	
	public void enter_provider_registration_details()
	{
		int randomNumber = (int) Math.floor(Math.round((Math.random()*10000)));
		
		WebElement email = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.email);
		email.sendKeys("cue.provider.dyp+auto"+randomNumber+"@gmail.com");
		
		WebElement password = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.password);
		password.sendKeys("Pass@123");
		
		WebElement confirmpassword = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.confirmPassword);
		confirmpassword.sendKeys("Pass@123");
		
		WebElement orgName = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.orgName);
		orgName.sendKeys("Auto"+randomNumber);
		
		WebElement firstName = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.firstName);
		firstName.sendKeys("auto"+randomNumber);
		
		WebElement lastName = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.lastName);
		lastName.sendKeys("test");
		
		WebElement phone = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.phone);
		phone.sendKeys("(234)243-4343");
	}
	
	public void submit_provider_registration_form()
	{
		WebElement submitButton = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.submitButton);
		submitButton.click();	
	}
	
	public void confirm_successful_provider_registration()
	{
		WebElement successMsg = BaseWeb.FindWebElement(driver, ProviderRegistrationUIElements.successMsg);
		Assert.assertEquals(successMsg.getText(), "Registration successful");
	}

}
