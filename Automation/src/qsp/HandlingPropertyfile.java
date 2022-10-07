package qsp;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.generic.FileLibrary;


public class HandlingPropertyfile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe/");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//using Property File data
		FileLibrary f1 = new FileLibrary();
		String url = f1.readPropertyData("url");
		String un = f1.readPropertyData("username");
		String pw = f1.readPropertyData("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
		
		//Using Excel data
		WebDriver driver1=new ChromeDriver();
		String username = f1.readExcelData("userlogin", 4, 1);
		String password = f1.readExcelData("userlogin", 4, 2);
		driver1.get("https://demo.actitime.com/");
		driver1.findElement(By.id("username")).sendKeys(username);
		driver1.findElement(By.name("pwd")).sendKeys(password);
		driver1.findElement(By.id("loginButton")).click();
		driver1.close();
	}
}
