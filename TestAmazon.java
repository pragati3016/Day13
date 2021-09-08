package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazon {
	
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pragati\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseURL);
		
		driver.findElement(By.xpath(".//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath(".//*[@id=\'ap_email\']")).sendKeys("9834255803");
		driver.findElement(By.xpath(".//*[@id=\'continue\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'ap_password\']")).sendKeys("Prag@161099");
		driver.findElement(By.xpath(".//*[@id=\'signInSubmit\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'twotabsearchtextbox\']")).sendKeys("Mobile Phones");
		driver.findElement(By.xpath(".//*[@id=\'nav-search-submit-button\']")).click();
	}
	
	@After
	public void tearDown(){
	}

}
