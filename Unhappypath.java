package NewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unhappypath {
	
		public static WebDriver driver = null;
	    public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");

		driver =new ChromeDriver();     

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://link.springer.com");

		driver.findElement(By.xpath(".//*[@id='query']")).click();

		driver.findElement(By.id("query")).sendKeys("scabcdfjeh"); 
		
		driver.findElement(By.id("search")).click();

        driver.findElement(By.xpath(".//*[@id='global-search-new']")).click();
        
        driver.findElement(By.id("query")).sendKeys("astonomy"); 

        driver.findElement(By.id("search")).click();
        
        driver.quit();



	    }
}
