package com.rovsing.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rovsing.qa.base.TestBase;
import com.rovsing.qa.pages.ApplicationForm;
import com.rovsing.qa.pages.CompanyPage;
import com.rovsing.qa.pages.HomePage;
import com.rovsing.qa.util.TestUtil;

public class ApplicationFormTest extends TestBase{
	
	ApplicationForm applicationForm;
	TestUtil testUtil ;
	HomePage homePage ;
	CompanyPage companyPage;
	public String AppformTitle;
	public ApplicationFormTest(){
		super();
}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		companyPage = new CompanyPage();
		applicationForm = new ApplicationForm();
		driver.navigate().to("http://rovsing.webcomers.com/careers/unsolicited-application/");	
		AppformTitle = driver.getTitle();
		applicationForm.acceptCookie();
	}
	
	@Test(priority=11)
	public void FormSubmission() throws IOException, InterruptedException{
		applicationForm.FillForm();
		String AfterApplyTitle= driver.getTitle();
		Assert.assertNotEquals(AfterApplyTitle, AppformTitle);
	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
