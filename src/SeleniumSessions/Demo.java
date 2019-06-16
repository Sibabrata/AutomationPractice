import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	 
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();//launch browser
	 driver.get("https://www.google.com/");//enter URL
	 String Title = driver.getTitle();
	 System.out.println(Title);
	 
	 
	 //validation point
	 if(Title.equals("Google")){
		 System.out.println("correct URL");
	 }//end of if
	 else {
		 
		 System.out.println("Incorrect URL");
	 }
	 
	 System.out.println(driver.getCurrentUrl());
	 //System.out.println(driver.getPageSource());
	  driver.quit();//close the browser
	  
	}
	

}
