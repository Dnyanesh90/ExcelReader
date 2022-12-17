package Tutorial1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\kadam\\OneDrive\\Desktop\\flange\\Excel data.xlsx");
		//System.out.println(f.exists());
		FileInputStream fis =new FileInputStream(f);
		XSSFWorkbook Workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet1 =Workbook.getSheetAt(1);
		
        String fname =sheet1.getRow(0).getCell(0).getStringCellValue();
        String lname =sheet1.getRow(0).getCell(1).getStringCellValue();
        String mobNo =sheet1.getRow(0).getCell(2).getStringCellValue();
        String pass =sheet1.getRow(0).getCell(3).getStringCellValue();
        
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(mobNo);
        System.out.println(pass);
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.name("firstname")).sendKeys("fname");
        driver.findElement(By.name("lastname")).sendKeys("lname");
        driver.findElement(By.name("reg_email__")).sendKeys("mobNo");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass");
        
	}

}
