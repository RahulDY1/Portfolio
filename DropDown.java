package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shammi jha\\Training Materials\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']")).click();
		
		Thread.sleep(2000);
		
		//1st Way - Not recommended (but widely used in industry
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("No of Options = " + birthmonth.size());
		System.out.println(birthmonth.get(7).isEnabled());
		birthmonth.get(7).click();
		
		//2nd Way - Recommend
		WebElement wb = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(wb);
		month.selectByVisibleText("Jan");
		month.selectByValue("12");
		month.selectByIndex(4);
		System.out.println(month.getFirstSelectedOption().getText());
		month.selectByIndex(6);
		
		//3rd Way
		WebElement wb1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month1 = new Select(wb1);
		List<WebElement> dropdown = month1.getOptions();
		for(int i = 0; i < dropdown.size(); i++) {
			String dropdownValues = dropdown.get(i).getText();
			if(dropdownValues.equalsIgnoreCase("Dec")) {
				dropdown.get(i).click();
			}
		}
				
		
		//4th Way
		wb1.sendKeys("Feb");
		
		//5th Way
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
		
		
		//Multiple Value Selection - Checking if the drop down supports multiple value selection
		System.out.println(month1.isMultiple());
		
		month1.selectByIndex(8);
		month1.selectByVisibleText("May");
		month1.selectByValue("1");
		
		//deselect will not excute as the their is no multiple select option here
		month1.deselectByIndex(8);
		month1.deselectByVisibleText("May");
		month1.deselectByValue("1");
		
		
		
				
		
			}

}
