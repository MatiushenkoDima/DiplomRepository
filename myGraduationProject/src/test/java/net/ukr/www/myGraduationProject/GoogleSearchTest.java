package net.ukr.www.myGraduationProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleSearchTest {
	
	

	@SuppressWarnings("deprecation")
	@Test
	public void testToSerchOpenAssertMain() {
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com.ua");
	
	// search page
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
		
	String cssOfInputField = "input[name='q']";
    WebElement inputFieldQ = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfInputField)));
    try{
    	Thread.sleep(4000);
    	}
    	catch(InterruptedException ie){
    	}
    inputFieldQ.sendKeys("ukr.net");
    
    
    String cssOfSearchButton = "button[name='btnG']";
    
    WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssOfSearchButton)));
    searchButton.click();
    try{
    	Thread.sleep(3000);
    	}
    	catch(InterruptedException ie){
    	}
    
 // search results page
   
    driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/h3/a")).click();
    try{
    	Thread.sleep(5000);
    	}
    	catch(InterruptedException ie){
    	}
    //Accert na main page
    
    Assert.assertTrue(driver.findElement(By.xpath("html/body/div[2]/main/div/header/section[1]/a/img")).isDisplayed());

    //back to google search,
    
    
	
	driver.quit();
	
	

	}
	
		
	
	
	
	

}
