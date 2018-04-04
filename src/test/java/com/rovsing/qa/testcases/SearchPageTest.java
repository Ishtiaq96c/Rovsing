package com.rovsing.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rovsing.qa.base.TestBase;
import com.rovsing.qa.pages.CompanyPage;
import com.rovsing.qa.pages.HomePage;
import com.rovsing.qa.pages.SearchPage;
import com.rovsing.qa.util.TestUtil;

public class SearchPageTest extends TestBase{
	HomePage homePage;
	TestUtil testUtil;
	CompanyPage companyPage;
	SearchPage searchPage;
	
	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
		homePage.acceptCookie();
		searchPage = new SearchPage();
	}
	

	@Test(priority=4)
	public void VerifySearchResult() throws InterruptedException{
		System.out.println("Searchpage priority 1");
		searchPage.Search();
	WebElement verifyResult = driver.findElement(By.xpath("//div[@class='post-desc']//a[contains(text(), searchPage.inputText)]"));
	    
		  if( verifyResult.isDisplayed()) {
			  System.out.println(searchPage.inputText +" Keyword Found in search");
		  }
		  else {
			  System.out.println("Input text not found");
		  }
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
