package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium code
		//create object driver for ChromeDriver
		//x=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver.exe");
        ChromeDriver driver  = new ChromeDriver();
		driver.get("http://www.google.com");//hit url on the browser
		//System.out.println(driver.getTitle());//validate if your page title is correct
		//System.out.println(driver.getCurrentUrl());//validate if your are landed on correct url
		//System.out.println(driver.getPageSource());//print page source
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//it can close current browser.
		//driver.quit();//it can close all browsers.
		
	}

}
