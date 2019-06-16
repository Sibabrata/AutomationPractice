import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("roysibabrata1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Orc-5515");;
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		driver.switchTo().frame("String");
		driver.switchTo().frame("Integer");
		
		
		
		

	}

}
