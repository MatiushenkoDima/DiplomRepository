package net.ukr.www.myGraduationProject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RightSideBar_Вкладки_Test {
@Test
	public  void Wkladkitest() {
	
	System.setProperty("webdriver.gecko.driver","D:\\SeleniumHQ\\gecodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.ukr.net/");
	
	//Weather Button---------------------------------------------------------------------
	driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[1]")).getText().equals("Погода");
	System.out.println("вкладка Погода найдена!");
	driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[1]")).click();
	System.out.println("Clickable Weather");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//Сurrency Button---------------------------------------------------------------------
	driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[2]")).getText().equals("Валюта");
	System.out.println("вкладка Валюта найдена!");
	
	driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[2]")).click();
	System.out.println("Clickable Сurrency");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//Fuel Button---------------------------------------------------------------------
	driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[3]")).getText().equals("Пальне");
	System.out.println("вкладка Пальне найдена!");
	
	driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[3]")).click();
	System.out.println("Clickable Fuel");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	//Horoscopes Button---------------------------------------------------------------------
		driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[4]")).getText().equals("Гороскопы");
		System.out.println("вкладка Гороскопы найдена!");
		
		driver.findElement(By.xpath("html/body/div[2]/main/div[2]/div[1]/section/ul/li[4]")).click();
		System.out.println("Clickable Horoscopes");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	System.out.println("All is Ok! ");
	
	driver.quit();
	}

}
