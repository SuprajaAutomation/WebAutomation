package actions;

import base.Keywords;
import exceptions.ApplicationException;
import helper.PropertyReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class JSClick extends Keywords {

    private static Logger log = Logger.getLogger(JSClick.class);
    public void elementBy(String locatorKey) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");
        try {
            Keywords.screenshot.attachScreenshot("Click");
            element=get.elementBy(locatorKey);
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            log.info("Click Successful!");
        } catch (StaleElementReferenceException ex) {
            element= driver.findElement(By.xpath(locatorKey));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            // TODO: handle exception
            log.info("Error while clicking the element " + locatorKey);
            throw new ApplicationException(e.getMessage());

        }
    }


}







