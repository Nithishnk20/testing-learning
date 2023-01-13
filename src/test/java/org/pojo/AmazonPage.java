package org.pojo;

import org.baseclass.MainBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage extends MainBaseClass{
	public AmazonPage() {
		PageFactory.initElements( driver , this);
		
	}
	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement login;
	
	@FindBy(id = "createAccountSubmit")
	private WebElement creeatenewacc;
	
	@FindBy(xpath = "//input[@name='customerName']")
	private WebElement name;

	@FindBy(xpath = "//input[@data-validation-id='phoneNumber']")
	private WebElement mobileno;
	
	@FindBy(name = "secondaryLoginClaim")
	private WebElement email;

	@FindBy(xpath = "//input[@placeholder='At least 6 characters']")
	private WebElement password;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getCreeatenewacc() {
		return creeatenewacc;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

	
}
