//package step_definitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestClick {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//	//	Operations operations = new Operations();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//       // driver.get("http://www.pheaa.org/");
//        driver.manage().window().maximize();
//		//operations.getDriver(driver, "http://www.pheaa.org/");
//		//operations.signIn();
//		driver.findElement(By.className("signIn")).click();
//	}
//	
//
//	
//}
//
