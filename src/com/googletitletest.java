package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletitletest {

	 WebDriver driver;

     @BeforeMethod
     public void Setup() {
             System.setProperty("webdriver.chrome.driver", "F:chromedriver\\chromedriver.exe");
             driver = new ChromeDriver();
             //driver.manage().window().maximize();
             driver.manage().deleteAllCookies();
             driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
             driver.get("https://www.google.com/");
     }

     @Test(priority=1)
     public void googletitletext() {
             String title = driver.getTitle();
             System.out.println(title);
             
             Assert.assertEquals(title, "Google123","Title is not matched");
             
     }
     
     @Test(priority=2,groups="Title")
     public void googlelogotext() {
           boolean b =   driver.findElement(By.xpath("//*[@id= 'hplogo']")).isDisplayed();

             Assert.assertTrue(b);
             
     }

     @AfterMethod
     public void quit() {
    	 
    	 driver.quit();
     }
     
     
}
