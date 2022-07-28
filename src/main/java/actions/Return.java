package actions;

import exceptions.ApplicationException;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import base.Keywords;
import org.openqa.selenium.By;

public class Return extends Keywords {

    private static Logger log=Logger.getLogger(Return.class);

    public static void clickEnter(String locatorkey) throws ApplicationException
    {
        try{
            get.elementBy(locatorkey).sendKeys(Keys.ENTER);
        }
        catch(NullPointerException e)
        {
            log.warn("Failed to execute Enter key");
    }

    }
}
