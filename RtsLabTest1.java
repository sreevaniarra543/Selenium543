package MyPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RtsLabTest1 {

	public static void main(String[] args) {
		//********** Declaring the Web driver object************
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\princ\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//**********Navigating to the site **************
		driver.get("https://www.google.com/");
		
		//***********Search and enter the text ****************
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("RTS Labs");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys(Keys.ENTER);
		
		//***********Clicking the first link in the page **********
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		//driver.findElement(By.linkText("RTS Labs")).click();
		driver.findElement(By.xpath("//div[@class='yuRUbf']/a/h3[1]")).click();
		
	}

}
