import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest1_PageNavigation {

    @Test
    public void JavaScriptDemoTest1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.yahoo.com/";

        JavascriptExecutor js= (JavascriptExecutor)driver;

        //The url is parameterized. This is similar to driver.get("https://www.bbc.com/");

        js.executeScript("window.location = '"+url+"'");

        //Without parameterizing the url

        js.executeScript("window.location = 'https://www.bbc.com/'");

        //To navigate back (-1) --> back   This is similar to driver.navigate().back();
        //NOTE:- Sometimes, this might not work for Chrome browser

        js.executeScript("window.history.go(-1)");
        Thread.sleep(10000);

        //To go forward Forward(1)--> front. This is similar to driver.navigate().forward();
        //NOTE:- Sometimes, this might not work for Chrome browser
        js.executeScript("window.history.forward(1)");
        Thread.sleep(10000);


        //Refresh the page  This is similar to driver.navigate().refresh();
        js.executeScript("history.go(0);");


    }

}


