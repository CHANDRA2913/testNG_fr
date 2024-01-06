package aug18;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Controscells {

	public static void main(String[] args)throws Throwable {
		// read path of excel file
		FileInputStream fi=new FileInputStream("E:/Book2.xlsx");
		//get work book from file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws=wb.getSheet("Sheet1");
		// count no of rows from ws
		int rc=ws.getLastRowNum();
		//get first row from sheet
		XSSFRow row=ws.getRow(0);
		//get  no of cells from  first row
		int cc=row.getLastCellNum();
		System.out.println("No of rows::"+rc+" "+" No of cells in row::"+cc);
		fi.close();
		wb.close();
				

	}

}
