package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max"+Keys.ENTER);
		List<WebElement> apple = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../..//div[@class='_30jeq3 _1_WHN1']"));
		int count = price.size();
		System.out.println(count);
		for (int i = 0; i < count; i++)
		{
			String text = apple.get(i).getText();
			String ptext = price.get(i).getText();
			System.out.println(text+" -------> "+ptext);
		}
		driver.close();
	}
}
