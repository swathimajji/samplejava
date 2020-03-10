package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(driver.findElementByCssSelector("iframe[class='demo-frame']"));
        driver.findElementById("draggable").click();

	}

}
