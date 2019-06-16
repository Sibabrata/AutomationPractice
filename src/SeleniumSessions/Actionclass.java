package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='highlight-addons']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SpiceLounge")).click();
		
		

	}

}
