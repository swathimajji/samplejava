package ChromeDriver.exe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class static_dropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
        ChromeDriver driver =new ChromeDriver();
        
        driver.get("https://spicejet.com/");
       // Label l= new Label(driver.findElementById("divpaxinfo"));//
       // s.selectByValue("2");//
  //      Select sel = new Select(driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
         /* driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']").click();
          driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']").sendKeys("GOI");
          driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT'][2]").sendKeys("HYD");*/
        
        
        System.out.println(driver.findElementById("ctl00_mainContent_chk_SeniorCitizenDiscount").isSelected());
        driver.findElementById("ctl00_mainContent_chk_SeniorCitizenDiscount").click();
        System.out.println(driver.findElementById("ctl00_mainContent_chk_SeniorCitizenDiscount").isSelected());

        
          
       
        
        
        
       
	}

}
