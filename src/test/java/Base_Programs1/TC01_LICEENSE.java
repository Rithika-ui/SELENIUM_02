package Base_Programs1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_LICEENSE {
	
WebDriver driver;
	
@Test(groups= {"regression"})
	public void TEST() {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		driver.findElement(By.xpath("//a[text()='Licenses']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("BETA12");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

		  driver.quit();
	

}
}
