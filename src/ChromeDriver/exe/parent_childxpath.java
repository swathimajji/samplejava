package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class parent_childxpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("https://google.com/");
        
		
	}

}
