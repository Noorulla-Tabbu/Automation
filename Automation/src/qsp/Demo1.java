package qsp;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe/");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Desktop%20files/Hotel.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		HashSet<String> hs=new HashSet<String>();
		
		/*WebElement mtr = s.getWrappedElement();
		String text = mtr.getText();
		hs.add(text);
		System.out.println(hs);*/
		
		List<WebElement> mtr = s.getOptions();
		for (WebElement e : mtr) {
			String text = e.getText();
			hs.add(text);
		}
		System.out.println(hs);
	}

}
