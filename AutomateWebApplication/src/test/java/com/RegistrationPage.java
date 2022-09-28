package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RegistrationPage {
	WebDriver wd;
  @Test
  public void registrationPageTest() {
	  wd.get("http://127.0.0.1:5500/Registration.html");
	  WebElement nameRef = wd.findElement(By.id("name"));
	  WebElement emailRef = wd.findElement(By.id("email"));
	  WebElement usernameRef = wd.findElement(By.id("username"));
	  WebElement passRef = wd.findElement(By.id("password"));
	  nameRef.sendKeys("Anuj SIngh Saxena");
	  emailRef.sendKeys("anuj@gmail.com");
	  usernameRef.sendKeys("anujsinghsaxena");
	  passRef.sendKeys("1234");
	  WebElement submitButtonRef = wd.findElement(By.id("submit"));
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
