package com.rovsing.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rovsing.qa.base.TestBase;

public class CompanyPage extends TestBase {
	
	@FindBy(xpath = "//img[@class='logo-main scale-with-grid']")
	//@CacheLookup
	WebElement rosvinglogo;

	@FindBy(xpath = "//span[text()='Solutions']")
	WebElement MenuSolutions;
	
	@FindBy(xpath = "//a[text()='About us']")
	WebElement about;
	@FindBy(xpath = "//a[text()='Board of Directors']")
	WebElement BoardofDirectors;
	@FindBy(xpath = "//a[text()='Management']")
	WebElement Management;
	@FindBy(xpath = "//*[@id=\"menu-item-2976\"]/a")
	WebElement Customers;
	@FindBy(xpath = "//a[text()='Contact us']")
	WebElement ContactUs;


	public CompanyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCompanyPageTitle(){
		return driver.getTitle();
	}
	public boolean validateImage(){
		return rosvinglogo.isDisplayed();
	}
	
	public void CompanyBoardofDirectors(){
		 BoardofDirectors.click();	
	}
	public void Management(){
		Management.click();	
	}
	public void Customers(){
		Customers.click();	
	}
	public void ContactUs(){
		ContactUs.click();	
	}
	
	
	
	
	
	
	
	public SolutionsPage clickOnMenuCompanyLink(){
		MenuSolutions.click();
		return new SolutionsPage();
	}
	
}

