package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class configproperties {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException{

	
		
       Properties prop = new Properties();
       FileInputStream io = new FileInputStream("C:\\Users\\Madan\\eclipse-workspace\\AutomationPractice\\config.properties");
       prop.load(io);
      System.out.println(prop.getProperty("Name"));
      System.out.println(prop.getProperty("Gender"));  
      String url= prop.getProperty("URL");
      System.out.println(url);
      String browser = prop.getProperty("BrowserName");
      System.out.println(browser);
       
       if (browser.equals("Chrome")) {
    	   
    	   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
    	    driver = new ChromeDriver();//launch chrome
       }else if(browser.equals("Firefox")) {
    	   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\geckodriver.exe");
    	    driver = new FirefoxDriver(); //launch FF
    	   
       }
    
       driver.get(url);
    	   
       }
		
	   

}
