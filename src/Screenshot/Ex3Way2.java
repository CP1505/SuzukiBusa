package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3Way2 {
public static void main(String[] args) throws InterruptedException, IOException {

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.airtel.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	Date  D=new Date();
  
    String FileName = D.toString().replace(" ","_").replace(":","_")+".png";

	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//FileUtils.copyFile(Source, new File("C:\\Users\\hp\\OneDrive\\Pictures\\Mock_A\\Airtail_"+FileName));
	
	File Destination = new File("C:\\Users\\hp\\OneDrive\\Pictures\\Mock_A\\Airtail_"+FileName);
	
	FileUtils.copyFile(Source, Destination);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
