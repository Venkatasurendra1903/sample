package selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkata.Pattem\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
/*		String exptitle = "Facebook – log in or sign up";
		String acttitle = driver.getTitle();
*/		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("suri");
		driver.findElement(By.name("lastname")).sendKeys("Pattem");
		driver.findElement(By.name("reg_email__")).sendKeys("p123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("p123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Naredra@123");
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
//		Thread.sleep(3000);
		select.selectByVisibleText("1");
		Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		select1.selectByVisibleText("Jun");
		Select select2= new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		select2.selectByVisibleText("2003");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"u_2_o_Ig\"]/span[2]/label")).click();


	
//		driver.findElement(By.name("birthday_day")).click();
//		driver.findElement(By.xpath("//option[text()='9']")).click();
//		driver.findElement(By.name("birthday_month")).click();
//		driver.findElement(By.xpath("//option[text()='Jul']")).click();
//		driver.findElement(By.name("birthday_year")).click();
//		driver.findElement(By.xpath("//option[text()='2001']")).click();
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//		System.out.println("all details are filled successfully");
//		driver.quit();
		
		
//		driver.findElement(By.name("code")).sendKeys("67995");
//		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
	}

}
