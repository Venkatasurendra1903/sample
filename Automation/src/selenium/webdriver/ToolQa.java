package selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQa 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.dirver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("surendra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("suri123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("nellore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("nellore");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label")).click();
		System.out.println("the check box is verified");
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		System.out.println("the radio box coloumn is opened");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.id("item-3")).click();

//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[1]/span/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button")).click();
	
//		driver.findElement(By.xpath("//*[@id=\"item-7\"]/span")).click();
//		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Venkata.Pattem\\Documents");
//		driver.quit();
	}

}
