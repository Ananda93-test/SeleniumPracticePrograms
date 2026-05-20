package automationcoding;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation1 {

	public static void main(String[] args) throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		String title = driver.getTitle();
		System.out.println("Title of app is: "+ title);
		String appUrl = driver.getCurrentUrl();
		System.out.println("Url of app is:"+ appUrl);
		
		String att = email.getAttribute("placeholder");
		System.out.println("Attribute of placeholder is:"+att);
		
		String tag = pass.getTagName();
		System.out.println(tag);
		
		String email1 = driver.findElement(By.id("user-name")).getText();
		System.out.println("Text of login button is:"+ email1);
		
		Dimension login1 = driver.findElement(By.id("login-button")).getSize();
		System.out.println("Size of login button is:"+ login1);
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
