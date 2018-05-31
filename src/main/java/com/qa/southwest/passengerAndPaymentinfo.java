package com.qa.southwest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passengerAndPaymentinfo {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.southwest.com/");
		WebElement element= driver.findElement(By.tagName("image"));
		
		Point classname=element.getLocation();
		int x =classname.getX();
		int y=classname.getY();
		System.out.println(x);
		System.out.println(y);*/
		
		/*String s="#$&karthi*k#$%";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		System.out.println("***********");
		*/
		int i=12345;
		
		int rev=0;
		while(i!=0){
			rev=rev*10+rev%10;
			i=i%10;
		}
			System.out.println(rev);
			
		
			
		
		
		
		
	
	
	}
}
