import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//file upload never click on browse ass xpath and then send keys of file location
public class Windowspopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("C:\\Users\\Madan\\Desktop\\Invoice Iphone.pdf");;
		
		

	}

}
