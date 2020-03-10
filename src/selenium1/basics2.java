
package selenium1;


import org.openqa.selenium.chrome.ChromeDriver;

public class basics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver.exe");
		
		 ChromeDriver driver =new ChromeDriver();
         driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("hello");
		//driver.findElementByXPath("//*[@id=\'globalContainer\']/div[3]/div/div/div").getText();
		
		
		
		
	}

}