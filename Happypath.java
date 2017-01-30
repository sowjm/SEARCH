package NewProject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Happypath {
	
		public static WebDriver driver = null;
	    public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");

		driver =new ChromeDriver();     

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://link.springer.com");

		driver.findElement(By.xpath(".//*[@id='query']")).click();

		driver.findElement(By.id("query")).sendKeys("science"); 

        driver.findElement(By.id("search")).click();

        System.out.println("Search result Success");               

        driver.quit();

	}

}


