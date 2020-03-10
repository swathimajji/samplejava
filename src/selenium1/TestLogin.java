package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver.exe");
        ChromeDriver driver  = new ChromeDriver();
        
             
             driver.get("http://gmail.com");
             
             WebElement username = driver.findElement(By.id("email"));
             username.sendKeys("hello");
             
	}

}
