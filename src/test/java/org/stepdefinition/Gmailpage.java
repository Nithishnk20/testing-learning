package org.stepdefinition;

import org.baseclass.MainBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmailpage extends MainBaseClass
{
	public Gmailpage() {
		PageFactory.initElements( driver , this);
		
	}
	
	@FindBy(xpath = "//input[@aria-label='Email or phone']")
	private WebElement mail;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement  clk1;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getClk1() {
		return clk1;
	}

}
