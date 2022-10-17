package com.chase.com.loggingin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loggingin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.chase.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("userId")).sendKeys("wgyrtr65");
		//Thread.sleep(2000);
		driver.findElement(By.id("password-text-input-field")).sendKeys("iccha");
		//Thread.sleep(2000);
		driver.findElement(By.id("signin-button")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		//C:\\Driver\\chromedriver.exe

	}

}
