package ChromeDriver.exe;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElementByCssSelector("#nav-link-accountList")).build().perform();
        a.moveToElement(driver.findElementById("twotabsearchtextbox")).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        		
        
        

	}

}
