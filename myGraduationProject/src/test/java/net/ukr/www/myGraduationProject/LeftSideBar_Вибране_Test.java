package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class LeftSideBar_Вибране_Test {

	
	@Test
	
	public  void testToConfirmTextVubrane() {
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    //find Вибране
	    String vubrane = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/h3")).getText();
		Assert.assertTrue(vubrane.contains("Вибране"));
	    System.out.println("All is Ok! Вибране найдено.");
	    
	    driver.quit();
 
	}
	@Test
	public void testToVerifyLinkSinoptik(){
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    String Sinoptik = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[1]")).getText();
		Assert.assertTrue(Sinoptik.contains("Sinoptik"));
	    System.out.println("All is Ok! Sinoptik найдено.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//find link Sinopnik
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[1]")).click();
	    //Assert Sinoptik Link
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    //String Sinoptiklink = driver.findElement(By.xpath("//*[@id='header']/div[4]/h1/strong")).getText();
		//Assert.assertTrue(Sinoptiklink.contains("Погода"));
	    //System.out.println("All is Ok! Sinoptik link was Asserted.");
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "https://ua.sinoptik.ua/" );
	    
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println("All is Ok! Sinoptik link was Asserted.");
	    
	    driver.quit();
	    
	    
	}
	@Test
	public void testToVerifyLinkorakul(){
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String Oracul = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[2]")).getText();
		Assert.assertTrue(Oracul.contains("Оракул"));
	    System.out.println("All is Ok! Оракул найдено.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//find link Oracul
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[2]")).click();
	    //Assert link
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "http://orakul.com/" );
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  	    System.out.println("All is Ok! Orakul link was Asserted.");
	  	    
	  	    
	  	    driver.quit();
	}
	@Test
	public void testToVerifyLinkTVgid(){
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String TV = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[3]")).getText();
		Assert.assertTrue(TV.contains("ТВ-гiд"));
	    System.out.println("All is Ok! ТВ-гiд найдено.");
	    
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//find link ТВ-гiд
	    //driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[3]]")).click();
	      driver.findElement(By.cssSelector(".a2")).click();
	    
	      try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "https://tvgid.ua/" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! TV-gid link was Asserted.");
	  	    
	  	    
	  	    driver.quit();
		
	}
    @Test
    public void testToVerifyLinkKinoafisha(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String Kino = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[4]")).getText();
		Assert.assertTrue(Kino.contains("Кіноафіша"));
	    System.out.println("All is Ok! Кіноафіша найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link Кіноафіша
	    driver.findElement(By.cssSelector(".a3")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "http://kinoafisha.ua/ua/?utm_source=ukr.net&utm_medium=link&utm_campaign=izbranoe" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! Kinoafisha link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkAvtosale(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String avto = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[5]")).getText();
		Assert.assertTrue(avto.contains("AVTOSALE"));
	    System.out.println("All is Ok! AVTOSALE найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link Кіноафіша
	    driver.findElement(By.cssSelector(".a4")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "http://avtosale.ua/" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! AVTOSALE link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkOnOna(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String avto = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[1]/a[6]")).getText();
		Assert.assertTrue(avto.contains("ОнОна"));
	    System.out.println("All is Ok! ОнОна найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link OnOna
	    driver.findElement(By.cssSelector(".a5")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}    
	
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "http://onona.ua/" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! OnOna link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkRozetka(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String rozetka = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[1]")).getText();
		Assert.assertTrue(rozetka.contains("ROZETKA"));
	    System.out.println("All is Ok! ROZETKA найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link ROZETKA
	    driver.findElement(By.cssSelector(".a0")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "http://rozetka.com.ua/?utm_source=ukr_net_main&utm_medium=banner_logo&utm_campaign=logo_main" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! ROZETKA link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkLeBoutique(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String LeBoutique = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[2]")).getText();
		Assert.assertTrue(LeBoutique.contains("LeBoutique"));
	    System.out.println("All is Ok! LeBoutique найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link LeBoutique
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[2]")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "https://leboutique.com/welcome/zara-odejda-rasprodaja-101?slogan=6531646&discount=80&utm_source=ukr.net&utm_campaign=main_pr&pk_medium=link&utm_content=zara&pk_source=none&pk_plc=ukr.net&utm_medium=cpm" );
	  	
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    System.out.println("All is Ok! LeBoutique link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
	}
    @Test
    public void testToVerifyLinkWork(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String Work = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[3]")).getText();
		Assert.assertTrue(Work.contains("WORK.ua"));
	    System.out.println("All is Ok! WORK.ua найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link WORK.ua
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[3]")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "https://www.work.ua/?utm_source=ukr.net&utm_medium=advert&utm_campaign=main_izbrannoe" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! WORK.ua link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkMakeUp(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String MakeUp = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[4]")).getText();
		Assert.assertTrue(MakeUp.contains("MakeUp"));
	    System.out.println("All is Ok! MakeUp найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link MakeUp
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[4]")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "https://makeup.com.ua/?utm_source=ukr.net&utm_medium=cpc&utm_content=izbrannoe&utm_campaign=makeup_link" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! MakeUp link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkAnswearua(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String Answear = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[5]")).getText();
		Assert.assertTrue(Answear.contains("Answear.ua"));
	    System.out.println("All is Ok! Answear.ua найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link Answear.ua
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[5]")).click();
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "http://answear.ua/?utm_medium=display&utm_source=ukr.net&utm_campaign=main_page_042017&utm_term=button" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! Answear.ua link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
    @Test
    public void testToVerifyLinkBooking(){
    	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.ukr.net/");
	    
	    
	    
	    String Booking = driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[6]")).getText();
		Assert.assertTrue(Booking.contains("Booking"));
	    System.out.println("All is Ok! Booking найдена.");
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  //find link Booking
	    driver.findElement(By.xpath("html/body/div[2]/main/div[1]/div/div[1]/section[2]/div/div[2]/a[6]")).click();
	   
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    String URL = driver.getCurrentUrl();
	    Assert.assertNotSame(URL, "https://www.booking.com/index.html?aid=375206" );
	    
	    try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	  	System.out.println("All is Ok! Booking link was Asserted.");
	  	
	  	
	  	
	  	driver.quit();
    }
}
   
    
