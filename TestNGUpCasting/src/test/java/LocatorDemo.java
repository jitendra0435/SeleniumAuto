import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {
    public static  void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","/home/admin265/Downloads/geckodrive/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com");
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
        Login.click();
        driver.close();
    }
}
