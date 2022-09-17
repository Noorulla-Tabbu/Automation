package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindActiveElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get(" https://www.google.com");
  WebElement e = driver.switchTo().activeElement();
  e.sendKeys("java");
	}
}
