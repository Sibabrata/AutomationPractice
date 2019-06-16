package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Thread.sleep(5000);
	    Alert alert= driver.switchTo().alert();
	    System.out.println(alert.getText());
	  String text = alert.getText();
	  
	  if(text.equals("Please enter a valid user name")){
		System.out.println("Correct Text");  
	  }
	  
	  else {
		  
		  System.out.println("Incorrect Text");
	  }
	  
	  
	    alert.accept();
	  //  alert.dismiss();to dismiss popup
	    
		
		
		

	}

}
