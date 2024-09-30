package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iiiii {public static void main(String[] args) {
	ChromeOptions o=new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
//	WebDriverManager.chromedriver().setup();
	
	WebDriver d=new ChromeDriver(o);
	d.manage().window().maximize();
	d.get("https://demo.pralapa.com/login");
	d.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
	d.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
}
}
