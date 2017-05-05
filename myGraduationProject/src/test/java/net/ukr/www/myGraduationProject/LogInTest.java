package net.ukr.www.myGraduationProject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {
@Test
	public  void LogIn() throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ukr.net/");
		//Login Button
		driver.findElement(By.xpath("//*[@id='user-login-form']/input[2]")).sendKeys("myGraduationProject");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log in works correctly");
		//Pass Button
		driver.findElement(By.xpath("//*[@id='user-login-form']/input[3]")).sendKeys("Diplom2017");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Password works correctly");
		//Log In Button
				driver.findElement(By.xpath("//*[@id='user-login-form']/div[2]/div/button")).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Log In Button works correctly");
				
				
				//test verify by name 

				String link = driver.findElement(By.xpath("//*[@id='login-block']/div/div/span")).getText();
				Assert.assertTrue(link.contains("mygraduationproject@ukr.net"));
				System.out.println("Log In Verify.All is OK!");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				//Letters
				driver.findElement(By.xpath("//*[@id='login-block']/div/ul/li[1]/a")).click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
/////////////////////////////////////////////////////////////////////////////////////////				
				//Написати листа click
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				}
				
				driver.findElement(By.xpath("//*[local-name()='aside']/button[text()]")).click();	
				System.out.println("Написати листа click.All is OK!");
				

				
				//"Написати листа" Кому sendKeys
				//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/section[1]/div[1]/div[4]")).sendKeys("mygraduationproject@ukr.net");
				
				driver.findElement(By.cssSelector(".sendmsg__form-label-field.auto.cropped.ui-sortable")).sendKeys("mygraduationproject@ukr.net");				

				System.out.println("'Написати листа' Кому sendKeys.All is OK!");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
				//"Написати листа" Тема sendKeys
				driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/section[1]/div[4]/div[2]/input")).sendKeys("All works Perfectly");
				
				System.out.println("'Написати листа' Тема sendKeys.All is OK!");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
				//Uploading file (Файл) Robot Class
				Robot robot = new Robot();
				driver.findElement(By.xpath("//*[@id='screens']/div/div[2]/section[2]/div[2]/label/button")).click();
				
				robot.setAutoDelay(2000);
				
				StringSelection selection = new StringSelection("C:\\Users\\Dima\\Desktop\\diplom.txt");
		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		        
		        robot.setAutoDelay(1000);
		        
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		 
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyRelease(KeyEvent.VK_V);
		        
		        robot.setAutoDelay(3000);
		        
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		        
		        robot.setAutoDelay(4000);
		        
		        System.out.println("The (diplom.txt) file was uploaded !");
				
		        
		        
		        //Text field
		         driver.findElement(By.xpath("//*[@id='screens']/div/div[2]/section[3]/div/div[3]")).sendKeys("Diplom 2017");
		         System.out.println("Text field works fine ! ");
		         
		         Thread.sleep(5000);
		         
		       // Send letter
		         driver.findElement(By.xpath("//*[@id='screens']/div/div[1]/div/button")).click();
		         System.out.println("Send letter works fine ! ");
		         
		         Thread.sleep(5000);
		         
		         
		        
				
		        //Click Вхідні
		         driver.findElement(By.xpath("//*[@id='0']/span[4]")).click();
		         System.out.println("Вхідні works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Чернетки
		         driver.findElement(By.xpath("//*[@id='10002']/span[4]")).click();
		         System.out.println("Чернетки works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Надіслані
		         driver.findElement(By.xpath("//*[@id='10001']/span[4]")).click();
		         System.out.println("Надіслані works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Спам
		         driver.findElement(By.xpath("//*[@id='10003']/span[4]")).click();
		         System.out.println("Спам works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Видалені
		         driver.findElement(By.xpath("//*[@id='10004']/span[4]")).click();
		         System.out.println("Видалені works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Непрочитані
		         driver.findElement(By.xpath("//*[@id='unread']/span[4]")).click();
		         System.out.println("Непрочитані works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Відмічені
		         driver.findElement(By.xpath("//*[@id='marked']/span[4]")).click();
		         System.out.println("Відмічені works fine ! ");
		         
		         Thread.sleep(1000);
		       //Click Вкладення
		         driver.findElement(By.xpath("//*[@id='content']/aside/div[2]/div[1]/div[1]/section[4]/div/a/span[3]")).click();
		         System.out.println("Вкладення works fine ! ");
		         
		         Thread.sleep(1000);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Вхідні click
				//driver.findElement(By.xpath("//div[@class='sidebar__list-item']/a[1]")).click();
				//driver.findElement(By.xpath("//aside[@class='sidebar']/button[@class='default compose']")).click();
				//Вхідні Verify
				//String vhidni_title=driver.getTitle();
				//System.out.println("Title is " + vhidni_title);
				
				//Assert.assertTrue(vhidni_title.contains("Вхідні"));
				
				
				
				
				
				
				
				
				
				
				
				
				
				driver.close();
				//driver.quit();
	}

}
