package ecom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class collections {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nabuqa.z30.web.core.windows.net/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-cy=\"Company\"]")).click();

		List<WebElement> ss = driver.findElements(By.xpath("//td[@data-cy=\"test-company\"]//p"));

		List<String> ss12 = new ArrayList<>();

		System.out.println(ss);

		for (WebElement actualname : ss) {
			ss12.add(actualname.getText());

		}

		// Collections.sort(ss12);
		for (String dhanusn : ss12) {
			System.out.println(dhanusn);

		}
		System.out.println("==============");
		List<String> ss13 = new ArrayList<>();

		int a = 0;
		for (String string : ss12) {
			ss13.add(ss12.get(a));
			a++;
		}

		Collections.sort(ss13);

		for (String dhanusdd : ss13) {
			System.out.println(dhanusdd);

		}
		System.out.println("==============");
		for (String dhanusdd : ss12) {
			System.out.println(dhanusdd);

		}

		List<String> pass = new ArrayList<>();

		List<String> fail = new ArrayList<>();

		for (int i = 0; i < ss13.size(); i++) {

			if ((ss13.get(i)).equals(ss12.get(i))) {
				// System.out.println("++++" + ss13.get(i));
				pass.add(ss13.get(i));
			} else {
				System.out.println("****" + ss13.get(i));
				fail.add(ss13.get(i));

			}

		}
		System.out.println(pass);
		System.out.println("=========================");
		System.out.println(fail);
	}
}
