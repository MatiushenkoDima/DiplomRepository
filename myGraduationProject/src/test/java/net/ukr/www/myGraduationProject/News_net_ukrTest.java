package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;



public class News_net_ukrTest {
	@Test
	public  void testToOpenLinkГоловне() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Головне")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.cssSelector("#main>div>h2")).getText().equals("Головні події України та світу"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
			
			}
	@Test
	public  void testToOpenLinkПолітика() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Політика")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Політичні новини країни")).isDisplayed());
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[2]/a")).getText().equals("Політика"));
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
			
			}
	@Test

	public  void testToOpenLinkЕкономіка() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
			Timeouts timeOuts = driver.manage().timeouts();
			 timeOuts.implicitlyWait(2000, TimeUnit.SECONDS);
			 
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Економіка")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[3]/a")).getText().equals("Економіка"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
			
			}
				
	@Test
	public  void testToOpenLinkПодії() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Події")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[4]/a")).getText().equals("Події"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
			

			
			
}
	@Test
	public  void testToOpenLinkСуспільство() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Суспільство")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='main']/div/h2")).getText().equals("Соціальні та культурні події"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkТехнології() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Технології")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[6]/a")).getText().equals("Технології"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkНаука() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Наука")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[7]/a")).getText().equals("Наука"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkАвто() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Авто")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[8]/a")).getText().equals("Авто"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkСпорт() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Спорт")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[9]/a")).getText().equals("Спорт"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkЗдоровя() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Здоров'я")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[10]/a")).getText().equals("Здоров'я"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkШоубізнес() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Шоу-бізнес")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[11]/a")).getText().equals("Шоу-бізнес"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkЗакордоном() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("За кордоном")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[12]/a")).getText().equals("За кордоном"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkКурйози() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Курйози")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[13]/a")).getText().equals("Курйози"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkФоторепортаж() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Фоторепортаж")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[14]/a")).getText().equals("Фоторепортаж"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
	@Test
	public  void testToOpenLinkВідео() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Відео")).click();
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[15]/a")).getText().equals("Відео"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.quit();
}
}