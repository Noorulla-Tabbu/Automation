package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment_4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		
//*****************************************************************************************************	
//Printing Duplicate Values in MTR ListBox
			
			WebDriver driver = new ChromeDriver();
			driver.get("file:///D:/Desktop%20files/Hotel.html");
			WebElement mtrlist = driver.findElement(By.id("mtr"));
			Select s= new Select(mtrlist);
			List<WebElement> listmtr = s.getOptions();
			HashSet<String> h = new HashSet<String>();
			for (WebElement e : listmtr)
			{
				String text = e.getText();
				if(h.add(text)==false) {
					System.out.println(text);
				}
			}
		driver.close();

//*****************************************************************************************************	
//Printing all Options in Reverse Order present in CheckPost List Box
			
			WebDriver driver1 = new ChromeDriver();
			driver1.get("file:///D:/Desktop%20files/Hotel.html");
			WebElement listBox = driver1.findElement(By.id("cp"));
			Select s1= new Select(listBox);
			List<WebElement> cpList = s1.getOptions();
			ArrayList<String> ar = new ArrayList<String>();
			for ( WebElement e : cpList)
			{
				String text = e.getText();
				ar.add(text);
			}
			Collections.reverse(ar);
			for (String e1 : ar)
			{
				System.out.println(e1);
			}
		driver1.close();

//*****************************************************************************************************	
//Searching the Specide Element in MTR list box
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the specified option to search in MTR list box:");
			String option = sc.nextLine();
			int c=0;
			WebDriver driver11=new ChromeDriver();
			driver11.get("file:///D:/Desktop%20files/Hotel.html");
			WebElement mtrlist1 = driver11.findElement(By.id("mtr"));
			Select s11= new Select(mtrlist1);
			List<WebElement> listmtr1 = s11.getOptions();
			for ( WebElement s111: listmtr1)
			{
				String text = s111.getText();
				if(option.equals(text))
					c++;
			}
			if(c==0)
				System.out.println(option+" is not present in the Mtr list");
			if(c==1)
			System.out.println(option+" is present in the Mtr list without duplicates");
			if(c>1)
				System.out.println(option+" is present in the Mtr list with duplicates");
		driver11.close();
		
//*****************************************************************************************************	
//Printing all options without Duplicate Values in MTR ListBox
					
			WebDriver driver111 = new ChromeDriver();
			driver111.get("file:///D:/Desktop%20files/Hotel.html");
			WebElement mtrlist11 = driver111.findElement(By.id("mtr"));
			Select s111= new Select(mtrlist11);
			List<WebElement> listmtr11 = s111.getOptions();
			HashSet<String> h1 = new HashSet<String>();
			for (WebElement e : listmtr11)
			{
				String text = e.getText();
				if(h1.add(text)==true) {
					System.out.println(text);
				}
			}
		driver111.close();	
		
//*****************************************************************************************************	
//Printing all options in Alphabetical order present in MTR ListBox
							
			WebDriver driver2 = new ChromeDriver();
			driver2.get("file:///D:/Desktop%20files/Hotel.html");
			WebElement mtrlist2 = driver2.findElement(By.id("mtr"));
			Select s2= new Select(mtrlist2);
			List<WebElement> listmtr2 = s2.getOptions();
			ArrayList<String> ar2 = new ArrayList<String>();
			for ( WebElement e : listmtr2)
			{
				String text = e.getText();
				ar2.add(text);
			}
			Collections.sort(ar2);
			for (String e1 : ar2)
			{
				System.out.println(e1);
			}
		driver2.close();
		
//*****************************************************************************************************	
//Printing all options inpresent in CheckPost listbox	
		WebDriver driver3 = new ChromeDriver();
		driver3.get("file:///D:/Desktop%20files/Hotel.html");
		WebElement cplistBox = driver3.findElement(By.id("cp"));
		Select s3= new Select(cplistBox);
		List<WebElement> cpList1 = s3.getOptions();
		for ( WebElement e : cpList1)
		{
			String text = e.getText();
			System.out.println(text);
		}
		driver3.close();
		
	}
}
