package aug19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readallrowscelldata {

	public static void main(String[] args) throws Throwable {
		// Read path file
		FileInputStream fi=new FileInputStream("E:/Book2.xlsx");
		//get wb from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws=wb.getSheet("Sheet1");
		//count no of rows in sheeet
		int rc=ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		for(int i=1; i<=rc; i++)
		{
		
			//read specific cell data
			String fname=ws.getRow(i).getCell(0).getStringCellValue();
			String mname=ws.getRow(i).getCell(1).getStringCellValue();
			String lname=ws.getRow(i).getCell(2).getStringCellValue();
			int eid=(int)ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+" "+mname+" "+lname+" "+eid);
			fi.close();
			wb.close();
	
		
	
		}
		
	}}
