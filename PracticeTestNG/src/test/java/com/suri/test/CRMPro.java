package com.suri.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMPro {
	WebDriver driver;

	@Test
	public void LoginSession() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/login.cfm");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("suri123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Suri@123");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	}

	@Test
	public void contactbar() {
//		Select select = new Select(driver.findElement(By.xpath("//a[text()='Contacts']")));
//		select.selectByVisibleText("New Contact");
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a"))).build().perform();
		driver.findElement(By.linkText("New Contact")).click();

	}

	@Test
	public void calendarBar() throws InterruptedException {
		Select select = new Select(driver.findElement(By.xpath("//a[text()='Calendar']")));
		select.selectByVisibleText("New Event");
		driver.findElement(By.name("title")).sendKeys("CRMpro");
		driver.findElement(By.xpath("//*[@id=\"f_trigger_c_star")).click();
		driver.findElement(By.xpath("/html/body/div[12]/table//td[text()='22']")).click();
		Thread.sleep(5000);
	}
}
