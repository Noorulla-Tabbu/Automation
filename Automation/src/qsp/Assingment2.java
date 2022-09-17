package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
//***********************************************************************************************************
//Content of the webTable in static web page

	/*driver.get("file:///D:/Desktop%20files/table.html");
	List<WebElement> all = driver.findElements(By.xpath("//td"));
	int count = all.size();
	System.out.println(count);
	for(int i=0; i<count; i++)
	{
		WebElement link = all.get(i);
		String text = link.getText();
		System.out.println(text);
	}
	driver.close();*/
//*************************************************************************************************************
//printing last auto suggestion of qspiders
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://www.google.com/");
	driver1.findElement(By.name("q")).sendKeys("qspiders");
	Thread.sleep(2000);
	List<WebElement> links = driver1.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
	int count1 = links.size();
	System.out.println(count1);
	for (int i = 0; i < count1; i++)
	{
		String text = links.get(i).getText();
		System.out.println(text);
	}
	links.get(count1-1).click();
	//driver1.close();
	
//*************************************************************************************************************
//printing the last suggestion of iphone in flipcart
	/*WebDriver driver11 = new ChromeDriver();
	driver11.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver11.get("https://www.flipkart.com/");
	driver11.findElement(By.name("q")).sendKeys("iphone");
	List<WebElement> all1 = driver11.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
	int count11 = all.size();
	System.out.println(count11);
	for (int i = 0; i < count11; i++) 
	{
		String text = all1.get(i).getText();
		System.out.println(text);
	}
	all1.get(count11-1).click();
	driver11.close();*/
	
	}

}
