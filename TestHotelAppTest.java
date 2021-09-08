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
import org.openqa.selenium.support.ui.Select;

public class TestHotelAppTest {
	
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pragati\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://adactinhotelapp.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		
		driver.get(baseURL);
		
		//Login Page
		driver.findElement(By.id("username")).sendKeys("Pragati3016");
		driver.findElement(By.id("password")).sendKeys("49E9BZ");
		driver.findElement(By.id("login")).click();
				
		//Search Page
		Select loc = new Select(driver.findElement(By.id("location")));
		loc.selectByIndex(6);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loc.selectByVisibleText("Sydney");
				
		Select hotel = new Select(driver.findElement(By.id("hotels")));
		hotel.selectByIndex(2);
				
		Select room_t = new Select(driver.findElement(By.id("room_type")));
		room_t.selectByIndex(4);
				
		Select room_n = new Select(driver.findElement(By.id("room_nos")));
		room_n.selectByIndex(2);
				
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("16/10/2021");
				
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("18/10/2021");
				
		Select room_adult = new Select(driver.findElement(By.id("adult_room")));
		room_adult.selectByIndex(1);
				
		Select room_child = new Select(driver.findElement(By.id("child_room")));
		room_child.selectByIndex(1);
				
		driver.findElement(By.id("Submit")).click();
				
		//Select Hotel Page
		driver.findElement(By.id("radiobutton_0")).click();
				
		driver.findElement(By.id("continue")).click();
				
		driver.findElement(By.id("first_name")).sendKeys("Pragati");
				
		driver.findElement(By.id("last_name")).sendKeys("Patil");
				
		driver.findElement(By.id("address")).sendKeys("Jamner Dist. Jalgaon");
				
		driver.findElement(By.id("cc_num")).sendKeys("1234567891012345");
				
		Select cc_type = new Select(driver.findElement(By.id("cc_type")));
		cc_type.selectByIndex(2);
				
		Select cc_month = new Select(driver.findElement(By.id("cc_exp_month")));
		cc_month.selectByIndex(10);
				
		Select cc_year = new Select(driver.findElement(By.id("cc_exp_year")));
		cc_year.selectByIndex(12);
				
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
				
		driver.findElement(By.id("book_now")).click();
				
		//Booking Confirmation
		driver.findElement(By.id("my_itinerary")).click();
				
	}
	
	@After
	public void tearDown() {
	}

}
