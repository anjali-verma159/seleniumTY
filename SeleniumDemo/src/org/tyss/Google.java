package org.tyss;
//Google 'click on the search and search java...whatevr the suggetiom will come..get that in console...
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement google=driver.findElement(By.name("q"));
		//Thread.sleep(10000);
		google.sendKeys("java");
		google.click();
		Thread.sleep(10000);
 		List <WebElement> search=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for(WebElement name : search)
			{
				System.out.println(name.getText());
			}
	}
}
