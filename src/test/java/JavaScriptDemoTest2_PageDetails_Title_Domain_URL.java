import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest2_PageDetails_Title_Domain_URL {

    @Test
    public void JavaScriptDemoTest2(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'https://www.google.com/'");

        //To get the Title of a page
        //This is similar to driver.getTitle()
        String Title = js.executeScript("return document.title").toString();
        System.out.println(Title);

        //To get the Domain of the page
        String Domain = js.executeScript("return document.domain").toString();
        System.out.println(Domain);

        //To get the URL of current page
        //This is similar to WebDriver command driver.getCurrentUrl()
        String currentURL = js.executeScript("return document.URL").toString();
        System.out.println(currentURL);

        //To get the current status of current page
        String PageIsReady = js.executeScript("return document.readyState").toString();
        System.out.println(PageIsReady);


    }

}
