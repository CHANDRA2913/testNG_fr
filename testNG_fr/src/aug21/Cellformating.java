  package aug21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.NumberFormat.Style;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Cellformating {
	public static void main(String[] args) throws Throwable {
		
	
FileInputStream fi=new FileInputStream("E:/Book2.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fi);
XSSFSheet ws=wb.getSheet("sheet1");
int rc=ws.getLastRowNum();
 for(int i=1; i<=rc; i++)
{
//write status into results cell
//ws.getRow(i).createCell(4).setCellValue("pass");
 //ws.getRow(i).createCell(4).setCellValue("fail");
ws.getRow(i).createCell(4).setCellValue("Blocked");
XSSFCellStyle styel=wb.createCellStyle();
XSSFFont font=wb.createFont();
//colour font green
//font.setColor(IndexedColors.GREEN.getIndex());
//font.setColor(IndexedColors.RED.getIndex());
font.setColor(IndexedColors.BLUE.getIndex());
font.setBold(true);
font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
styel.setFont(font);
ws.getRow(i).getCell(4).setCellStyle(styel);
}
	

fi.close();
FileOutputStream fo=new FileOutputStream("E:/Book2.xlsx");
wb.write(fo);
fo.close();

}}



