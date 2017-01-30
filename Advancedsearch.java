package NewProject;

import java.awt.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Advancedsearch {
	
	public static WebDriver driver = null ;
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://link.springer.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='search-options']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='advanced-search-link']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		driver.findElement(By.xpath(".//*[@id='advanced-search-form']/div[1]/div[1]/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='advanced-search-form']/div[1]/div[1]/input")).sendKeys("Astronomy");
		
		driver.findElement(By.xpath(".//*[@id='advanced-search-form']/div[1]/div[2]/input")).sendKeys("Space Travel");
	
		driver.findElement(By.xpath(".//*[@id='advanced-search-form']/div[1]/div[3]/input")).sendKeys("Space station");
	
		driver.findElement(By.xpath(".//*[@id='advanced-search-form']/div[1]/div[5]/input")).sendKeys("Space");
		
		driver.findElement(By.xpath("//*[@id='facet-start-year']")).sendKeys("2010");
		
		driver.findElement(By.xpath("//*[@id='facet-end-year']")).sendKeys("2017");
		
		driver.findElement(By.xpath(".//*[@id='submit-advanced-search']")).click();
		String result = driver.findElement(By.xpath("//*[@id='kb-nav--main']/div[1]/h1/strong")).getText();
		System.out.println(result);
		
		      
	       driver.quit();	
		

	}

}
