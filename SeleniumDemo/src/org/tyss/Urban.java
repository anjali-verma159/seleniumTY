package org.tyss;
//urbanladder 'open the urbanladder and than close the popup and get the text 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Urban {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		WebElement dining=driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		System.out.println(dining.getText());
		WebElement search=driver.findElement(By.xpath("//span[@class=\"twitter-typeahead\"]"));
		search.sendKeys("dining");
		List<WebElement> menu=driver.findElements(By.xpath("//div[@id=\"topnav_wrapper\"]"));
		for(WebElement list : menu)
		{
			System.out.println(list.getText());
		}	
	}
}
