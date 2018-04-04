package com.rovsing.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rovsing.qa.base.TestBase;
import com.rovsing.qa.pages.CompanyPage;
import com.rovsing.qa.pages.HomePage;
import com.rovsing.qa.util.TestUtil;

public class CompanyPageTest extends TestBase{
	TestUtil testUtil;
	HomePage homePage;
	CompanyPage companyPage;
	
	
	public CompanyPageTest(){
		super();
	
}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		companyPage = new CompanyPage();
		driver.navigate().to("http://rovsing.webcomers.com/company/about-us/");
		
		
	}
	
	@Test(priority=5)
	public void LogoImageTest() throws IOException{
		boolean flag = companyPage.validateImage();
		Assert.assertTrue(flag);
		
	
	}

	@Test(priority=6)
	public void verifyCompanyPageTitleTest(){
	String CompanyPageTitle = companyPage.verifyCompanyPageTitle();
	Assert.assertEquals(CompanyPageTitle, "About us – Rovsing");	

	}
	
	@Test(priority=7)
	public void verifyCompanyBoardofDirectors() throws InterruptedException{
	companyPage.CompanyBoardofDirectors();
	Thread.sleep(5000);
		String CompanyBoardofDirectorsPageTitle = driver.getTitle();
	Assert.assertEquals(CompanyBoardofDirectorsPageTitle, "Board of Directors – Rovsing");	
	}
	@Test(priority=8)
	public void verifyManagement() throws InterruptedException{
	companyPage.Management();
	Thread.sleep(5000);
		String ManagementPageTitle = driver.getTitle();
	Assert.assertEquals(ManagementPageTitle, "Management – Rovsing");	
	}
	@Test(priority=9)
	public void verifyCustomers() throws InterruptedException{
	companyPage.Customers();
	Thread.sleep(5000);
		String CustomersPageTitle = driver.getTitle();
	Assert.assertEquals(CustomersPageTitle, "Customers – Rovsing");	
	}
	@Test(priority=10)
	public void verifyContactUs() throws InterruptedException{
	companyPage.ContactUs();
	Thread.sleep(5000);
		String ContactUsPageTitle = driver.getTitle();
	Assert.assertEquals(ContactUsPageTitle, "Contact us – Rovsing");	
	}
	
	
	
	
//	@Test(priority=3)
//	public void brokenlinks(){
//		TestUtil.verifyBrokenLinks();
//		
//	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
