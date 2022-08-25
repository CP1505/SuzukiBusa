package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {

	 FileInputStream File;
	
	 File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
	
	 int rows = WorkbookFactory.create(File).getSheet("Sheet1").getLastRowNum();
   	System.out.println(rows);
	
	 File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
	
   	 int column=WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getLastCellNum();
	 System.out.println(column);
	
	for(int i=0;i<= rows;i++) {
		for(int j=0;j<column;j++) {
			 File = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Site data.xlsx");
			 String jj = WorkbookFactory.create(File).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			 System.out.print(jj+" ");
		}
		System.out.println();
	}
	
	
}

}
