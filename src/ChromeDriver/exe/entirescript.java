package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class entirescript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElementById("username").sendKeys("good");
        driver.findElementByName("pw").sendKeys("bad");
        driver.findElementByXPath("//*[@id='Login']").click();
         System.out.println( driver.findElementByXPath("//*[@id='error']").getText());
        

	}

}
