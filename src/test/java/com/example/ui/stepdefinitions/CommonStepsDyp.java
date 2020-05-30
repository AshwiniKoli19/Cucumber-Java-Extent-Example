package com.example.ui.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.example.ui.helper.BaseWeb;
import com.example.ui.pages.HomePageDyp;
import com.example.ui.pages.HomePageDyp_POM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepsDyp
{
	// Enable for page factory method.
	private HomePageDyp homepage;
	public static WebDriver driver = BaseWeb.getDriver();
	
	//Enable for POM method
	//private HomePageDyp_POM homepage = new HomePageDyp_POM(driver);
	
	//Enable for page factory method.
	public CommonStepsDyp() 
	{ 
		homepage = HomePageDyp.getInstance(driver); 
	}
	 
	@When("^User clicks Login/Register button on home page$")
	public void click_home_login_register_button()
	{
		homepage.click_home_login_register_button();
	}
	
	@And("^Enters Username, Password$")
	public void enter_username_password()
	{
		homepage.enter_username_password();
	}
	
	@And("^Clicks on Login button$")
	public void click_on_login_button()
	{
		homepage.click_on_login_button();
	}
	
	@Then("^DyP Internal user dashboard page gets opened$")
	public void verify_dyp_iu_dashboard_page() 
	{
		homepage.verify_dyp_iu_dashboard_page();		
	}
}
