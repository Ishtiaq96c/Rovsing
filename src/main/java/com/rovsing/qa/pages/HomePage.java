package com.rovsing.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rovsing.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//img[@class='logo-main scale-with-grid']")
	//@CacheLookup
	WebElement rosvinglogo;

	@FindBy(xpath = "//div[@class='easy-cookies-policy-accept']")
	WebElement cookie;
	@FindBy(xpath = "//span[text()='Company']")
	WebElement MenuCompany;
	
//	
	
	@FindBy(xpath = "//div[@class='top_bar_left clearfix']//a[@id='home1id']")
	WebElement Searchbtn;

	@FindBy(xpath = "//form[@id='searchform']//input[@class='field']")
	WebElement SearchInput;

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	public boolean validateImage(){
		return rosvinglogo.isDisplayed();
	}
	
	public void acceptCookie() throws InterruptedException {
		Thread.sleep(10000);
		
		cookie.click();
		Thread.sleep(5000);
	}
	

	
	
	public CompanyPage clickOnMenuCompanyLink() throws InterruptedException{
		//Thread.sleep(10000);
		
		//cookie.click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Company"))).click().build().perform();
		Thread.sleep(15000);
		
		return new CompanyPage();
	}

}
