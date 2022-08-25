package MouseAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='_3Il5oO dwRsDN']/div/span"));
		
		for(int i=0;i<links.size();i++) {
			WebElement link = links.get(i);
			Actions action=new Actions(driver);
			action.moveToElement(link).build().perform();
			System.out.println(link.getText());
		}
			
		driver.getTitle();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
