import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest5_LocateElementAndClickElement {

    @Test
    public void JavaScriptDemoTest5(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.yahoo.com/'");

        js.executeScript("document.getElementById('header-search-input').value='Sachin Tendulkar';");

        js.executeScript("document.getElementById('header-desktop-search-button').click();");

    }




}
