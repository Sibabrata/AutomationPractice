import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExec {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		WebElement loginbtn= driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
	    flash(loginbtn,driver);
	}

	//executeScript is used to execute java script code its cast in java script Executor
	
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundcolor");
		for(int i = 0;i<200;i++) {
			changecolor("rgb(0,200,0)",element,driver);//1
			changecolor(bgcolor,element,driver);//2
		}
		
	}


	public static void changecolor(String color, WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor='"+color+"'", element);
		
	}
	
	
	
	
}
