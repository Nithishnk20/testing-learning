package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.baseclass.MainBaseClass;
import org.pojo.AmazonPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonnew extends MainBaseClass{
	
	AmazonPage a;

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch url of amazon application")
	public void to_launch_url_of_amazon_application() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To click sign in button")
	public void to_click_sign_in_button() {
		a = new AmazonPage();
	    clickBtn(a.getLogin());
	}

	@When("To click create new amazon account button")
	public void to_click_create_new_amazon_account_button() {
		a = new AmazonPage();
		clickBtn(a.getCreeatenewacc());
	}

	@When("To pass name in first and last name text")
	public void to_pass_name_in_first_and_last_name_text(DataTable d) {
		Map<Object, Object> m = d.asMap(String.class, String.class);

	    a = new AmazonPage();
	    passText((String) m.get("name1"), a.getName());
	}

	@When("To pass mobileno in mobileno text box")
	public void to_pass_mobileno_in_mobileno_text_box() {
		a = new AmazonPage();
		passText("8668177618", a.getMobileno());
	}

	@When("To pass email in email text box")
	public void to_pass_email_in_email_text_box() {
		a = new AmazonPage();
		passText("kumarnithishnk@gmail.com", a.getEmail());
	}

	@When("To create new password in new password text box")
	public void to_create_new_password_in_new_password_text_box(DataTable d) {
		List<Map<String,String>> maps = d.asMaps();
		a = new AmazonPage();
		passText(maps.get(1).get("password2"), a.getPassword());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	    closeEntireBrowser();
	}

}
