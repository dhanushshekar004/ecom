package ecom;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class MobileScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setPlatform(Platform.ANDROID);
		//dc.setCapability(MobileCapabilityType.NO_RESET, true);
		//dc.setCapability("appPackage", "com.gamma.scan");
		//dc.setCapability("appActivity", "com.gamma.barcodeapp.ui.BarcodeCaptureActivity");
		dc.setCapability("appPackage", "com.payworld.phoneapp");
		dc.setCapability(MobileCapabilityType.NO_RESET,"true");
		dc.setCapability("NoReset", "true");
		dc.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,"true");
		dc.setCapability("appActivity", "com.payworld.phoneapp.MainActivity");
		/*  */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhanush S\\AppData\\Roaming\\fire-flink-client\\localnode\\chromedriver.exe");
		WebDriver wdriver = new ChromeDriver();
		wdriver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(wdriver, Duration.ofSeconds(40));
		wdriver.get("https://test-new.payworldindia.com/retailer");
		System.out.println("Started");
		wdriver.findElement(By.xpath("//div[contains(text(),'Scan QR code')]")).click();
		WebElement img1 = wdriver.findElement(By.id("imagehtml"));
		Thread.sleep(3000);
		TakesScreenshot im=(TakesScreenshot)wdriver.findElement(By.xpath("//div[contains(@class,'modal-content qr-modal-container')]"));
		File captchaimage = im.getScreenshotAs(OutputType.FILE);
	File file=new File("C:\\Users\\Dhanush S\\AppData\\Local\\Android\\Sdk\\emulator\\resources\\custom.png");
    FileHandler.copy(captchaimage, file);
	

		String url = img1.getAttribute("src");
		System.out.println("URL is "+url);
		String base64String =url;
        String[] strings = base64String.split(",");
        System.out.println(strings.length);
      //  byte[] image = Base64.getDecoder().decode(strings[1].trim());
     //   BufferedImage img = ImageIO.read(new ByteArrayInputStream(image));
        
        
	//	C:\Users\Dhanush S\AppData\Local\Android\Sdk\emulator\resources
	//	File pngFile = new File("C:\\Users\\Dhanush S\\AppData\\Local\\Android\\Sdk\\emulator\\resources\\custom.png");
	//	ImageIO.write(img, "png", pngFile);
		Thread.sleep(2000);
		//wdriver.findElement(By.xpath("//android.view.View[@content-desc=\"v 5.50.94\"]/following-sibling::android.view.View[1]")).click();
		AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4725/wd/hub"), dc);
	//	driver.openNotifications();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.fingerPrint(2); 
	       driver.findElement(By.xpath("//android.view.View[@content-desc=\"v 5.50.94\"]/following-sibling::android.view.View[1]")).click();
	}
	 
}
