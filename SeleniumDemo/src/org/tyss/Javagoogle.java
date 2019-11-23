package org.tyss;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;

//search the java in google and click on the 3rd search list 
public class Javagoogle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement google=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		google.sendKeys("java");
		google.click();
		Thread.sleep(10000);
		List <WebElement> search=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		List<WebElement>java=driver.findElements(By.tagName("//ul[@class='erkvQe']/li[@class='sbct']/div[@class='jKWzZXdEJWi__suggestions-inner-container']"));
		search.listIterator(3);
	}
}
