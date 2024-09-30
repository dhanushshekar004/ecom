package ecom;

import java.awt.Desktop.Action;
import java.beans.Visibility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {

	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.getTitle();
		TakesScreenshot ss = (TakesScreenshot)driver;
		File ssss = ss.getScreenshotAs(OutputType.FILE);
		
		File file =new File("dgfhjk");
		
		FileHandler.copy(ssss, file);
	
	Select sdf=new Select(	driver.findElement(By.id("ddd")));
	sdf.selectByIndex(1);
		
	Actions act =new Actions(driver);
	
	act.moveToElement(driver.findElement(By.xpath("dfff")));
	driver.switchTo().alert().accept();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(null))).click();
		
		Select as=new Select(driver.findElement(null));
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
		
	
	for(WebElement link:links) {
		link.getText();
		
	
		
		
	}
	
	
	}
}
