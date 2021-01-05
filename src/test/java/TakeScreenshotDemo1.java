import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotDemo1 {

    WebDriver driver;

    @Test
    public void TakeScreenshotDenoTest1() throws IOException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");
        takeScreenshot("Yahoo Page");

    }

    public void takeScreenshot(String FileName) throws IOException {

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("src/test/java/Screenshots/"+FileName+".jpg"));

    }

}
