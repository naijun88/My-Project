package ExcelMani;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*public class ExcelUnit {
private static XSSFWorkbook ExcelWorkbook;
private static XSSFSheet ExcelSheet;
private static XSSFRow ExcelRow;
private static XSSFCell ExcelCell;
//1. This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method.
public static void setExcel(String pathFile, String sheetName) throws Exception
{
	try{
		//Open the excel file.
		FileInputStream excel = new FileInputStream(pathFile);
		// Access the required test data sheet
		ExcelWorkbook = new XSSFWorkbook(excel);
		ExcelSheet = ExcelWorkbook.getSheet(sheetName);
	}catch(Exception e)
	{
		throw(e);
	}
}

//2. This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
public static String getCellData(int RowNum, int ColNum) throws Exception
{
	try{
		ExcelCell = ExcelSheet.getRow(RowNum).getCell(ColNum);
		String CellData = ExcelCell.getStringCellValue();
		return CellData;		
	}catch(Exception e)
	{
		return "";
	}
}

//3.This method is to write in the Excel cell, Row num and Col num are the parameters
public static void setCellData(String Result, int RowNum, int ColNum) throws Exception
{
	try{
		ExcelRow = ExcelSheet.getRow(RowNum);
		ExcelCell = ExcelRow.getCell(ColNum, ExcelRow.RETURN_BLANK_AS_NULL);
		if(ExcelCell==null)
		{
			ExcelCell = ExcelRow.creatCell(ColNum);
			ExcelCell.setCellValue(Result);
		}
		else
		{
			ExcelCell.setCellVaule(Result);
		}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData+Constant.File_name);
			ExcelWorkbook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e)
		{
			throw(e);
		}
		
	}
}
}*/
