package ecom;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getTextFromCaptcha {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://test-new.payworldindia.com/retailer");
		driver.findElement(By.xpath("//div[contains(text(),'Username & Password')]")).click();
		WebElement captcha=driver.findElement(By.xpath("//img[@id=\"captchaImg\"]"));
	//File sreenshot = driver.findElement(By.xpath("//img[@id=\"captchaImg\"]")).getScreenshotAs(OutputType.FILE);
	
	System.out.println(captcha.getAttribute("src"));
	
	File img=new File("C:\\Users\\Dhanush S\\Desktop\\Raksh.png");
	FileUtils.copyURLToFile(new URL(captcha.getAttribute("src")), img);
	
	//File file =new File("C:\\Users\\Dhanush S\\Desktop\\new\\ecom\\test-output\\screen.png");
	
	//FileHandler.copy(sreenshot, file);
	

      // Set the path to the tessdata directory
      // If you have installed Tesseract at a custom location, specify the path here
     // instance.setDatapath("C:/Program Files/Tesseract-OCR/tessdata");

      // Specify the language if needed
      // instance.setLanguage("eng");

      try {
          // Path to the image file
          File imageFile = new File("path/to/your/image.png");

          // Perform OCR on the image
        //  String result = instance.doOCR(imageFile);

          // Print the extracted text
       //   System.out.println("Extracted Text: \n" + result);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

	}


