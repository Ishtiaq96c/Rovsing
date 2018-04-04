package com.rovsing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rovsing.qa.base.TestBase;

public class ApplicationForm extends TestBase{
	@FindBy(xpath = "//img[@class='logo-main scale-with-grid']")
	//@CacheLookup
	WebElement rosvinglogo;

	@FindBy(xpath = "//div[@class='easy-cookies-policy-accept']")
	WebElement cookie;
	@FindBy(xpath = "//input[@id='name']")
	WebElement Name;
	@FindBy(xpath = "//input[@id='picturefile']")
	WebElement ChoosePic;
	@FindBy(xpath = "//input[@id='address']")
	WebElement Address;
	@FindBy(xpath = "//input[@id='postalcode']")
	WebElement postalcode;
	@FindBy(xpath = "//input[@id='city']")
	WebElement City;
	@FindBy(xpath = "//input[@id='your-email']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='job-title']")
	WebElement JobTitle;
	
	@FindBy(xpath = "//input[@id='education']")
	WebElement Education;
	
	@FindBy(xpath = "//input[@id='yearofgraduation']")
	WebElement yearofgraduation;
	@FindBy(xpath = "//input[@id='uplaodcv']")
	WebElement uplaodcv;

	@FindBy(xpath = "//*[@id='admited']/span/input")
	WebElement AcceptTerms;
	@FindBy(xpath = "//*[@id='send-btn']")
	WebElement Submit;

	// Initializing the Page Objects:
	public ApplicationForm() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle(){
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
	public void FillForm() throws InterruptedException{
		Name.sendKeys("Peter");
		ChoosePic.sendKeys("/Users/air/Pictures/homepage546585a.jpg");
		Address.sendKeys("Røde Kors, Blegdamsvej 27");
		postalcode.sendKeys("2100");
		City.sendKeys("København");
		Email.sendKeys("test@email.com");
		JobTitle.sendKeys("Automation Tester");
		Education.sendKeys("MS CS");
		yearofgraduation.sendKeys("2011");
		uplaodcv.sendKeys("/Users/air/Pictures/Basic_CV.pdf");
		AcceptTerms.click();
		Submit.click();
		Thread.sleep(5000);
		
	}
	

}
