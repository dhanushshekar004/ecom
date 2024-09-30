package ecom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bat");
		List<WebElement> impteagname = driver.findElements(By.tagName("img"));
		System.out.println(impteagname);
		
	}

}
