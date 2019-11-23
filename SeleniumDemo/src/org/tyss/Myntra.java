package org.tyss;
//MYNTRA 'click on search and search product after that click on the first product
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement search=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		//search.click();
		search.sendKeys("tops",Keys.ENTER);
		driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/productimage/2018/12/1/68bb5df2-6311-46f5-960a-95b77a1fe5671543625734150-1.jpg']")).click();
	}
}
