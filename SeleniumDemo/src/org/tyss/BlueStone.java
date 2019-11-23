package org.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.id("signup-quick"));
		sign.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"signup-quick\"]/a")).click();
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys("admin");
		driver.findElement(By.xpath("//div[@id=\"signup-quick\"]/a")).click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin123");
		WebElement phn = driver.findElement(By.id("customer_phone"));
		phn.sendKeys("admin");
		WebElement terms = driver.findElement(By.id("terms_condition"));
		terms.click();
		WebElement signup = driver.findElement(By.id("edit-create-account"));
		signup.click();
	}
}