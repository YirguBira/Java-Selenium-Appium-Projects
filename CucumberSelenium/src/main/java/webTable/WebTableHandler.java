package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandler {
	
	public static void main(String[] args) {
		
		//Instantiate driver
		System.setProperty("webdriver.chrome.driver", "/Users/eclipse-workspace/Projects/CucumberSelenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// Capture object properties
		
		String strCompany;
		String strContact; 
		String strCountry;
		
		String xpath1 = "//*[@id='customers']/tbody/tr[";
		String xpath2 = "2";
		String xpath3 = "]/td[1]";
		
		
		for (int i = 2; i<8; i++) {
			strCompany = xpath1 + i + xpath3;
			String CompanyName = driver.findElement(By.xpath(strCompany)).getText();	
			System.out.println(CompanyName);

			}
		
		String xpathContact1 = "//*[@id='customers']/tbody/tr[";
		String xpathContact2 = "2";
		String xpathContact3 = "]/td[2]";
		
		for (int i = 2; i<8; i++) {
			strContact = xpathContact1 + i + xpathContact3;
			String ContactName = driver.findElement(By.xpath(strContact)).getText();	
			System.out.println(ContactName);
			}
		
		String xpathCountry1 = "//*[@id='customers']/tbody/tr[";
		String xpathCountry12 = "2";
		String xpathCountry3 = "]/td[3]";
		
		for (int i = 2; i<8; i++) {
			strCountry = xpathCountry1 + i + xpathCountry3;
			String CountryName = driver.findElement(By.xpath(strCountry)).getText();	
			System.out.println(CountryName);
			}
		
		driver.quit();
	}

}
