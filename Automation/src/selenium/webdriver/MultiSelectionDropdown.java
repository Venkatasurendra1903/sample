package selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement wb = driver.findElement(By.id("ide"));
		Select select= new Select(wb);
		List<WebElement> element = select.getOptions();
		for(WebElement i : element)
		{
			System.out.println(i.getText());
		}
		select.selectByIndex(3);
		Thread.sleep(10000);
		
		select.selectByValue("ij");
		Thread.sleep(10000);
		
		select.selectByVisibleText("Eclipse");
		Thread.sleep(10000);
		
		select.deselectAll();
		driver.quit();
	}

}
