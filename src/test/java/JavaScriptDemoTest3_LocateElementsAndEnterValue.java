import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest3_LocateElementsAndEnterValue {

    @Test
    public void JavaScriptDemoTest3(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.yahoo.com/'");

        js.executeScript("document.getElementById('header-search-input').value='Sachin';");

    }

    @Test
    public void JavaScriptDemoTest3_Option2(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.yahoo.com/'");

        String IDofTextBox = "header-search-input";
        String SearchText = "Tendulkar";

        js.executeScript("document.getElementById('"+IDofTextBox+"').value=\'"+SearchText+"\';");

    }

    @Test
    public void JavaScriptDemoTest3_Option3(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.yahoo.com/'");

        WebElement TextBox = driver.findElement(By.id("header-search-input"));

        js.executeScript("arguments[0].value='Sachin Tendulkar';",TextBox);

    }



}






