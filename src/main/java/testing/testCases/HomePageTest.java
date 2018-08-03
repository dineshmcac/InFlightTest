package testing.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.testng.Assert;
import org.testng.Reporter;
import testing.pageObject.HomePagePO;
import testing.wrapperClass.TestProperty;
import testing.wrapperClass.WebBase;

@RestController
public class HomePageTest {
	
	WebBase web;
	
	
	
	
		public void tc() throws InterruptedException {
		String url = "https://www.amazon.in/";
		web.driver.get(url);
		HomePagePO home =new HomePagePO(web.driver);
		boolean flag =  home.searchBook();
		
		if(flag)
			Reporter.log("Book List Printed as Expected - TC Passed");
		else {
			Reporter.log("Book List Printed as Expected - TC Failed");
			Assert.fail();
		}
			
	}
	
	@PostMapping("/testing")
	public String check(@RequestBody String id) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", TestProperty.readTestProperites("chromedriverLocation"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		return null;
		
		
		
	}
}
