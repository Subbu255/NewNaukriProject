package com.jobsearch.noukri;

import org.bouncycastle.asn1.BEROctetStringGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWebpageTitle {
	
	WebDriver driver;
	
	
	@Parameters
	@Test
	
	public void getWebpageTitle(String browser, String url) {
		
		if(browser.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		
		else if (browser.contains("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
			
		}
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
	}

}
