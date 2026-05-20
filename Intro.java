package automationcoding;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

    public static void main(String[] args)throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println("Title is" + driver.getTitle());
        //System.out.println(driver.getTitle());

       // driver.close();
        
        
        
    }
}
