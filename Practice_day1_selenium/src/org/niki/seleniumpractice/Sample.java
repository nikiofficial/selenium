package org.niki.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		// driver.getPageSource();
		System.out.println("The current webpage url is" + driver.getCurrentUrl());
		System.out.println("The title of the page is " + driver.getTitle());
		// System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();

		// driver.close();
		// driver.quit();
	}
}
