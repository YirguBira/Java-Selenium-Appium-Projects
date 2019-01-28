//package step_definitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//
//import baseScript.CommonAPI;
//import cucumber.api.java.BeforeStep;
//
//public class Operations extends CommonAPI{
//
//	WebDriver driver;
////	String url = "";
//
//	
//	public WebDriver getDriver2(WebDriver driver) {
//		this.driver = driver;
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//		return driver;
//	}
//	
////	@FindBy(linkText = "Sign In")
////    public WebElement loginButton;
////	public WebElement getLoginButton() {
////        return loginButton;
////    }
////
////    public void setLoginButton(WebElement loginButton) {
////        this.loginButton = loginButton;
////    }
////
////    public void clickOnLogInButton(){
////        getLoginButton().click();
////    }
////	public void logInOuter() {
////		clickOnLogInButton();
////	}
//	
//	public WebDriver getDriver(WebDriver driver) {
//		this.driver = driver;
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("https://www.netflix.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
////        
//		return driver;
//	}
//	
//	public void getDriver() {
//		//this.driver = driver;
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
////		driver.get(url);
////		driver.navigate().to(url);
//	}
//	
//	public void signIn() {
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        driver.get("https://www.netflix.com");
//        driver.manage().window().maximize();
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.quit();
//	}
//	
//	
//	public void operateOnElements() {
//
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        driver.get("https://www.netflix.com");
//        driver.manage().window().maximize();
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.cssSelector("#id_userLoginId")).sendKeys("testa6215@gmail.com");
//		//driver.findElement(By.cssSelector("#id_password")).sendKeys("id_password");
//		driver.quit();
//	
////	driver.quit();
//	}
//	
//	public void enterPassword() {
//
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        driver.get("https://www.netflix.com");
//        driver.manage().window().maximize();
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("#id_userLoginId")).sendKeys("testa6215@gmail.com");
//		driver.findElement(By.id("#id_password")).sendKeys("id_password");
//		driver.quit();
//	
////	driver.quit();
//	}
//	
//	public void clickOnSignInButton() {
//
//		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        driver.get("https://www.netflix.com");
//        driver.manage().window().maximize();
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.cssSelector("#id_userLoginId")).sendKeys("testa6215@gmail.com");
//		driver.findElement(By.cssSelector("#id_password")).sendKeys("id_password");
//		driver.findElement(By.cssSelector("#appMountPoint > div > div.login-body > div > div > div.hybrid-login-form-main > form > button")).click();
//		driver.quit();
//	
////	driver.quit();
//	}
//	
//	public void clickOnSignIn() {
////	System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
////	driver = new ChromeDriver();
////	driver.findElement(By.cssSelector(".btn login-button btn-submit btn-small")).click();
////	driver.quit();
//		
//	}
//	
//}
