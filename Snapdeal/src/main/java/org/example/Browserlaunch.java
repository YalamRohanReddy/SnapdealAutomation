package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browserlaunch {
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void LaunchBrowser(){
        driver.get("https://snapdeal.com/");
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
