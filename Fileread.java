package MySeleniumPractice.MySeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class Fileread {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

	Properties prop= new Properties();//Created object for properties class.
	FileInputStream FI = new FileInputStream("C:\\Selenium\\MySeleniumPractice\\src\\main\\java\\config.properties");
	
	prop.load(FI);
	
	String BrowserName=prop.getProperty("browser");
	
	System.out.println(prop.getProperty("browser"));
	
	if(BrowserName.equals(BrowserName))
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\Chromedriver.exe");
		driver=new ChromeDriver();
	  } 
	else if(BrowserName.equals("FF")) 
	  {
		driver=new FirefoxDriver();
	  }
	else if(BrowserName.equals("IE")) 
	  {
		driver=new InternetExplorerDriver();
	  }
	else if(BrowserName.equals("Safari")) 
	  {
		driver=new SafariDriver();
	  }
		else{
		System.out.println("Browser name is not matched in properties file");
	  
	   }
	
	
	
	driver.get(prop.getProperty("Url"));
		
	driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("UserName"));
	driver.findElement(By.id("continue")).click();
	
driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("Password"));

driver.findElement(By.id("signInSubmit")).click();
	}
	}



