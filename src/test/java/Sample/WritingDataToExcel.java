package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\excel working\\MultiData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Leads");
		sh.createRow(4).createCell(0).setCellValue("chocolate");
		FileOutputStream fos = new FileOutputStream("D:\\excel working\\MultiData.xlsx");
		wb.write(fos);
		
	}

}
