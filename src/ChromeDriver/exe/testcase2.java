package ChromeDriver.exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vemail = "H";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\Chrome Driver\\chromedriver.exe");
         ChromeDriver driver =new ChromeDriver();
         System.out.println("email");
        driver.get("http://facebook.com");
 //       System.out.println(driver.findElement(By.name("email")).getText());
        driver.findElement(By.id("email")).click();   
        driver.findElement(By.id("email")).sendKeys("H");
  //      driver.findElement(By.id("email").sendKeys("mysecret");
  //      WebElement email = driver.findElement(By.name("email"));
  //      email.findElements(arg0)
  //      email.sendK(vemail);

        //.sendKeys("Hello");
 //       driver.findElementById("email").sendKeys("Hello");
 //       webe.findElementByName("email").sendKeys("Hello");
//        driver.findElement(By.id("email")).sendKeys("hello");
        
    
		

	}

}
