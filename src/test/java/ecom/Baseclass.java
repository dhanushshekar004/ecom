package ecom;




import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
    
	
	

	public static String ma() throws EncryptedDocumentException, IOException {
	//	WebDriver driver=new ChromeDriver();		
	String	filepath="C:\\Users\\Dhanush S\\Desktop\\new\\ecom\\src\\main\\resources\\datadriven.xlsx";
	File file=new File(filepath);
	FileInputStream IPS=new FileInputStream(file);
	Workbook work=WorkbookFactory.create(IPS);
	//Sheet sheetname=work.getSheet("Dhanush");
     String sheetnamea = work.getSheetName(0);
	System.out.println(sheetnamea);
	Sheet accesssheet = work.getSheet(sheetnamea);
	String cellvalueURL= accesssheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println(cellvalueURL);
	return cellvalueURL;
	
	}

}
