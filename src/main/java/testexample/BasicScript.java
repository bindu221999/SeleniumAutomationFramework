package testexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		String title=driver.getTitle();
		System.out.println("Title is : " + title);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.clear();
	    pwd.sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
				
				
		
		
				
	}

}
