package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assingment_6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		WebElement target = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement target1 = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(target1).perform();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("HackerEarth"))
		{
			System.out.println("HackerEarth page is displayed");
		}
		else
			System.out.println("HackerEarth page is not displayed");
		driver.close();
	}

}
