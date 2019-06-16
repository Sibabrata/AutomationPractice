import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		
	
		
		
		

	}

}
