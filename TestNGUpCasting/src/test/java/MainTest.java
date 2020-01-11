import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
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
                "test/resources/screenshot/"+date2+"methodFor_CaptureScreenShotOfContent_OfGivenUrl.jpg"));

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
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--disable-notification");
        String webURL="https://www.facebook.com";
        driver.get(webURL);
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("jitendrabacchav9@gmail.com");
        Thread.sleep(2000);
        WebElement Pass = driver.findElement(By.id("pass"));
        Pass.sendKeys("9049jitu");
        Thread.sleep(2000);
        WebElement Login = driver.findElement(By.cssSelector("#loginbutton"));
        Login.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']")).click();
        Thread.sleep(2000);
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
    public void methodFor_NavigatingBetweenUrls() throws InterruptedException {
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

    @Test(description = "Method for identification of webElements full link")
    public void methodFor_WebElementsIdentificationFullLink() throws InterruptedException {
        driver.get("https://www.callicoder.com/");
        WebElement fullLink=driver.findElement(By.linkText("Node.js"));
        fullLink.click();
        Thread.sleep(2000);
    }

    @Test(description = "Method for identification by partial link")
    public void methodFor_WebElementsIdentificationPartialLink() throws InterruptedException {
        driver.get("https://www.callicoder.com/");
        WebElement partialLink=driver.findElement(By.partialLinkText("System"));
        partialLink.click();
        Thread.sleep(2000);
    }

    @Test(description = "Method for handling Alert")
    public void givenMethodFor_HandlingTheAlert() throws InterruptedException {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement login=driver.findElement(By.xpath("//input[@name='proceed']"));
        login.click();
        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText();
        if(alertText.equals("Please enter a valid user name")){
            Thread.sleep(2000);
            System.out.println("Correct alert message");}
        else
            System.out.println("InCorrect alert message");
        alert.accept();
        WebElement id=driver.findElement(By.id("login1"));
        id.sendKeys("jitendrabachhav.2020");
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("Jitu9049@");
        Thread.sleep(2000);
        WebElement login1=driver.findElement(By.xpath("//input[@name='proceed']"));
        login1.click();

    }

    @Test(description = "Method for handling popup")
    public void methodFor_HandlingPopup() throws InterruptedException {
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ft" +
                "ab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement emailId=driver.findElement(By.id("identifierId"));
        emailId.sendKeys("jitendrabachhav0435@gmail.com");
        WebElement next=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
        next.click();
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("9049jitu");
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']"));
        login.click();
        Thread.sleep(5000);
    }
}

