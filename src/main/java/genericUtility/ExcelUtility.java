package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public void getMultipleDataFromExcel(String sheetName, int startRowIndex, int startCellIndex) throws Exception {

		FileInputStream fis = new FileInputStream(IPathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		System.out.println(sh.getLastRowNum());
		DataFormatter df = new DataFormatter();
		for (int i = startRowIndex; i<=sh.getLastRowNum(); i++) {
			Row r = sh.getRow(i);
			for(int j = startCellIndex ; j<r.getLastCellNum();j++) {
				Cell c= r.getCell(j);
				String value = df.formatCellValue(c);
				System.out.println(value);
			}

		}

	}
	
	public void WritingDataToExcel(String sheetName, int rowIndex, int cellIndex, String value) throws Exception {
		
		FileInputStream fis = new FileInputStream(IPathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		sh.createRow(rowIndex).createCell(cellIndex).setCellValue(value);
		sh.getRow(rowIndex).createCell(cellIndex).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathConstant.excelPath);
		wb.write(fos);
	}

	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception, Exception {
		FileInputStream fis = new FileInputStream(IPathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(c);
		return value;
	}
}


	
