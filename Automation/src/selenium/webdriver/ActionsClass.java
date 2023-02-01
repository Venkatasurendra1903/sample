package selenium.webdriver;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionsClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.sdriver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println("the notification pop up is blocked");
		
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(4000);
//		alert.dismiss();
		
		
	/*	driver.get("https://demoqa.com/text-box");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
		driver.findElement(By.className("header-text")).click();
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		Thread.sleep(5000);
//		driver.manage().window().minimize();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();
		
		*/
	}

}
