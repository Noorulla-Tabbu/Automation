package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException, AWTException  {
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://demo.actitime.com/login.do");
				driver.findElement(By.id("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
				driver.findElement(By.linkText("About your actiTIME")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Read Service Agreement")).click();
				Thread.sleep(2000);
				driver.navigate().to("https://www.actitime.com/legal/service-agreement");
				List<WebElement> tab = driver.findElements(By.xpath("//li[contains(@class,'header__li')]"));
				int count = tab.size();
				System.out.println(count);
				for (WebElement webElement : tab) {
					String text = webElement.getText();
					System.out.println(text);
				}
				driver.close();
	}
}
