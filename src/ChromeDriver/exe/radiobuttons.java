package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("https://login.salesforce.com/");
        driver.findElementById("username").sendKeys("hello");
        driver.findElementByName("pw").sendKeys("1234");
        driver.findElementByXPath("//*[@id=\'Login\']").click();
        //driver.findElementByCssSelector("#username").sendKeys("hello");//
        System.out.println(driver.findElementByCssSelector("#error").getText());
        
        
        
      
    
		
	}

}
