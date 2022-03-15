package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	String sTestCaseName;
	public static Map<String,String> map;

	public ArrayList<String> readExcel(String path,String Sheetname) throws IOException 
	{
		ArrayList<String> testcasename = new ArrayList<String>();

		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sh = workbook.getSheet(Sheetname);
		int strrow = sh.getLastRowNum();
		int strcol = sh.getRow(0).getLastCellNum();

		for (int i=0;i<=strrow-1;i++)
		{
			String executable =sh.getRow(i+1).getCell(0).toString();

			if (executable.equalsIgnoreCase("ON")) {

				sTestCaseName=sh.getRow(i+1).getCell(1).toString();

				testcasename.add(sTestCaseName);
			}
		}

		System.out.println("test cases name: " +testcasename);
		return testcasename;
	}


	//to retrieve row number 	


	public int ExcelRowNum(String path,String Sheetname, String TestCaseName) throws IOException 
	{

		int strRowNum =0;
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sh = workbook.getSheet(Sheetname);
		int strrow = sh.getLastRowNum();
		int strcol = sh.getRow(0).getLastCellNum();

		for (int i=1;i<=strrow-1;i++)
		{

			String TCName = sh.getRow(i).getCell(1).toString();
			if (TCName.equalsIgnoreCase("TestCaseName")) 
			{
				System.out.println("Row Number is: " +i);
				strRowNum = i;

			}

		}
		System.out.println("row number oputside fucntion" + strRowNum);
		return strRowNum;			
	}

	//retrieve test data based on row number

	public HashMap<String, String> ReadExcelData(String path,String Sheetname, int RowNum) throws IOException 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sh = workbook.getSheet(Sheetname);
		map.put("username",sh.getRow(RowNum).getCell(2).toString());
		map.put("password",sh.getRow(RowNum).getCell(3).toString());
		return map;
	}









}
