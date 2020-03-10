package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class redifflogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElementByXPath("//*[@id='login1']").sendKeys("hello");
		driver.findElementByName("passwd").sendKeys("bye");
		
		
	}

}
