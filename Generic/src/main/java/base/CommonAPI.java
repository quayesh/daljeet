package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;


public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"platform", "url", "browser"})
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, @Optional("chrome") String browser) {

        System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/driver/chromedriver12");
        driver  = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    @AfterMethod
    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    public void sleepFor(int Seconds) {
        try {
            Thread.sleep(Seconds * 1000);
        } catch (Exception e) {
        }}
    public static WebDriver handleNewTab(WebDriver driver) {
        String oldTab = driver.getWindowHandle();
        List<String> newTabs = new ArrayList<String>(driver.getWindowHandles());
        newTabs.remove(oldTab);
        driver.switchTo().window(newTabs.get(0));
        return driver;
    }


}




