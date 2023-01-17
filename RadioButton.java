
package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Shammi jha\\\\Training Materials\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    
	    //Handling radio button
	    //1st way - not a good approach
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='-1']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    
	    
	    //2nd Way - Not a Appropiate 
	    List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("No. of Radio Button = " + radios.size());
	    System.out.println(radios.get(0).isEnabled());
	    System.out.println(radios.get(2).isDisplayed());
	    System.out.println(radios.get(1).isSelected());
	    Thread.sleep(2000);
	    radios.get(0).click();
	    System.out.println(radios.get(1).isSelected());
	    
	    
	    //3rd Way - correct way
	    List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
	    System.out.println("No. of Radio Button Test = " + radios1.size());
	    String expResult = "Female";
	    for (int i = 0; i < radios1.size(); i++) {
	    	if (radios1.get(i).getText().equalsIgnoreCase(expResult)) {
	    		radios1.get(i).click();
	    		System.out.println(expResult + " Clicked");
	    		break;
	    	}
	    	
	    }
	}

}
