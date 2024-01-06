package aug19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readandwrite {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("E:/Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rc=ws.getLastRowNum();
		for(int i=1; i<=rc; i++)
		{
			//read specific cell data
			String fname=ws.getRow(i).getCell(0).getStringCellValue();
			String mname=ws.getRow(i).getCell(1).getStringCellValue();
			String lname=ws.getRow(i).getCell(2).getStringCellValue();
			int eid=(int)ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+" "+mname+" "+lname+" "+eid);
			//write as pass into results cell
			ws.getRow(i).createCell(4).setCellValue("pass");
		}
		fi.close();
		FileOutputStream fo=new FileOutputStream("E:/Results.xlsx");
		wb.write(fo);
			fi.close();
			wb.close();
			
		}

	}


