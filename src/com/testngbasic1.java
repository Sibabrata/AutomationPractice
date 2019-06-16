package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngbasic1 {
	
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
        }

        @Test(priority=3,groups="Title")
        public void googlelogotext() {
                driver.findElement(By.xpath("//*[@id= 'hplogo']")).isDisplayed();

        }

        @Test(priority=2,groups="Email")
        public void googlemail() {
                Boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
                System.out.println(b);
        }

        @Test(priority=4,groups="test")
        public void test1() {
                System.out.println("test1");
        }

        @Test(priority=5,groups="test")
        public void test2() {
                System.out.println("test2");
        }

        @Test(priority=6,groups="test")
        public void test3() {
                System.out.println("test3");
        }

        @AfterMethod

        public void tearDown() {
                driver.quit();
        }


}
