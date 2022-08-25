package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {
	public static WebDriver driver;
	
	public static void getscreenshot() throws IOException {
		
		Date d=new Date();
		String Filename = d.toString().replace(" ","_").replace(":","_")+".png";
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\hp\\OneDrive\\Pictures\\Mock_A\\jio"+Filename);
		
		FileUtils.copyFile(Source, Destination);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver(103)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jio.com/");
		
		driver.manage().window().maximize();
		getscreenshot();
		
		driver.navigate().to("https://www.airtel.in/");
		getscreenshot();
	}

	
	
	
	
	
	
	
}
