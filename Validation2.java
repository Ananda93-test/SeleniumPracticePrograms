package automationcoding;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Validation2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(20);
		driver.manage().window().maximize();
		Thread.sleep(10);
		WebElement email = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
          String title = driver.getTitle();
          if(title.contains("abcd"))
          {
        	  System.out.println("Title has abcd");
          }
          else
          {
        	  System.out.println("Title doesn't contain abcd");
          }
          
          String url = driver.getCurrentUrl();
          if(url.contains(".com"))
          {
        	  System.out.println("Url has .com ");
          }
          else
          {
        	  System.out.println("Url has no .com ");
          }
          String tag = email.getTagName();
          if(tag=="select")
          {
        	  System.out.println("Tagname contains select");
        	  
          }
          else
          {
        	  System.out.println("Tagname doesn't contain select but contains : "+tag);
          }
  		driver.close();
}
}