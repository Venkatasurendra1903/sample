package selenium.webdriver;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		System.out.println("the no thanks button was clicked");
//		driver.quit();
		
		
//		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
//		driver.findElement(By.name("q")).sendKeys("cricbuzz");
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		alert.dismiss();
		
//		driver.findElement(By.className("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		
	}

}
	