package com.ssatb.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ssatb.tests.common.TestBaseSetup;

public class GoogleHomePageTest extends TestBaseSetup{
	
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	
	
	
}