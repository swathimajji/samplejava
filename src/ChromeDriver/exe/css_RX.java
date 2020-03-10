package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class css_RX {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("https://rediff.com/");
        
        driver.findElementByCssSelector("a[title*='Sign in']").click();
        driver.findElementByXPath("//input[@id='login1']").sendKeys("hello");
        driver.findElementByCssSelector("input[name*='passwd']").sendKeys("bye");
        driver.findElementByXPath("//inputs[contains(@name='proceed'])").click();
        		
        
        
        
        
      
    
		
	}

}
