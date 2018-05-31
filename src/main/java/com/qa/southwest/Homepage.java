package com.qa.southwest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {
	
	//PageFactory-OR(Object Repo)
	
	@FindBy(id="trip-type-one-way")
	WebElement id;
	
	@FindBy(xpath="//input[@name='originAirport'][@id='air-city-departure']")
	WebElement Depart;
	
	@FindBy(xpath="//input[@name='destinationAirport'][@id='air-city-arrival']")
	WebElement Arrive;
	
	@FindBy(xpath="//input[@id='air-date-departure']")
	WebElement date;
	
	@FindBy(xpath ="//input[@name='adultPassengerCount']")
	WebElement adult;
 
	@FindBy(xpath="//button[@class='swa-button swa-button_primary']")
	WebElement submit;
	
	
	
	
	public Homepage(){
		PageFactory.initElements(driver, this);//pagefactory.initElements is to initialize the object repo
	} 
	
	public String getTitle(){
		return driver.getTitle();
	}

	
	public void Enterdetails(String un,String pass,String i ) throws Exception{
		JavascriptExecutor je= (JavascriptExecutor)driver;
			je.executeScript("scroll(0,650)", "");
			
			id.click();
			
			Depart.sendKeys(un);
			
			Arrive.sendKeys(pass);
			
			date.sendKeys(i);
			
		
			
			submit.click();
			
			
			
			
			
		
	}
}
