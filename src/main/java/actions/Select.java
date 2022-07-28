package actions;

import base.Keywords;
import exceptions.ApplicationException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Select extends Keywords {

    private static Logger log = Logger.getLogger(Select.class);

    public static void backOffice_selectValueInAnyList(String locatorKey, String data) throws ApplicationException {

        try {
            String Datatoselect = data.trim();
            Thread.sleep(1000);
            get.elementBy(locatorKey).click();
            Thread.sleep(1000);
            String Datatoselectxpath = "(" + "//div[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]" + "|" + "(" + "//li[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]" + "|" + "(" + "//a[text()=" + "'" + Datatoselect + "'" + "]" + ")" + "[1]";
            driver.findElement(By.xpath(Datatoselectxpath)).click();
            Thread.sleep(100);
            log.info("Successfully Value selected from Listbox" + locatorKey);
        }
             catch (Exception e1) {
                // TODO Auto-generated catch block
                try {
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_ENTER);
                    log.info("Successfully Value selected from Listbox " + locatorKey);
                } catch (AWTException e2) {
                    e2.printStackTrace();
                }

        }
    }

    public static void SelectValueInAnyList(String locatorKey, String data) throws ApplicationException {
        try{
            String Datatoselect = data.trim();
            if(Datatoselect.equalsIgnoreCase("Filipino"));
            {
                get.elementBy(locatorKey).click();
                driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys("Filipino");
               driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys(Keys.ENTER);
            }
            if(!Datatoselect.equalsIgnoreCase("Filipino"));{
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();",element);
                Thread.sleep(10000);
                String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
                executor.executeScript("arguments[0].click();", driver.findElement(By.xpath(Datatoselectxpath)));
                Thread.sleep(2000);
            }
        }

        catch(Exception e){
            try {
                Thread.sleep(2000);
                String Datatoselect = data.trim();
                String Datatoselectxpath= "("+"//*[text()="+"'"+Datatoselect+"'"+"]"+")"+"[1]";
                Actions action= new Actions(driver);
                action.moveToElement(element).build().perform();
               driver.findElement(By.xpath(Datatoselectxpath)).click();
                Thread.sleep(2000);
            }
            catch (Exception e1) {
            // TODO Auto-generated catch block
                try {

                    Thread.sleep(100);
                    element.click();
                    //TestAttributes.element.sendKeys(TestAttributes.Data.trim());
                    driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys("Filipino");
                   driver.findElement(By.xpath("(//*[@class='ant-select-selection-search-input'])[1]")).sendKeys(Keys.ENTER);
                    log.info("Successfully Value selected from Listbox");
                }
                catch(InterruptedException e2)
                {
                    e2.printStackTrace();
                }
            }
        }
    }

}
