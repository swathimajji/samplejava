package selenium1;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver.exe");
        ChromeDriver driver  = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        System.out.println(driver.findElementsByTagName("a").size());
        WebElement footerdriver=driver.findElementById("gf-BIG");
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       System.out.println(coloumndriver.findElements(By.tagName("a")).size());
       
      for (int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
    	   
       {
    	     
		String clickonlinktab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		
    	   coloumndriver.findElements(By.tagName("a")).get(i).sendKeys("clickonlinktab");;
    	   Thread.sleep(5000l);
       }
      
             Set<String>abc=driver.getWindowHandles();
             Iterator<String>it=abc.iterator();
             while (it.hasNext());
             {
            	 driver.switchTo().window(it.next());
            	 System.out.println(driver.getTitle());
             }
             
	}

}
