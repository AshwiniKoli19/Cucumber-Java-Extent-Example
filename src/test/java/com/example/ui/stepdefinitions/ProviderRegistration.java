package com.example.ui.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.example.ui.helper.BaseWeb;
import com.example.ui.pages.HomePageDyp;
import com.example.ui.pages.ProviderRegistrationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProviderRegistration 
{
	public static WebDriver driver = BaseWeb.getDriver();
	private ProviderRegistrationPage providerRegPage;
	
	public ProviderRegistration() 
	{
		providerRegPage = ProviderRegistrationPage.getInstance(driver);
	}
	
	@When("^User clicks Login/Register button$")
	public void click_login_register_button()
	{
		providerRegPage.click_login_register_button();
	}
	
	@And("^clicks on Register button$")
	public void click_register_button()
	{
		providerRegPage.click_register_button();
	}
	
	@And("^Enter provider registration details$")
	public void enter_provider_registration_details()
	{
		providerRegPage.enter_provider_registration_details();
	}
	
	@And("^submits provider registration form$")
	public void submit_provider_registration_form()
	{
		providerRegPage.submit_provider_registration_form();
	}
	
	@Then("^Provider gets registered successfully$")
	public void confirm_successful_provider_registration()
	{
		providerRegPage.confirm_successful_provider_registration();
	}
}
