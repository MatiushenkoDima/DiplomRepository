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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.ukr.net/");
		//Log in Button
		driver.findElement(By.xpath("//*[@id='user-login-form']/div[2]/div/button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actual_error = driver.findElement(By.xpath("//*[@id='login-block']/div/div[2]/div[1]")).getText();
		//String expected_error="Не вірний логін або пароль. Спробуйте знову.";
		
		
		
		Assert.assertTrue(actual_error.contains("Не вірний логін або пароль. Спробуйте знову."));
		
		
		System.out.println("Error message verifyed , test completed !");
		
		
		driver.quit();

	}

}
