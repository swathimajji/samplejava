package ChromeDriver.exe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();

        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).click();   
        driver.findElement(By.id("email")).sendKeys("H");
        driver.findElement(By.name("pass")).sendKeys("123s");
        driver.findElement(By.linkText("Forgot account?")).click();
		
	}
}	