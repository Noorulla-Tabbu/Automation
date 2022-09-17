package qsp;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment3
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
//***********************************************************************************************************
//printing the url after entering wipro jobs in google.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		List<WebElement> sug = driver.findElements(By.xpath("//a"));
		int count = sug.size(); 
		System.out.println(count);
		for (int i = 0; i <count; i++) 
		{
			String url = sug.get(i).getAttribute("href");
			System.out.println(url);
		}
		driver.close();
//***********************************************************************************************************
//printing the latest news present in BBC.com
		/*WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.bbc.com/");
		List<WebElement> links = driver1.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count1=links.size();
		System.out.println(count1);
		for(int i=0;i<count1;i++)
		{
			String text = links.get(i).getText();
			System.out.println(text);
		}
		driver1.close();*/
	}
}
