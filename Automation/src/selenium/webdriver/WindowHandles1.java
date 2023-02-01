package selenium.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle = driver.getWindowHandle();		//to get that specified window path
		System.out.println("parent window"+ parenthandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> childHAndle = driver.getWindowHandles();	//to get multiple window paths
		for(String i: childHAndle)
		{
			System.out.println("all windows "+ i);
			if(!i.equals(parenthandle))
			{
				driver.switchTo().window(i);		//switch to parent to child window
				driver.findElement(By.id("firstName")).sendKeys("suri");
				Thread.sleep(10000);		//wait 10 sec
				driver.close();			// close this window
			}
			
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().window(parenthandle);		// switch from child to parent window
		driver.findElement(By.id("name")).sendKeys("parent");
//		driver.quit();
	}

}
