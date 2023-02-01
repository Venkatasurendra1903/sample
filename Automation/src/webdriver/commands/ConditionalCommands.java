package webdriver.commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConditionalCommands 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.sdriver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("you need to click on the closing button:");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		System.out.println("button clicked");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
		driver.findElement(By.linkText("Women Ethnic")).click();
	}

}