package gurpreet.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gurpreet\\Desktop\\selenium files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("LM6RPg")).sendKeys("JBL earphones");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.className("vh79eN")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String at=driver.getTitle();
		String et="flipkart";
		System.out.println(at);
		driver.close();
		if(at.equalsIgnoreCase(et))
			System.out.println("Test Successful");
		else
			System.out.println("Test Failure");

	}
}
