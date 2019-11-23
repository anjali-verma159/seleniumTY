package org.tyss;
// FB 'enter the email and passwrd...and get it in console...
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//label[@for='email']"));
		System.out.println(email.getText());
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email.getText());
		
		WebElement pass=driver.findElement(By.xpath("//label[@for='pass']"));
		System.out.println(pass.getText());
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass.getText());
	
	}
}
