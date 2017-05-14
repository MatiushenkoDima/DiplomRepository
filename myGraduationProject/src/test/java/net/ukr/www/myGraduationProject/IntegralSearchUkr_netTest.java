package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegralSearchUkr_netTest {
@Test
	public  void testIntegralSearch() {
		
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ukr.net/");
		
		
		////////////////////////////// Search Field
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		String cssOfInputField = "input[name='q']";
	    WebElement inputFieldQ = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfInputField)));
	    try{
	    	Thread.sleep(2500);
	    	}
	    	catch(InterruptedException ie){
	    	}
	    inputFieldQ.sendKeys("ukr.net");
	    
		System.out.println("Input ukr.net ");
		
		/////////////////////////////// Button Search
	    
	    //driver.findElement(By.xpath("//*[@id='search-form']/div/input[2]")).click();
	    
	    String xPathOfSearchButton = "//*[@id='search-form']/div/input[2]";
	    
	    WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathOfSearchButton)));
	    searchButton.click();
	    try{
	    	Thread.sleep(2000);
	    	}
	    	catch(InterruptedException ie){
	    	}
		
	    System.out.println("Search button click");

	    try{
	    	Thread.sleep(2000);
	    	}
	    	catch(InterruptedException ie){
	    	}
	    System.out.println("Search works ");
		driver.close();
		driver.quit();
	}

}
