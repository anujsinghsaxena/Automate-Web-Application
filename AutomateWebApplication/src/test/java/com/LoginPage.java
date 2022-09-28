package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginPage {
	WebDriver wd;
  @Test
  public void loginPageTest() {
	  wd.get("http://127.0.0.1:5500/login.html");
	  WebElement emailIdRef = wd.findElement(By.id("n1"));
	  WebElement passwordRef = wd.findElement(By.id("n2"));
		emailIdRef.sendKeys("anuj@gmail.com");
		passwordRef.sendKeys("1234");
		WebElement submitButtonRef = wd.findElement(By.id("b1"));
		submitButtonRef.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\Mphasis\\Phase 5 Programs\\chromedriver.exe");
		wd = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
