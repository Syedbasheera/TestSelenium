package MySeleniumPractice.MySeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.se/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A"
				+ "%2F%2Fwww.amazon.se%2Fgp%2Fhelp%2Fcustomer%2Fdisplay.html%3FnodeId%3DG4CY3HAXTSFLGC22%26ref_%"
				+ "3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc"
				+ "_handle=seflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fiden"
				+ "tifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	/*Thread.sleep(3000);
	driver.findElement(By.id("nav-global-location-data-modal-action")).click();
	//Thread.sleep(4000);
	
	//driver.findElement(By.xpath("//[@ class='a-button-input']//[@type='submit']")).click();
	driver.findElement(By.id("GLUXSignInButton")).click(); */
	
	driver.findElement(By.id("ap_email")).sendKeys("syedbasheera786@gmail.com");
	driver.findElement(By.id("continue")).click();
	
driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");

driver.findElement(By.id("signInSubmit")).click();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scroll(0,1000)");



	}

	}

