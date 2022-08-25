package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2Way2 {
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.jio.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	//time
	Date D = new Date();
	System.out.println(D);
	
	String Filename = D.toString().replace(" ","_").replace(":","_")+".png";
	System.out.println(Filename);
	
	//Takeing screenshot
	
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("C:\\Users\\hp\\OneDrive\\Pictures\\Mock_A\\Jio_ "+Filename));
	
	
	
	
	
	
	
	
	
}
}
