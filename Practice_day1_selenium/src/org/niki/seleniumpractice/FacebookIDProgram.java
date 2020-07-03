package org.niki.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIDProgram {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		// driver.findElement(By.cssSelector("a[ga-event-action='sign in'")).click();
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("nikhila5nayaka@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("nimamanish");
		driver.findElement(By.cssSelector("[id='passwordNext']")).click();
		// driver.get("https://www.facebook.com");
		// driver.findElement(By.id("email")).sendKeys("7019872475");
		// driver.findElement(By.className("inputtext
		// login_form_input_box")).sendKeys("Nima528$");
		// driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
}
