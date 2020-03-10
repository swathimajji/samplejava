package ChromeDriver.exe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class testcase_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("http://youtube.com");
       // driver.findElementByXPath("//*[@id=search]").sendKeys("wild kratts");
        
        driver.findElementById("search").sendKeys("wild kratts");
        driver.findElementById("search").sendKeys(Keys.ENTER);
        
        
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // String script = "return document.getElementById(\"search\").value;";
       // String text = (String) js.executeScript(script);
       // System.out.println(text);
       // while(!text.equalsIgnoreCase("wild kratts full episodes"));
        {
        	//driver.findElementById("search").sendKeys(Keys.DOWN);
        	
        	//text= (String) js.executeScript(script);
        	//System.out.println(text);//
        }
        	
        
        
        
		
	}

}
