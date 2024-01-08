package com.expedia.flightsbooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyPressDemo1 {
	private WebDriver driver;
	private String baseUrl;
	private String signIn;
	private String emailField;
	private String passField;
	
	@BeforeClass
	public void setUp() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\Automation\\Selenium\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.letskodeit.com/practice";
		signIn = "//a[contains(text(),'Sign In')]";
		emailField = "//body/div[@id='page']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]";
		passField = "//input[@id='login-password']";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test
	public void testKeyPress() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.xpath(signIn)).click();
		driver.findElement(By.xpath(emailField)).sendKeys("test@email.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(emailField)).sendKeys(Keys.TAB);
//		driver.findElement(By.xpath(passField)).sendKeys("bigjoke");
//		Thread.sleep(3000);
//		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
	}
	
	@AfterClass
	public void tearDown() throws Exception{
		Thread.sleep(3000);
		driver.close();
	}
	

}
