package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Base {
    public WebDriver driver;

    public void initialization(){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void closeDriver() {
        driver.close();
    }
}
