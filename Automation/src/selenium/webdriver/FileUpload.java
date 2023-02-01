package selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//*[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\Venkata.Pattem\\Documents");
	}

}
