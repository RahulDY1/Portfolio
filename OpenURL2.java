package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shammi jha\\Training Materials\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		
		drive.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		System.out.println(drive.getTitle());
		
		Thread.sleep(2000);
		drive.navigate().to("https://www.amazon.com/");
		
		Thread.sleep(2000);
		System.out.println(drive.getTitle());
		
		Thread.sleep(2000);
		drive.navigate().back();
		
		Thread.sleep(2000);
		drive.navigate().refresh();
		
		Thread.sleep(2000);
		drive.navigate().forward();
		
		Thread.sleep(2000);
		String currentURL = drive.getCurrentUrl();
		System.out.println(currentURL);
		
		Thread.sleep(2000);
		drive.close();
		
		Thread.sleep(2000);
		drive.quit();
		
		
		
		
	}

}
