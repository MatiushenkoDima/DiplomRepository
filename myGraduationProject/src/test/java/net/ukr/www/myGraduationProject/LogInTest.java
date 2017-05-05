package net.ukr.www.myGraduationProject;

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
	public  void LogIn() {
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
				
				
				//Uploading file (Файл)
				
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[2]/section[2]/div[2]/label/button")).sendKeys("C:\\Users\\Dima\\Desktop\\diplom.txt");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//Вхідні click
				//driver.findElement(By.xpath("//div[@class='sidebar__list-item']/a[1]")).click();
				//driver.findElement(By.xpath("//aside[@class='sidebar']/button[@class='default compose']")).click();
				//Вхідні Verify
				//String vhidni_title=driver.getTitle();
				//System.out.println("Title is " + vhidni_title);
				
				//Assert.assertTrue(vhidni_title.contains("Вхідні"));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//driver.quit();
	}

}
