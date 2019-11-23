package org.tyss;
//facebook
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("alia bhatt");
	WebElement pas=driver.findElement(By.id("pass"));
	pas.sendKeys("ranbir");
	WebElement log=driver.findElement(By.id("loginbutton"));
	log.click();
}
}
