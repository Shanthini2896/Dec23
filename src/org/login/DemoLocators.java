package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHANTHINIPARAMASIVAN\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().to("https://www.youtube.com/channel/UCaCVGueKcvxnMjV1waiu5cA");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		driver.manage().window().maximize();
	}

}
