package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	
public class VerifyErrorMassageLogInTest {
@Test
	public void ErrorMessageLogInTest() {
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ukr.net/");
		//Log in Button
		driver.findElement(By.xpath("//*[@id='user-login-form']/div[2]/div/button")).click();
		
		System.out.println("Log in click Button");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actual_error = driver.findElement(By.xpath("//*[@id='login-block']/div/div[2]/div[1]")).getText();
		//String expected_error="Не вірний логін або пароль. Спробуйте знову."; Старая версия 
		//String expected_error="Неправильно вказано логін чи пароль. Спробуйте знову."; Новая версия 
		Assert.assertTrue(actual_error.contains("Неправильно вказано логін чи пароль. Спробуйте знову."));
		
		System.out.println("Error message verifyed!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Чому я не можу увійти у свою поштову скриньку? Link
		
		
		
		String link = driver.findElement(By.xpath("//*[@id='login-block']/div/div[2]/div[2]/a")).getText();
		Assert.assertTrue(link.contains("Чому я не можу увійти у свою поштову скриньку?"));
		
		System.out.println("Link verifyed!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Open link. and verify.
		
		
		
		driver.findElement(By.xpath("//*[@id='login-block']/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='firstHeading']/span")).getText().equals("Error auth");
		
		System.out.println("Error Link work fine!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
