package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.apache.commons.;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Take screenshot and save in file
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scrFile,new File("E:\\ImagesSelenium"));
		
		

	}

}
