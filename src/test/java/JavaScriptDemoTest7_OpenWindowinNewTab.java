import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest7_OpenWindowinNewTab {

    @Test
    public void JavaScriptDemoTest7() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.yahoo.com/'");

        js.executeScript("window.open('https://www.google.com/')");

        String newURL = "https://www.espncricinfo.com/";

        js.executeScript("window.open('"+newURL+"')");

    }

}






