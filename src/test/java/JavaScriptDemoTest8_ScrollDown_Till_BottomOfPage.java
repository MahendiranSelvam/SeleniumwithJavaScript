import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest8_ScrollDown_Till_BottomOfPage {


    @Test
    public void JavaScriptDemoTest8() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome85/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.location = 'http://makeseleniumeasy.com/'");

        // It returns height of view part. We can say it as page height, or height of one page.
        //It is the scroll down height when we click 'page down' button
        Long pageHeight= (Long)js.executeScript("return window.innerHeight");
        System.out.println("Page height: "+pageHeight);

        // It is overall scrollable height.
        // It is the total height we need to scroll to reach to bottom of page.
        Long scrollableHeight = (Long)js.executeScript("return document.body.scrollHeight");
        System.out.println("Total scrollable height: "+scrollableHeight);

        // Finding number of pages. Adding 1 extra to consider decimal part.
        int numberOfPages = (int)(scrollableHeight/pageHeight) + 1 ;

        System.out.println("Total pages: "+numberOfPages);

        //Scrolling page by page
        for(int i =0; i<numberOfPages; i++){

            js.executeScript("window.scrollBy(0,"+pageHeight+")");
            Thread.sleep(2000);
        }

    }



}
