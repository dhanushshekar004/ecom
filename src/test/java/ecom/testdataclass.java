package ecom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class testdataclass {
	public static  String credentials() throws EncryptedDocumentException, IOException {
		String filepath = "C:\\Users\\Dhanush S\\Desktop\\new\\ecom\\src\\main\\resources\\datadriven.xlsx";
		File file = new File(filepath);
		FileInputStream IPS = new FileInputStream(file);
		Workbook work = WorkbookFactory.create(IPS);
		String sheetnamea = work.getSheetName(2);//Only here we need to change
		System.out.println(sheetnamea);
		Sheet accesssheet = work.getSheet(sheetnamea);
		String emailID = accesssheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(emailID);
		return emailID;
	}
	public static  String Passwordcredentials() throws EncryptedDocumentException, IOException {
		String filepath = "C:\\Users\\Dhanush S\\Desktop\\new\\ecom\\src\\main\\resources\\datadriven.xlsx";
		File file = new File(filepath);
		FileInputStream IPS = new FileInputStream(file);
		Workbook work = WorkbookFactory.create(IPS);
		String sheetnamea = work.getSheetName(2);//Only here we need to change
		System.out.println(sheetnamea);
		Sheet accesssheet = work.getSheet(sheetnamea);
		//String emailID = accesssheet.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(emailID);
		String Password = accesssheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(Password);
		return Password;
}
}
