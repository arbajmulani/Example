package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",
	        		"C:\\Program Files\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
         driver.get("https://demoapps.qspiders.com/");
         driver.manage().window().maximize();
         System.out.println(driver.getTitle());
         WebElement tileUITestingCocepts = driver.findElement(By.xpath("//*[@id=\"optionsBody\"]/a[1]/div/main/div[2]"));
         tileUITestingCocepts.click();
         driver.quit();
	}

}
