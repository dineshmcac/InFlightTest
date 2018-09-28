package testing.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.testng.Assert;
import org.testng.Reporter;

import testing.wrapperClass.TestProperty;

@RestController
public class HomePageTest {
	
	@PostMapping("/testing")
	public String check(@RequestParam String id) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", TestProperty.readTestProperites("chromedriverLocation"));
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		String suceess = "Inflight test is complete for ";
		System.out.println(suceess +id);
		return suceess +id;
		
		
		
	}
}
