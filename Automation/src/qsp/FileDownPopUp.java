package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
/*WebDriver driver= new ChromeDriver();
driver.get("file:///D:/Desktop%20files/Naukari.html");
File f = new File("./data/Noorulla.docx");
String abPath = f.getAbsolutePath();
driver.findElement(By.id("cv")).sendKeys(abPath);

//Writing Qsp in notePad______________________________________________________________________		
Runtime.getRuntime().exec("notepad");
Robot r = new Robot();
r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_Q);
r.keyRelease(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_S);
r.keyPress(KeyEvent.VK_P);*/

//Updating the resume__________________________________________________________________________
WebDriver driver1=new ChromeDriver();
driver1.get("https://www.naukri.com/");
driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver1.findElement(By.xpath("//div[.='Login']")).click();
driver1.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("noorullabandlapalli@gmail.com");
driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("Noorulla@123");
driver1.findElement(By.xpath("//button[@type='submit']")).click();
driver1.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
File file = new File("D:\\Desktop files\\java practice\\Automation\\data\\Noorulla.docx");
String absPath = file.getAbsolutePath();
driver1.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys(absPath);

	}
}
