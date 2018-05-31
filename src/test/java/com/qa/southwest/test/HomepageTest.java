package com.qa.southwest.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.southwest.Homepage;
import com.qa.southwest.TestBase;

public class HomepageTest  extends TestBase{

	Homepage home;
	public HomepageTest(){
		super();
		
	}
	
	
	@BeforeMethod
	public void setup(){
		initialization();
     home=new Homepage();	
	}
	
	@Test(priority=1)
	public void getTittle(){
		String title=home.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void details() throws Exception{
		home.Enterdetails(prop.getProperty("AUSTIN"), prop.getProperty("LASVEGAS"), prop.getProperty("DATE"));
	 
		System.out.println(driver.getTitle());
		
	
		
		
	}
	
	@AfterMethod
	public void tearup(){
		driver.quit();
	}

}
