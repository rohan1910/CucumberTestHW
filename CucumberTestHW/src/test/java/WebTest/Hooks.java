package WebTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void open_browser(){
        browserSelector.browserselector();
//        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//        driver.manage().window().fullscreen();
//        //website where the tests will run on
//        //will run in google chrome browser
//        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public void close_browser(){
        close_Browser();
    }
}
