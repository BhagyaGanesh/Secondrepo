package excelprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstClass {
	static FileInputStream f;//in build class -to get details from excel/file
	static XSSFWorkbook wb;// to get details from workbook
	static XSSFSheet sh;// to get details from sheet
	
	public static String getStringData(int a,int b) throws IOException //a-row, b-cell -- represent
	{
		f=new FileInputStream("C:\\Users\\user\\Desktop\\Automation\\Excelread.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();//to return string value
	}
	
	public static String getFloatData(int a,int b) throws IOException {
		f=new FileInputStream("C:\\Users\\user\\Desktop\\Automation\\Excelread.xlsx");
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float z = (float)c.getNumericCellValue();
		return String.valueOf(z);//typecasting --convert int to string
	}

}
