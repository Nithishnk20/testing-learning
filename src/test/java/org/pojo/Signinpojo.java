package org.pojo;

import org.baseclass.MainBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpojo extends MainBaseClass{

	public Signinpojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createnewaccount;

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement firstnametxtbox;
	
	@FindBy(name = "lastname")
	private WebElement lastnametxtbox;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileorEmailtxtbox;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newpasswordtxtbox;

	public WebElement getCreatenewaccount() {
		return createnewaccount;
	}

	public WebElement getFirstnametxtbox() {
		return firstnametxtbox;
	}

	public WebElement getLastnametxtbox() {
		return lastnametxtbox;
	}

	public WebElement getMobileorEmailtxtbox() {
		return mobileorEmailtxtbox;
	}

	public WebElement getNewpasswordtxtbox() {
		return newpasswordtxtbox;
	}
	
	
}