package automationcoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementProg {

		public static void main(String[] args) throws Exception {
			
			System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(20);
			driver.manage().window().maximize();
			Thread.sleep(10);
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			username.sendKeys("abcd");
			Thread.sleep(3000);
			username.clear();
			Thread.sleep(5000);
			username.sendKeys("abcd2");
			password.sendKeys("12345");
			WebElement login = driver.findElement(By.id("login-button"));
			login.click();
			driver.close();
		
	}

}
