package base;

import actions.*;
import driver.DriverManager;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
//import io.appium.java_client.AppiumDriver;
import helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords {

    private static Logger log=Logger.getLogger(Keywords.class);

    public static WebDriver driver;
    public static WebElement element;
    public static Wait wait;
    public static WebDriverWait webDriverWait;
   // public static XPathManager xpathOf=new XPathManager();
    public static Get get=new Get();
    public static Click click=new Click();
    public static JSClick jsClick = new JSClick();
    public static Verify verify=new Verify();
    public static Type type=new Type();
    public static Screenshot screenshot=new Screenshot();
    public static Select select = new Select();
    public static Return aReturn = new Return();


    public static void launchApplication() throws EnvironmentException
    {
        DriverManager webDriverManager = new DriverManager();
            try{
                driver=webDriverManager.getDriver();
                webDriverWait=webDriverManager.getWait();
                driver.get(PropertyReader.valueOf("Driver.Applicationurl").trim());
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
            }
            catch (Throwable ex){
                throw new EnvironmentException("Driver failed to launch \n"+ex);
            }
        }

    public static void quitDriver(){
        driver.quit();
    }

    public void goBack() throws ApplicationException{
        driver.navigate().back();

    }

    public static void refreshPage() throws ApplicationException{
        //Swipe.swipe.swipeVertical(2,0.8,0.2,5);
        //Swipe.swipe.swipeVertical(2,0.2,0.8,5);
       // Touch.touchLongPress(0,0,250,1000);
        driver.getPageSource();
    }
}