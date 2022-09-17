package com.automation.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void openBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("open browser",true);
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void login() throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("login acoount",true);
	}
	
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void logout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Reporter.log("logout acoount",true);
	}
	
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void closeBrowser() {
		driver.close();
		Reporter.log("close browser",true);
	}
}
