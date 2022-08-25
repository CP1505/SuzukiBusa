package AdvExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream File;
	
	File=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	int row = WorkbookFactory.create(File).getSheet("Sheet1").getLastRowNum();
	System.out.println(row);
	
	File=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	int col = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(col);
	
	for(int i=0;i<=row;i++) {
		for(int j=0;j<col;j++) {
			File=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
			String data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();			
			System.out.print(data+"      ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
