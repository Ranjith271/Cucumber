package Com.adactin.runner;

import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Ranjith\\eclipse-workspace\\CucumberAdactin\\src\\test\\java\\Com\\adactin\\features\\Adactin.feature",
glue = "Com.adactin.stepdefinition")
public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
 public static void setup() {
 	WebDriverManager.chromedriver().setup();
//	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjith\\eclipse-workspace\\CucumberAdactin\\Driver");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
	
}
	@AfterClass
public static void teardown() {
	 driver.close();
}
}
