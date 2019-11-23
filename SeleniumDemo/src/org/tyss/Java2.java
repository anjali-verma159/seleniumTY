package org.tyss;
//by searching java in google..we have to get all the header of that page...
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Java2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement google=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		google.sendKeys("java",Keys.ENTER);
		List<WebElement> java=driver.findElements(By.xpath("//span[@class='S3Uucc']"));
		for (WebElement name: java)
		{
			System.out.println(name.getText());
		}
	}
}
