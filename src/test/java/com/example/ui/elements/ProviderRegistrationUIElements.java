package com.example.ui.elements;

import org.openqa.selenium.By;

public class ProviderRegistrationUIElements 
{
	public static By loginRegisterButton = By.xpath("//span[text()='Sign In / Register']");
	public static By registerButton = By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div/form/div[2]/div/button/span[1]");
	public static By email = By.id("email");
	public static By password = By.id("password");
	public static By confirmPassword = By.id("passwordToCompare");
	public static By orgName = By.id("orgName");
	public static By firstName = By.id("firstName");
	public static By lastName = By.id("lastName");
	public static By phone = By.id("phone");
	public static By submitButton = By.xpath("//button[@type='submit']");
	public static By successMsg = By.xpath("//h1[text()='Registration successful']");
}
