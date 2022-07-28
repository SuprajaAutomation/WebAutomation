package driver;

import base.Test;
import constants.Keys;
import helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {

    //protected AppiumDriver<WebElement> driver;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected DesiredCapabilities capabilities = new DesiredCapabilities();
    public static String Drivertype;
    public static String EnvironmentType;


    public DriverManager() {
        Drivertype = PropertyReader.valueOf("Driver.Drivertype").trim();
        EnvironmentType = PropertyReader.valueOf("Driver.OS").trim();
    }

    //protected abstract void createDriver() throws Exception;

    public WebDriver getDriver() throws Exception {

        if (null == driver) {
            createDriver();

            wait=new WebDriverWait(driver,Integer.parseInt(PropertyReader.valueOf("Driver.Timeout").trim()));
        }
        return driver;
    }

    private WebDriver createDriver() {
        switch (EnvironmentType.toLowerCase()) {
            case "windows":
                 driver = createwindowsDriver();
                break;
            case "mac":
                 driver = createmacDriver();
                break;
        }
        return driver;
    }

    private WebDriver createwindowsDriver() {
        switch (Drivertype) {

            case "FIREFOX" :
                System.setProperty("webdriver.gecko.driver","src/main/java/driver/windows/geckodriver.exe" );
                driver = new FirefoxDriver();
                break;
            case "CHROME" :
                System.setProperty("webdriver.chrome.driver","src/main/java/driver/windows/chromedriver.exe" );
                driver = new ChromeDriver();
                break;
            case "EDGE" :
                System.setProperty("webdriver.edge.driver","src/main/java/driver/windows/msedgedriver.exe" );
                driver = new EdgeDriver();
                break;
        }

        return driver;
    }

    private WebDriver createmacDriver() {

        switch (Drivertype) {

            case "FIREFOX" :

                System.setProperty("webdriver.gecko.driver","src/main/java/driver/mac/geckodriver" );
                driver = new FirefoxDriver();
                break;

            case "CHROME" :
                System.setProperty("webdriver.chrome.driver","src/main/java/driver/mac/chromedriver" );
                driver = new ChromeDriver();
                break;
            case "EDGE" :
                System.setProperty("webdriver.edge.driver","src/main/java/driver/mac/edgedriver" );
                driver = new EdgeDriver();
                break;
            case "SAFARI" :
                driver = new SafariDriver();
                break;

        }
        return driver;
    }


    public WebDriverWait getWait(){
        return wait;
    }
}