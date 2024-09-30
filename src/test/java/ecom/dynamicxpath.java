package ecom;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicxpath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meritto.com/");
		driver.findElement(By.xpath("//a[@class=\"main-action mega-menu-link\"]")).click();
		Thread.sleep(10000);
		
		String firsthandle = driver.getWindowHandle();
		Set<String> secondhandle = driver.getWindowHandles();
		for (String string : secondhandle) {
			System.out.println("hi232");
			
			if (driver.switchTo().window(string).getCurrentUrl().contains("https://pages.meritto.com/lp/schedule")) {
				System.out.println("hi");
				Thread.sleep(10000);
			List<WebElement>	e1elemnts=driver.findElements(By.tagName("input"));
			System.out.println(e1elemnts);
				
			   driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"i1czu8b\"]")).click();
				
				List<WebElement> elemnts = driver.findElements(By.xpath("//input[@type=\"text\" and @class=\"i1czu8b\"]"));
				System.out.println(elemnts);
				System.out.println("dfdf");
				for (WebElement inputtagelements : elemnts) {
					
					inputtagelements.sendKeys("dsfgbhjk");
					System.out.println("dfdf");
					
				}
			}
		}
		
	
	
	}

}
