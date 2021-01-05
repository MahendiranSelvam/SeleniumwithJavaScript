import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest4_LocateElementAndRetrieveText {


    @Test
    public void JavaScriptDemoTest4_Option1(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.facebook.com/'");

        WebElement LoginButton = driver.findElement(By.name("login"));

        String S = (String) js.executeScript("return arguments[0].innerHTML;",LoginButton);
        System.out.println(S);

        String Text = js.executeScript("return arguments[0].innerHTML;",LoginButton).toString();
        System.out.println(Text);

    }

}






