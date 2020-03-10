package selenium1;

import java.io.File;
//import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;



//import org.apache.commons.io.*;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver.exe");
        ChromeDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com/");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\swath\\Documents\\test.png"));
	
	
	}

}