package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.automation.pom.Login;

public class ActiLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver dri=new ChromeDriver();
		dri.get("https://demo.actitime.com/");
		Login l=new Login(dri);
		l.setLogin("admin", "manager");
		dri.close();
	}

}
