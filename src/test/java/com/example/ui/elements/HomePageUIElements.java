package com.example.ui.elements;

import org.openqa.selenium.By;

public class HomePageUIElements {

// 	Enable for page factory method	
	public static By loginRegisterButton = By.xpath("//span[text()='Sign In / Register']");
	public static By userName = By.id("username");
	public static By password = By.id("password");
	public static By loginButton = By.xpath("//button[@type='submit']");
	public static By systemNotif = By.xpath("//span[contains(text(),'AGREE')]");


	public String loginRegisterButtonElement = "//span[text()='Sign In / Register']";
	public String userNameElement = "username";
	public String passwordElement = "password";
	public String loginButtonElement = "//button[@type='submit']";
	public String systemNotifElement = "//span[contains(text(),'AGREE')]";
	
}


