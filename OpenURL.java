package Testing;

import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Setting the property of chrome browser and passing chromeDriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Shammi jha\\Training Materials\\chromedriver_win32\\chromedriver.exe");
		
		//Launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		// Launching Application url using get method
		driver.get("http://gcreddy.com/project/index.php");
		driver.manage().window().maximize();	
		
		Thread.sleep(3000);
		driver.navigate().to("https://in.iherb.com/");
		driver.manage().window().maximize();	
		
	  
	   
		(	
		
	}

}
 