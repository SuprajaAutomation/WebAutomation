package actions;

import base.Keywords;
import driver.DriverManager;
import exceptions.ApplicationException;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Type extends Keywords{

    private static Logger log=Logger.getLogger(Type.class);

    DriverManager driverMangerbrowser=new DriverManager();
    String Drivertype=driverMangerbrowser.Drivertype;
    String EnvironmentType=driverMangerbrowser.EnvironmentType;

    public void data(String locatorKey,String value) throws ApplicationException {
        if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
        {
            log.info("Type the value ["+value+"] into element ["+locatorKey+"]");
            get.elementBy(locatorKey).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value ='';", get.elementBy(locatorKey));
            get.elementBy(locatorKey).sendKeys(value);
            log.info("Type Successful!");
        }
        else if(Drivertype.equalsIgnoreCase("chrome") && EnvironmentType.equalsIgnoreCase("mac"))
        {
            log.info("Type the value ["+value+"] into element ["+locatorKey+"]");
            get.elementBy(locatorKey).clear();
            get.elementBy(locatorKey).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value ='';", get.elementBy(locatorKey));
            get.elementBy(locatorKey).sendKeys(value);
            log.info("Type Successful!");
        }
        else{
            log.info("Type the value ["+value+"] into element ["+locatorKey+"]");
            get.elementBy(locatorKey).clear();
            //get.elementBy(locatorKey).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
            get.elementBy(locatorKey).sendKeys(Keys.CONTROL + "a");
            get.elementBy(locatorKey).sendKeys(Keys.DELETE);
            get.elementBy(locatorKey).sendKeys(value);
            // keyboard.hideIOS();
            log.info("Type Successful!");
        }
    }

    public void sensitiveData(String locatorKey,String value) throws ApplicationException {
        log.info("Type the value ["+value.substring(0,2)+"*****] into element ["+locatorKey+"]");
        get.elementBy(locatorKey).sendKeys(value);
       // keyboard.hideIOS();
        log.info("Type Successful!");
    }

    public void data(By locator, String value) throws ApplicationException {
        log.info("Type the value ["+value+"] into element ["+locator+"]");
        get.elementBy(locator).sendKeys(value);
       // keyboard.hideIOS();
        log.info("Type Successful!");
    }

    public void sensitiveData(By locator,String value) throws ApplicationException {
        log.info("Type the value ["+value.substring(0,2)+"*****] into element ["+locator+"]");
        get.elementBy(locator).sendKeys(value);
      //  keyboard.hideIOS();
        log.info("Type Successful!");
    }

    public void data(String locatorKey,String value,boolean hideKeyboard) throws ApplicationException {
        log.info("Type the value ["+value+"] into element ["+locatorKey+"]");
        get.elementBy(locatorKey).sendKeys(value);

        log.info("Type Successful!");
    }

    public void sensitiveData(String locatorKey,String value,boolean hideKeyboard) throws ApplicationException {
        log.info("Type the value ["+value.substring(0,2)+"*****] into element ["+locatorKey+"]");
        get.elementBy(locatorKey).sendKeys(value);

        log.info("Type Successful!");
    }

    public void data(By locator, String value,boolean hideKeyboard) throws ApplicationException {
        log.info("Type the value ["+value+"] into element ["+locator+"]");
        get.elementBy(locator).sendKeys(value);

        log.info("Type Successful!");
    }

    public void sensitiveData(By locator,String value,boolean hideKeyboard) throws ApplicationException {
        log.info("Type the value ["+value.substring(0,2)+"*****] into element ["+locator+"]");
        get.elementBy(locator).sendKeys(value);

        log.info("Type Successful!");
    }

    public void data_safari(String locatorKey,String value) throws ApplicationException {
        log.info("Type the value ["+value+"] into element ["+locatorKey+"]");
        get.elementBy(locatorKey).clear();
        get.elementBy(locatorKey).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        get.elementBy(locatorKey).sendKeys(value);
        // keyboard.hideIOS();
        log.info("Type Successful!");
    }

}