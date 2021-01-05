import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest9_ScrollIntoView_True {

    @Test
    public void JavaScriptDemoTest9() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.covid19india.org/'");

        Thread.sleep(10000);

        //This element is in the middle of the page
        WebElement Keralalink = driver.findElement(By.xpath("//div[text()='Kerala']"));

        //alingToTop option set to 'True'
        js.executeScript("arguments[0].scrollIntoView(true)",Keralalink);

    }

}
