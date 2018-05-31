package com.qa.southwest;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.TestUtil.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	

	public TestBase(){
		try{
			prop=new Properties();
			FileInputStream f=new FileInputStream("C://Users//RAKESH//Desktop//Testing//bangalorePOM//src//main//java//com//qa//config//Config.properties");
		prop.load(f);
	}
    catch(Exception e){
    	e.printStackTrace();
    }
		
		
	}
	
	
	public static void initialization(){
		
		String browser=prop.getProperty("browser");
		
		if( browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			else if (browser.equalsIgnoreCase("FF")){
				System.setProperty("webdriver.gecko.marionate", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			}
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.implicitwait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.pageloadtime, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		//driver.findElement(By.className("")).sendKeys(Keys.ENTER);
		
		
	}
	public static void main(String[] args) {
		TestBase tb=new TestBase();
		tb.initialization();
		System.out.println(prop.getProperty("browser"));
		System.out.println("southwest");
	}
	

	
}
