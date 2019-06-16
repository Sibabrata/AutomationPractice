package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Use window handler api

public class BrowserWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//*[@class='black']")).click();
		
		Set <String> handler = driver.getWindowHandles();
		Iterator <String> it = handler.iterator();
		String parentwindowid= it.next();
		System.out.println("Parentwindowid"+parentwindowid);
		String childwindowid= it.next();
		System.out.println("Childwindowid"+childwindowid);
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
	    driver.close();
	    driver.switchTo().window(parentwindowid);
	    System.out.println(driver.getTitle());
	    

	}

}
