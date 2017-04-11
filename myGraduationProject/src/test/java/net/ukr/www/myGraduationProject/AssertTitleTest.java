package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AssertTitleTest {
	@Test
	public void AssertTitle() {
		
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ukr.net/");
		
		
		//Actual Title
		String ukr_title=driver.getTitle();
		System.out.println("Title is" + ukr_title);
		Assert.assertTrue(ukr_title.contains("Всі новини України, останні новини дня в Україні та Світі"));
		
		System.out.println("Page Verified!");
		
		driver.quit();
		
	}

}
