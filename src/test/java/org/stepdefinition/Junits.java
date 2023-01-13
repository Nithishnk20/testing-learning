package org.stepdefinition;

import org.baseclass.MainBaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junits extends MainBaseClass {
	@Ignore
	@Test
	public void sm4() {
		System.out.println("Sample Test 4");
		launchUrl("https://www.youtube.com/");
	}
	
	@After
	public void End() {
		closeEntireBrowser();		
	
	}
	
	@Test
	public void sm2() {
		System.out.println("Sample Test 2");
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S17356627%3A1672034214534789&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh5hapJ9lIjvdxoE3JGhEeFcYXNaFXmmkCWXgqWXLlg7a6koUQmCn5KRzgMIMvNPeGgylMKpZw&hl=en-US");
		String pageTitle = pageTitle();
		String pageUrl = pageUrl();
		Gmailpage f = new Gmailpage();
		passText("kumarnithishnk@gmail.com", f.getMail());
		Assert.assertEquals("check the url", pageTitle.contains("applejdhjd"), pageTitle.contains(pageTitle));
		clickBtn(f.getClk1());
	}
	
	@Before
	public void Start() {
		launchBrowser();
		windowMaximize();
	}
	@Ignore
	@Test
	public void sm1() {
		System.out.println("Sample Test 1");			
	}
	@Ignore
	@Test
	public void sm3() {
		System.out.println("Sample Test 3");
		launchUrl("https://inmakes.com/");
	}
	
	@BeforeClass
	public static void startit() {
		System.out.println("START THE PROGRAM");
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	public static void finish() {
		System.out.println("CLOSE THE PROGRAM");
		closeEntireBrowser();
	}

}
