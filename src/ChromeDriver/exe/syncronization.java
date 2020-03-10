package ChromeDriver.exe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncronization {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//
        
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        
        driver.findElementById("H-destination").sendKeys("NYC");
        driver.findElementById("H-destination").click();
        driver.findElementById("H-fromDate").sendKeys(Keys.ENTER);
        driver.findElementById("H-searchButtonExt1").click();
        
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//
        WebDriverWait d  = new WebDriverWait(driver,20);
        d.until(ExpectedConditions.elementToBeClickable (ByXPath("//*[@id='4195208']/div[2]/div/a")));
        
        driver.findElementByXPath("//*[@id='4195208']/div[2]/div/a").click();
        
        
        
        
      
    
		
	}

	private static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
