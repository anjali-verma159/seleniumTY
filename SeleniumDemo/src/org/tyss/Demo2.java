package org.tyss;
//gmail.com
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//uc
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("i.anjali.verma159");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("hjgjhjh",Keys.ENTER);;
	}
}