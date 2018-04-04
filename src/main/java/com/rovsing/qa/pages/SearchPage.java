package com.rovsing.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rovsing.qa.base.TestBase;

public class SearchPage extends TestBase{
	public String inputText = "Test";
	
	@FindBy(xpath = "//div[@class='top_bar_left clearfix']//a[@id='home1id']")
	WebElement Searchbtn;

	@FindBy(xpath = "//form[@id='searchform']//input[@class='field']")
	WebElement SearchInput;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Search() throws InterruptedException {
		Actions action = new Actions(driver);
	action.moveToElement(Searchbtn).click().build().perform();
	Thread.sleep(3000);
		Searchbtn.click();
		SearchInput.isEnabled();
		SearchInput.sendKeys(inputText);
		SearchInput.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
	}

}
