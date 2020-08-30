package JavaActivityDay4;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity_4_3 {


	private static String FILE_NAME = "resources/TestSheet.xlsx";
	
	static Object[][] datatypes = {
		    {"Datatype", "Type", "Size(in bytes)"},
		    {"int", "Primitive", 2},
		    {"float", "Primitive", 4},
		    {"double", "Primitive", 8},
		    {"char", "Primitive", 1},
		    {"String", "Non-Primitive", "No fixed size"}
		};
	
	public static void main(String args[]) throws IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
		
		int row=0;
		
		System.out.println("Entering data into excel sheet");
		for(Object[] datatype:datatypes)
		{
			Row row_no=sheet.createRow(row++); 
			
			int column=0;
			for(Object value:datatype)
			{
				Cell cell=row_no.createCell(column++);
				if(value instanceof String)
				{
					System.out.println("Entering data into cell");
					cell.setCellValue((String) value);
				}
				else if(value instanceof Integer)
				{
					System.out.println("Entering data into cell");
					cell.setCellValue((Integer) value);
				}
			}
		}
		
		FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		workbook.write(outputStream);
		
	
	}
}
