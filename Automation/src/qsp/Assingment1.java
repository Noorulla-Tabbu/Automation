package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean box = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(box==true)
			System.out.println("Status of the chech box is selected");
		else
			System.out.println("Status of the chech box is not selected");
		driver.close(); 
	//************************************************************************************************
	//status of LOGIN BUTTON(not came)		
		/*driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		boolean lgnbtn = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if (lgnbtn==true) {
			System.out.println("login button is not disabled and failed");
		} else {
			System.out.println("login button is disabled and pass");
		}
		driver.close();*/
		
	//************************************************************************************************		
	//Text present in the Forgot Your Password Link		
		/*driver.get("https://demo.actitime.com/");
		String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println("Text present in the forgot your password link is : "+text);
		driver.close();*/

	//************************************************************************************************		
	//Tag name present in the Forgot Your Password Link is a or not					
		/*driver.get("https://demo.actitime.com/");
		 String tag = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		if(tag.equals("a"))
			System.out.println("Tag name present in the Forgot Your Password Link is tag-a");
		else
			System.out.println("Tag name present in the Forgot Your Password Link is not tag-a");
		driver.close();*/

	//************************************************************************************************		
	//printing ID present in username text box 				
		/*driver.get("https://demo.actitime.com/");
		String id = driver.findElement(By.name("username")).getAttribute("id");
		System.out.println("Tag name present in username text box is :"+id);
		driver.close();*/

	//******************************************************************************************************
	//Writing a Main Program
		/*driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);*/

	//******************************************************************************************************
	//Copying from one text box into another text box
		/*driver.get("file:///D:/Desktop%20files/abc.html");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"av");
		driver.close();*/

	//******************************************************************************************************		
	//checking Height and Width of UN and PW are equal
		/*driver.get("https://demo.actitime.com/");
		WebElement size1 = driver.findElement(By.id("username"));
		int h1 = size1.getSize().getHeight();
		int w1 = size1.getSize().getWidth();
		WebElement size2 = driver.findElement(By.name("pwd"));
		int h2 = size2.getSize().getHeight();
		int w2= size2.getSize().getWidth();
		if(h1==h2 && w1==w2)
			System.out.println("Height and Width of UN and PW are equal");
		else
			System.out.println("Height and Width of UN and PW are not equal");
		driver.close();*/

	//******************************************************************************************************		
	//printing X-axis and Y-axis of Email text box of FB
		/*driver.get("https://www.facebook.com/");
		int x = driver.findElement(By.id("email")).getLocation().getX();
		int y = driver.findElement(By.id("passContainer")).getLocation().getY();
		System.out.println("X-axis of email text box in FB : "+x+"px");
		System.out.println("Y-axis of email text box in FB : "+y+"px");
		driver.close();*/

	//******************************************************************************************************		
	//Checking gender radio buttons allinged properly or not
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).getLocation().getY();
		System.out.println(y1);
		int y2 = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).getLocation().getY();
		System.out.println(y2);
		int y3 = driver.findElement(By.xpath("(//input[@name='sex'])[3]")).getLocation().getY();
		System.out.println(y3);
		if(y1==y2 && y2==y3)
			System.out.println("Gender radio buttons are allinged properly in FB");
		else
			System.out.println("Gender radio buttons are not allinged properly in FB");
		driver.close();*/

	}
}
