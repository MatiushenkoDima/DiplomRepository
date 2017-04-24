package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BottomTest {
@Test
	public  void testSupportUsers() {
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.ukr.net/");
	
	

	String linksupport = driver.findElement(By.linkText("Підтримка користувачів")).getText();
	Assert.assertTrue(linksupport.contains("Підтримка користувачів"));
	System.out.println("Link Підтримка користувачів was found.");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	driver.findElement(By.linkText("Підтримка користувачів")).click();
	System.out.println("Link open.");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

  
	String openlinksupport = driver.findElement(By.xpath("//*[@id='support_form']/div[5]")).getText();
	Assert.assertTrue(openlinksupport.contains("Відправити питання"));
	System.out.println("Link Підтримка користувачів was Verifyed !");
	
	 driver.quit();
	
	}
@Test
public void testConfidentiality(){
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.ukr.net/");
		
		

		String linksupport = driver.findElement(By.linkText("Конфіденційність")).getText();
		Assert.assertTrue(linksupport.contains("Конфіденційність"));
		System.out.println("Link Конфіденційність was found.");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();

		}
		driver.findElement(By.linkText("Конфіденційність")).click();
		System.out.println("Link open.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	  
		String openlinkConfidentiality = driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/div/h2")).getText();
		Assert.assertTrue(openlinkConfidentiality.contains("Угода конфіденційності"));
		System.out.println("Link Підтримка користувачів was Verifyed !");
		
		 driver.quit();
}
@Test
public void testlineNews(){
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.ukr.net/");
		
		

		String linklinenews = driver.findElement(By.linkText("Про стрічку новин")).getText();
		Assert.assertTrue(linklinenews.contains("Про стрічку новин"));
		System.out.println("Link Про стрічку новин was found.");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();

		}
		driver.findElement(By.linkText("Про стрічку новин")).click();
		System.out.println("Link open.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	  
		String openlinklineNews = driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/div/div/h2")).getText();
		Assert.assertTrue(openlinklineNews.contains("Про стрічку новин"));
		System.out.println("Link Про стрічку новин was Verifyed !");
		
		 driver.quit();
}@Test
public void testconnectlineNews(){
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.ukr.net/");
	
	

	String linkconnectlinenews = driver.findElement(By.linkText("Підключення до стрічки новин")).getText();
	Assert.assertTrue(linkconnectlinenews.contains("Підключення до стрічки новин"));
	System.out.println("Link Підключення до стрічки новин was found.");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();

	}
	driver.findElement(By.linkText("Підключення до стрічки новин")).click();
	System.out.println("Link open.");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

  
	String openlinkconnectlinenews = driver.findElement(By.xpath("//*[@id='main']/div/h2")).getText();
	Assert.assertTrue(openlinkconnectlinenews.contains("Заявка на підключення до стрічки новин"));
	System.out.println("Link Підключення до стрічки новин was Verifyed !");
	
	 driver.quit();
}
@Test
public void testadvertising(){
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.ukr.net/");
	
	

	String linkadvertising = driver.findElement(By.linkText("Реклама на порталі")).getText();
	Assert.assertTrue(linkadvertising.contains("Реклама на порталі"));
	System.out.println("Link Реклама на порталі was found.");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();

	}
	driver.findElement(By.linkText("Реклама на порталі")).click();
	System.out.println("Link open.");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

  

    String URL = driver.getCurrentUrl();
    Assert.assertNotSame(URL, "https://ua.sinoptik.ua/" );
	System.out.println("Link Реклама на порталі was Verifyed !");
	
	 driver.quit();
}


	}


