package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assing862022 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}
	public static void main(String[] args) {
		
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.gmail.com");
		String title = dri.getTitle();
		System.out.println(title);
		String url = dri.getCurrentUrl();
		System.out.println(url);
		if(url.contains("google.com"))
			System.out.println("pass");
		else
			System.out.println("fail");
		dri.close();
	}

}
