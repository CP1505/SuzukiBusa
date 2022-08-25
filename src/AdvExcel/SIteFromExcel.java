package AdvExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIteFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
 
	FileInputStream File;
	ArrayList<String> al=new ArrayList<String>();
	
	File=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	int row = WorkbookFactory.create(File).getSheet("Sheet3").getLastRowNum();
	System.out.println(row);

	for(int i=0;i<=row;i++) {
		File=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
		String data=WorkbookFactory.create(File).getSheet("Sheet3").getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);
		al.add(data);
		
	}System.out.println(al.size());
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver(103)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	for(int j=0; j<al.size(); j++) {
		String data = al.get(j);
		driver.get(data);
		
		System.out.println(driver.getTitle());
	
	}
}
}