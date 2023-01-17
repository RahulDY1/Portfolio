package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class OpenUrlEdgeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Software\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
