package screenshot;

import com.bridgelabz.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots extends Base {

    public void screenshot() throws IOException {
        initialization();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String fileName =  new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss'.png'").format(new Date());
        File destinationFile = new File("Screenshots.png"+fileName);
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}
