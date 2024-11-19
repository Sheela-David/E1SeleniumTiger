package Sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData\\First.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet("Sheet1").getRow(2).getCell(0);
		
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		System.out.println(value);


	
	}

}
