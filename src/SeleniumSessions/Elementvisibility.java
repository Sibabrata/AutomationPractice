import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		//driver.get("https://ui.cogmento.com/");
		driver.get("https://api.cogmento.com/register/");

		//is displayed() method:applicable for all element
		
	boolean login=	driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).isDisplayed();
		System.out.println(login);//true
		
		//is Enabled() method
			/*boolean enabled = driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).isEnabled();
			System.out.println(enabled);*/
		
		//is selected is only applicable for checkbox,dropdown,radiobutton
		driver.findElement(By.xpath("//*[@id= 'terms']")).click();
		boolean selected = driver.findElement(By.xpath("//*[@id= 'terms']")).isSelected();
		System.out.println(selected);
	}

}
