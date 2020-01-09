import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MainTest extends BaseTest {

    @Test(description = "Test to Capture the screenshots")
    public void methodFor_CaptureScreenShotOfContent_OfGivenUrl() throws IOException {
        Date d = new Date();
        String date1 = d.toString();
        System.out.println(date1);
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        driver.get("https://scotch.io/tutorials/test-a-node-restful-api-with-mocha-and-chai");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("/home/admin265/IdeaProjects/TestNGUpCasting/src/" +
                "test/resources/screenshot/image4.jpg"));

    }

    @Test(description = "Method of WebDriver interface")
    public void method_ForExploringMethodsOf_WebDriverInterface() {
        String webURL="https://www.google.com";
        driver.get(webURL);
        String title=driver.getTitle();
        System.out.println("Title of this page : "+title);
        String currUrl=driver.getCurrentUrl();
        System.out.println(currUrl);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
    }

    @Test(description = "Method for Identification of webElements")
    public void method_ForIdentificationOfWebElements_UsingLocators() throws InterruptedException {
        String webURL="https://www.facebook.com";
        driver.get(webURL);
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("jitendraB@gmail.com");
        Thread.sleep(2000);
        WebElement Pass = driver.findElement(By.id("pass"));
        Pass.sendKeys("123abcd");
        Thread.sleep(2000);
        WebElement gender=  driver.findElement(By.name("sex"));
        gender.click();
        Thread.sleep(3000);
        WebElement Login = driver.findElement(By.id("loginbutton"));
        Thread.sleep(3000);
        WebElement xPath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        xPath.click();
        Thread.sleep(3000);
        Login.click();

    }

    @Test(description = "Method for Handle mouse and keyboard operation")
    public void methodFor_HandlingKeyboardMouseOperations() throws AWTException, InterruptedException {
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com/search?q=twitter+login&oq=twitter+login&aqs=chrome." +
                ".69i57j0l5.10255j0j7&sourceid=chrome&ie=UTF-8");

        Robot robot=new Robot();
        robot.mouseMove(200,600);
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_W);

        robot.mouseMove(500,400);
        robot.keyPress(KeyEvent.VK_K);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_K);
    }

    @Test(description = "Method for navigation between urls")
    public void MethodFor_NavigatingBetweenUrls() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com/search?q=twitter+login&oq=twitter+login&aqs=chrome." +
                ".69i57j0l5.10255j0j7&sourceid=chrome&ie=UTF-8");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
    }
}

