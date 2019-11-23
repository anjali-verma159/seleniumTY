package org.tyss;
//(google launch)... first search java... and than remove the java... 
//and search selenium... and than again go back to java page... 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");//browser name,path
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement google=driver.findElement(By.name("q"));
		//Thread.sleep(2000);
		google.sendKeys("java",Keys.ENTER);
		WebElement clear=driver.findElement(By.name("q"));
		Thread.sleep(2000);
		clear.clear();
		WebElement g1=driver.findElement(By.name("q"));
		g1.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
}
}