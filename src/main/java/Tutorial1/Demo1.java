package Tutorial1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\kadam\\OneDrive\\Desktop\\flange\\Excel data.xlsx");
		System.out.println(f.exists());
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		

		XSSFSheet sheet1 = workbook.getSheetAt(0);

		for (int i = 0; i <= 14; i++) 
		{
			String b = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(b);
		}

//		int a =sheet1.getLastRowNum();
//		System.out.println(a);

	}

}
