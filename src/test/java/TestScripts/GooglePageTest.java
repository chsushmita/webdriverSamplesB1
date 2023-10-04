package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
	
		srcBox.sendKeys("Java Tutorial");
	    srcBox.sendKeys(Keys.ENTER);
	    String strTitle = driver.getTitle();
	    System.out.println("Page Title : ...."+ strTitle);
	    driver.navigate().back();
	    System.out.println("URL ...."+ driver.getCurrentUrl());
	    driver.navigate().forward();
	    
	    
	    
	    
	    

	}

}
