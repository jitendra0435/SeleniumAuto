package com.bridgelabz.test;
import com.bridgelabz.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.Listners.class)

public class LoginPageTest extends Base {

    @BeforeTest
    public void beforeTest() {
        initialization();
    }
    @Test
    public void loginTestWith_ValidCredentials() throws InterruptedException {
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("jitendrabacchav9@gmail.com");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("9049jitu");
        WebElement login=driver.findElement(By.xpath("//label[@id='loginbutton']"));
        login.click();
        Thread.sleep(2000);
    }

    @Test
    public void loginTestWith_InvalidCredentials() throws InterruptedException {
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("jitendrabacchav9@gmail.com");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("9049");
        WebElement login=driver.findElement(By.xpath("//label[@id='loginbutton']"));
        login.click();
        Thread.sleep(2000);
    }
}
