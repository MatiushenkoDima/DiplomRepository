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
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			
			driver.findElement(By.linkText("Головне")).click();
			
			System.out.println("Головне click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.cssSelector("#main>div>h2")).getText().equals("Головні події України та світу"));
			
			System.out.println("Assert Головне");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
			driver.close();
			 driver.quit();
			
			}
	@Test
	public  void testToOpenLinkПолітика() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Політика")).click();
			
			System.out.println("Політика click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Політичні новини країни")).isDisplayed());
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[2]/a")).getText().equals("Політика"));
			 
			 System.out.println("Assert Політика");
			 
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 
			 driver.close();
			 driver.quit();
			
			}
	@Test

	public  void testToOpenLinkЕкономіка() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Timeouts timeOuts = driver.manage().timeouts();
			 timeOuts.implicitlyWait(2000, TimeUnit.SECONDS);
			 
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Економіка")).click();
			
			System.out.println("Економіка click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[3]/a")).getText().equals("Економіка"));
			
			System.out.println("Assert Економіка");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
			 
			}
				
	@Test
	public  void testToOpenLinkПодії() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Події")).click();
			
			System.out.println("Події Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[4]/a")).getText().equals("Події"));
			
			System.out.println("Assert Події");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
			

			
			
}
	@Test
	public  void testToOpenLinkСуспільство() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Суспільство")).click();
			
			System.out.println("Суспільство Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='main']/div/h2")).getText().equals("Соціальні та культурні події"));
			
			System.out.println("Assert Суспільство");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkТехнології() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Технології")).click();
			
			System.out.println("Технології Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[6]/a")).getText().equals("Технології"));
			
			System.out.println("Assert Технології");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkНаука() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Наука")).click();
			
			System.out.println("Наука Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[7]/a")).getText().equals("Наука"));
			
			System.out.println("Assert Наука");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkАвто() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Авто")).click();
			
			System.out.println("Авто Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[8]/a")).getText().equals("Авто"));
			
			System.out.println("Assert Авто");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkСпорт() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Спорт")).click();
			
			System.out.println("Спорт Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[9]/a")).getText().equals("Спорт"));
			
			System.out.println("Assert Спорт");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkЗдоровя() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Здоров'я")).click();
			
			System.out.println("Здоров'я Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[10]/a")).getText().equals("Здоров'я"));
			
			System.out.println("Assert Здоров'я");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkШоубізнес() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Шоу-бізнес")).click();
			
			System.out.println("шоу-бізнес Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[11]/a")).getText().equals("Шоу-бізнес"));
			
			System.out.println("Assert шоу-бізнес");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkЗакордоном() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("За кордоном")).click();
			
			System.out.println("Закордоном Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[13]/a")).getText().equals("За кордоном"));
			
			System.out.println("Assert За кордоном");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkКурйози() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Курйози")).click();
			
			System.out.println("Курйози Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[14]/a")).getText().equals("Курйози"));
			
			System.out.println("Assert Курйози");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkФоторепортаж() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Фоторепортаж")).click();
			
			System.out.println("Фоторепортаж Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[15]/a")).getText().equals("Фоторепортаж"));
			
			System.out.println("Assert Фоторепортаж");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			driver.close();
			 driver.quit();
}
	@Test
	public  void testToOpenLinkВідео() {
		
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.ukr.net/");
			driver.findElement(By.linkText("Відео")).click();
			
			System.out.println("Відео Click");
			
			 try{
			    	Thread.sleep(5000);
			    	}
			    	catch(InterruptedException ie){
			    	}
			
			//Assert.assertTrue(driver.findElement(By.linkText("Новини України")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nav']/div/div/ul/li[16]/a")).getText().equals("Відео"));
			
			System.out.println("Assert Відео");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 driver.close();
			 driver.quit();
}
}