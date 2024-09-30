package ecom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	
	public static void main(String[] args) {
		
//		int a[]= {1,2,14,15,8,9,1,2};
//		
//	//	s	ArrayList<Integer> list=new ArrayList<>();
//		
//		for (int i = 0; i < a.length; i++) {
//		
//		for (int j = i+1; j < a.length; j++) {
//			if (a[i]==a[j]) {
//				
//				
//				System.out.println(a[i]);
//				
//				
//			}
//		}
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		}}