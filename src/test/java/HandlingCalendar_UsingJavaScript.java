import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingCalendar_UsingJavaScript {

    WebDriver driver;

    @Test
    public void HandlingCalendar_UsingJavaScriptTest(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.expedia.com/Flights");

        String DepartDate = "2020-12-21";
        WebElement DepartDateField = driver.findElement(By.id("d1"));

        SelectDatebyJavaScript(driver, DepartDateField,DepartDate);


    }

    public void SelectDatebyJavaScript(WebDriver driver, WebElement element, String DateVal){

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','"+DateVal+"');",element);






    }


}
