package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	public static void main(String[] args) {
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";					
        System.setProperty("webdriver.chrome.driver","D:Selenium\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).click();
		if (driver.getTitle().equals("Facebook – log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        }
		else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
		
	}
}