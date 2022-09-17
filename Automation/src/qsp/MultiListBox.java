package qsp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListBox {	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/d/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Desktop%20files/Hotel.html");
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select s= new Select(listBox);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("v");
		Thread.sleep(1000);
		s.selectByVisibleText("dosa");
		Thread.sleep(1000);
		s.deselectAll();
		if(s.isMultiple()==true)
			System.out.println("listBox is an Multi List");
		else
			System.out.println("listBox is not an Multi List");
	driver.close();

//*****************************************************************************************************	
//Printing All Selected Options in ChechPost

		/*WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Desktop%20files/Hotel.html");
		WebElement listBox = driver.findElement(By.id("cp"));
		Select s= new Select(listBox);
		Thread.sleep(1000);
		System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> sec = s.getAllSelectedOptions();
		int count=sec.size();
		for (int i = 0; i < count; i++) 
		{
			System.out.println(sec.get(i).getText());
		}
	driver1.close();*/
	}
}
