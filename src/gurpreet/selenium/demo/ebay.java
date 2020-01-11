package gurpreet.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gurpreet\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.paypal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ul-btn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("email")).sendKeys("seleniumtesting@gmail.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("btnNext")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String at=driver.getTitle();
		String et="Forgotten Password";
		System.out.println(at);
		driver.close();
		if(at.equalsIgnoreCase(et))
			System.out.println("Test Successful");
		else
			System.out.println("Test Failure");

	}

}
