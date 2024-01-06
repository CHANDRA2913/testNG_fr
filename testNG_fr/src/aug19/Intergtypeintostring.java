package aug19;

import java.io.FileInputStream;

import javax.xml.crypto.Data;

import org.apache.poi.hssf.record.WSBoolRecord;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Intergtypeintostring {

	
	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("E:/Book2.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rc=ws.getLastRowNum();
		for(int i=1; i<=rc; i++)
		{
			if(wb.getSheet("sheet1").getRow(i).getCell(3).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				//read integertype cell
				int cellData=(int)wb.getSheet("sheet1").getRow(i).getCell(3).getNumericCellValue();
				//convert int to string type
				String  eid=String.valueOf(cellData);
				System.out.println(eid);
				
				
			}}
		
		
	}}


