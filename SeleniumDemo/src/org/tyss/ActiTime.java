package org.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");//demo.actitime.login.do
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("admin");
		
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement log=driver.findElement(By.id("loginButtonContainer"));
		log.click();
		String title=driver.getTitle();
		System.out.println(title);
	}
}
