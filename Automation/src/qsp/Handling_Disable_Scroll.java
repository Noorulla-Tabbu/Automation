package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Disable_Scroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Desktop%20files/Disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		JavascriptExecutor j= (JavascriptExecutor) driver;
		
	}
}
