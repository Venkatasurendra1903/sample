package selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement wb = driver.findElement(By.id("course"));
		Select s = new Select(wb);
		List<WebElement> lwe = s.getOptions();
		for(WebElement i : lwe)
		{
			System.out.println(i.getText());
		}
		s.selectByIndex(2);
		Thread.sleep(10000);
		
		s.selectByValue("js");
		Thread.sleep(10000);
		
		s.selectByVisibleText("Python");
		Thread.sleep(10000);
		driver.quit();
	}

}
