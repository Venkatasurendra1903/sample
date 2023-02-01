package com.suri.test;

//import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertExample {
	WebDriver driver;
	/*
	 * @Test public void equalsOrNot() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver(); driver.get("https://www.google.co.in/");
	 * driver.findElement(By.name("q")).sendKeys("flipkart", Keys.ENTER); String
	 * expectedTitle = "flipkart - Google Search"; String actualTitle =
	 * driver.getTitle(); assertEquals(actualTitle, expectedTitle); driver.quit(); }
	 */

	@Test
	public void facebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("suri@gmail.com", Keys.ENTER);
		Thread.sleep(5000);

		SoftAssert s = new SoftAssert();
		// title asserion
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();
		s.assertEquals(actualTitle, expectedTitle);

		// url assertion
		String expectedUrl = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY5MTc4ODc1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		String actualUrl = driver.getCurrentUrl();
		s.assertNotEquals(actualUrl, expectedUrl);

		// text asserion
		String expectedText = "suri@gmail.com";
		String actualText = driver.findElement(By.name("email")).getAttribute("Value");
		s.assertEquals(actualText, expectedText);

		// Border asserion
		String expectedBorder = "1px solid rgb(221, 223, 226)";
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		s.assertEquals(actualBorder, expectedBorder);

		// errorMessage asserion
		String expectederrorMessage = "The password that you've entered is incorrect. Forgotten password?";
		String actualerrorMessage = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
		s.assertEquals(actualerrorMessage, expectederrorMessage);

		driver.quit();
		s.assertAll();
	}
}
