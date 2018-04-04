package com.rovsing.qa.testcases;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.rovsing.qa.base.TestBase;
import com.rovsing.qa.pages.CompanyPage;

import com.rovsing.qa.pages.HomePage;

import com.rovsing.qa.util.TestUtil;

public class HomePageTest extends TestBase {

	
	HomePage homePage;
	TestUtil testUtil;
	CompanyPage companyPage;
	

	public HomePageTest() {
		super();
	}
	
	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
	
		homePage = new HomePage();
		homePage.acceptCookie();
		
	}
	
	@Test(priority=1)
	public void LogoImageTest() throws IOException{
		System.out.println("Homepage priority 1");
		boolean flag = homePage.validateImage();
		Assert.assertTrue(flag);
	}

	@Test(priority=2)
	public void verifyHomePageTitleTest(){
		System.out.println("Homepage priority 2");
	String homePageTitle = homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "Rovsing – Rovsing");
	

	}

	@Test(priority=3)
	public void verifyCompanyLinkTest() throws InterruptedException{
		
		companyPage = homePage.clickOnMenuCompanyLink();
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
