package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment_5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[3]")).click();
		driver.findElement(By.xpath("(//button)[3]")).click();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.contains("Cancel"))
		{
			System.out.println("test case is passed");
		}
		else
			System.out.println("test case is not passed");
		driver.close();


	//********************************************************************************************************************
	//careinsurance
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.findElement(By.id("policynumber")).sendKeys("123");
		driver1.findElement(By.id("dob")).click();
		WebElement mnt = driver1.findElement(By.className("ui-datepicker-month"));
		Select s= new Select(mnt);
		s.selectByValue("11");
		WebElement year = driver1.findElement(By.className("ui-datepicker-year"));
		Select s1 = new Select(year);
		s1.selectByValue("1997");
		driver1.findElement(By.linkText("9")).click();
		driver1.findElement(By.id("alternative_number")).sendKeys("9441931871");
		driver1.findElement(By.id("renew_policy_submit")).click();
		String text1 = driver1.findElement(By.id("policynumberError")).getText();
		System.out.println(text1);
		driver1.close();
	}

}
