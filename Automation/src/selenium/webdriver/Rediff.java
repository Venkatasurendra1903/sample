package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rediff.com//");
		driver.findElement(By.linkText("Sign in")).click();
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		System.out.println("You need to switch to pop-up window to cancel that window");
		Alert alert = driver.switchTo().alert();
		System.out.println("pop-up window opened");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		alert.accept();
		System.out.println("pop-up window closed");
		driver.manage().window().minimize();
		Thread.sleep(30000);
		driver.quit();

	}

}
