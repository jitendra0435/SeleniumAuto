import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver() {
        driver.close();
    }
}
