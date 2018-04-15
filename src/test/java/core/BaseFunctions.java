package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by qa on 4/15/2018.
 */
public class BaseFunctions {

    WebDriver driver;
    private static final String FIREFOX_DRIVER_LOCATION = "C:/chromedriver/chromedriver.exe";

    public BaseFunctions() {
        System.setProperty("webdriver.chrome.driver", FIREFOX_DRIVER_LOCATION);
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
