package ecom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivenScript1 extends Baseclass {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		testdataclass classs =new testdataclass();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ma());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(classs.credentials());
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(classs.Passwordcredentials());
	}
	
	
}
