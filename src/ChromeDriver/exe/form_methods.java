package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class form_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println("before clicking on multy trip radio button");
       System.out.println( driver.findElementByXPath("//input[@id='hp-widget__return']").isDisplayed());
       driver.findElementByXPath("//*[@id=\"multicity\"]/label").click();
       System.out.println( driver.findElementByXPath("//input[@id='hp-widget__return']").isDisplayed());
        
        

	}

}
