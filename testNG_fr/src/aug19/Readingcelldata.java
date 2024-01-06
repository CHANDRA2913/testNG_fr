package aug19;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingcelldata {

	public static void main(String[] args) throws Throwable {
		// read path file
		FileInputStream fi=new FileInputStream("E:\\Book2.xlsx");
		
		//get work book from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws=wb.getSheet("sheet1");
		//count no of rows in sheet
		int rc=ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		//read specific cell data
		String fname =ws.getRow(3).getCell(0).getStringCellValue();
		String mname =ws.getRow(5).getCell(1).getStringCellValue();
		String lname =ws.getRow(7).getCell(2).getStringCellValue();
		int eid=(int)ws.getRow(9).getCell(3).getNumericCellValue();
		System.out.println(fname+" "+mname+" "+lname+"  "+eid);
		fi.close();
		wb.close();
		
	}

}
