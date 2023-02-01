package selenium.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle = driver.getWindowHandle();		//to get that specified window path
		System.out.println("parent window"+ parenthandle);
		Thread.sleep(5000);
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(5000);
		Set<String> childhandle = driver.getWindowHandles();
		for(String handle : childhandle)
		{
			System.out.println("all windows paths are:"+ handle);
			if(! handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				String s = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div/h1")).getText();
				System.out.println("the new window text is:"+ s);
				Thread.sleep(10000);
				driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("its done");
		Thread.sleep(30000);
		driver.quit();
	}

}
