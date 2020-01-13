import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {

    @Test(description = "Check facebook login correctly or not")
    public void methodFor_LoginCorrectlyOrNot() throws InterruptedException {
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

    }

    @Test(description = "check if login by invalid credentials or not")
    public void methodFor_LoginByIncorrectCredentials() throws InterruptedException {
        String webURL="https://www.facebook.com";
        driver.get(webURL);
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("jitendrabacchav9@gmail.com");
        Thread.sleep(2000);
        WebElement Pass = driver.findElement(By.id("pass"));
        Pass.sendKeys("90");
        Thread.sleep(2000);
        WebElement Login = driver.findElement(By.cssSelector("#loginbutton"));
        Login.click();
        Thread.sleep(2000);
    }

    @Test()
    public void methodFor_ForgotPasswordWorksOrNot() throws InterruptedException {
        String webURL="https://www.facebook.com";
        driver.get(webURL);
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("jitendrabacchav9@gmail.com");
        Thread.sleep(2000);
        WebElement Login = driver.findElement(By.cssSelector("#loginbutton"));
        Login.click();
        Thread.sleep(2000);
    }
}
