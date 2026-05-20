package automationcoding;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsProg {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(20);
		driver.manage().window().maximize();
		Thread.sleep(10);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.of links : "+ links.size());
		
	}

}
