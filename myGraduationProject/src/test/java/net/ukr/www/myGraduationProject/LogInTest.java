package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {
@Test
	public  void LogIn(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ukr.net/");
		//Login Button
		driver.findElement(By.xpath("//*[@id='user-login-form']/input[2]")).sendKeys("");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Log in works correctly");
		//Pass Button
		driver.findElement(By.xpath("//*[@id='user-login-form']/input[3]")).sendKeys("");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Password works correctly");
		//Log In Button
				driver.findElement(By.xpath("//*[@id='user-login-form']/div[2]/div/button")).sendKeys("");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Log In Button works correctly");
	}

}
