import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptDemoTest11_ShadowDOMElements {

    @Test
    public void LocatingShadowDOMElements() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/Chrome87/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sandbox-sponsors.pointsville.com/");

        Thread.sleep(5000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement userName = (WebElement) jse.executeScript("return document.querySelector('amplify-authenticator > amplify-sign-in').shadowRoot.querySelector('amplify-form-section > amplify-auth-fields').shadowRoot.querySelector('div > amplify-username-field').shadowRoot.querySelector('amplify-form-field').shadowRoot.querySelector('input');");

        String js = "arguments[0].setAttribute('value', 'NaveenAutomationlabs')";

        ((JavascriptExecutor) driver).executeScript(js,userName);
    }

}















