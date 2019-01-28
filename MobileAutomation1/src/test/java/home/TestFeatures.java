package home;

import io.appium.java_client.AppiumDriver;
//import reporting.TestLogger;
import base.MobileAPI;

import org.junit.Test;
import org.junit.runners.JUnit4;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
import pages.MainPage;

public class TestFeatures extends MobileAPI {
	
  //  @Test
    public void home() throws InterruptedException {
//        TestLogger.log("app is launched ...");
        MainPage mainPage = PageFactory.initElements(ad, MainPage.class);
        mainPage.goToArticles();
        System.out.println("TC1 Passed");
    }
}
