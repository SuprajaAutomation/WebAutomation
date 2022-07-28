package actions;

import base.Keywords;
import driver.DriverManager;
import exceptions.ApplicationException;
import helper.PropertyReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Click extends Keywords {

    private static Logger log = Logger.getLogger(Click.class);
    public static String ElementType= "";
    public static String LocatorValue = "";

    DriverManager driverMangerbrowser=new DriverManager();
    String Drivertype=driverMangerbrowser.Drivertype;
    String EnvironmentType=driverMangerbrowser.EnvironmentType;


    public void elementBy(String locatorKey) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");

            if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
            {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", get.elementBy(locatorKey));
                log.info("Click Successful!");
            }
            else {
                    Keywords.screenshot.attachScreenshot("Click");
                    get.elementBy(locatorKey).click();
                    log.info("Click Successful!");

                }
    }

    public void elementBy(By locator) throws ApplicationException
    {
        log.info("Click element [" + locator + "]");
        try
        {
            get.elementBy(locator).click();
            log.info("Click Successful!");
        }
        catch (StaleElementReferenceException ex)
        {
            get.elementBy(locator).click();

        }
        catch (Exception e) {
            // TODO: handle exception
            log.info("Error while clicking the element " + locator);
            throw new ApplicationException(e.getMessage());

        }

    }

    public void elementBy(String locatorKey, int whichElement) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");
        try {
            get.elementBy(locatorKey, whichElement).click();
            log.info("Clicked on the element's " + locatorKey + " [" + whichElement + "] occurrence");
        } catch (Exception e) {
            log.info("Error while clicking the element " + locatorKey);
            throw new ApplicationException(e.getMessage());
        }
    }

    public void elementBy(String locatorKey, String ivalue) throws ApplicationException {
        log.info("Click element [" + locatorKey + "]");
        try {
            //Wait.forSeconds(3);
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(PropertyReader.locatorOf(locatorKey)));
            //Wait.forSeconds(5);
            List<WebElement> a = driver.findElements(PropertyReader.locatorOf(locatorKey));
            for (int i = 0; i < a.size(); i++) {
                if (( a.get(i).getText().trim() ).contentEquals(ivalue.trim())) {
                    a.get(i).click();
                    log.info("Clicked on the element's " + locatorKey + "with value " + ivalue);
                    break;
                }
            }

        } catch (Exception e) {
            log.info("Error while clicking the element " + locatorKey);
            throw new ApplicationException(e.getMessage());


        }
    }

    public void pickdatefromcalendar(String date) {
        String date_Locator = "//android.view.View[@content-desc='" + date + "']";
        WebElement date_to_selected = driver.findElement(By.xpath(date_Locator));
        date_to_selected.click();

    }
    public static boolean isClickable(WebElement webe)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
/*
    public static void INPUTCLICKFROMDATA(String Data) throws  SQLException, URISyntaxException, ClassNotFoundException, InterruptedException {
        //TestAttributes.TakeScreenShotFlag = false;
        boolean isEnabledCondition=true;
        String Datafinal="";
        String[] DataSplit = Data.split("##");

        ElementType=DataSplit[0];

        if(!ElementType.equalsIgnoreCase("TABLE"))
        {
                element=driver.findElement(By.xpath("//div[contains(text(),'"+DataSplit[1]+"')] | //span[contains(text(),'"+DataSplit[1]+"')] | //a[contains(text(),'"+DataSplit[1]+"')] | //td[contains(text(),'"+DataSplit[1]+"')]"));
        }
        if(ElementType.equalsIgnoreCase("TABLE"))
        {
            Thread.sleep(2000);
            String xpathfinal="//*[contains(text(),"+ " '"+DataSplit[1]+"' " +")]" +LocatorValue + "|" + "//*[text()="+ " '"+DataSplit[1]+"' " +"]" +TestAttributes.LocatorValue ;
            //TestAttributes.element=TestAttributes.driver.findElement(By.xpath("//*[text()='"+DataSplit[1]+"'+TestAttributes.LocatorValue]"));
           element=driver.findElement(By.xpath(xpathfinal));

        }

        try {
            if (element != null) {
                switch (ElementType.toUpperCase().trim()) {
                    case "BUTTON":
                        //JavascriptExecutor js = (JavascriptExecutor) TestAttributes.driver;
                        //js.executeScript("arguments[0].scrollIntoView(true);", TestAttributes.element);

                            Thread.sleep(2000);
                            element.click();
                            ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                            break;

                        JavascriptExecutor js = (JavascriptExecutor) driver;
                        js.executeScript("window.scrollTo(" + TestAttributes.element.getLocation().x + "," + (TestAttributes.element.getLocation().y - 100) + ");");
                        JavascriptExecutor js1 = (JavascriptExecutor) TestAttributes.driver;
                        js1.executeScript("arguments[0].style.border='2px groove green'", TestAttributes.element);
                        js.executeScript("arguments[0].style.border='1px solid silver'", TestAttributes.element);
                        Thread.sleep(500);
                        if(TestAttributes.element.isEnabled() == true)
                        {JavascriptExecutor executor = (JavascriptExecutor)TestAttributes.driver;
                            executor.executeScript("arguments[0].click();", TestAttributes.element);
                            TestAttributes.ActualResult = "Button '" + TestAttributes.Field_Name + "'Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                            Thread.sleep(500);}
                        else{
                            TestAttributes.ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is disabled in the screen.";
                            isEnabledCondition=false;
                        }


                        break;



                    case "LINK":
                        TestAttributes.element.sendKeys(Keys.ENTER);
				try{TestAttributes.element.sendKeys(Keys.ENTER);}
				catch(Exception e) {
					if (e.getMessage().contains("cannot focus element")) {
					JavascriptExecutor executor = null;
					executor.executeScript("arguments[0].click();", TestAttributes.element);}
					else {
						throw new Exception("Exception:", e);
					}
				}
                        TestAttributes.ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                        break;



                    case "IMAGE":
                        TestAttributes.element.click();
                        TestAttributes.ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                        break;

                    case "LABEL":
                        Thread.sleep(1000);
                        TestAttributes.element.click();
                        TestAttributes.ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                        break;

                    case "ELEMENT":
                        TestAttributes.element.click();
                        TestAttributes.ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                        break;
                    case "TABLE":
                        TestAttributes.element.click();
                        TestAttributes.ActualResult = DataSplit[1] + TestAttributes.Field_Name + "' Clicked in the screen '" + TestAttributes.Screen_Name + "' is clicked.";
                        break;

                } }
            else {
                TestAttributes.TakeScreenShotFlag= true;
                TestAttributes.Status = "Error";
                TestAttributes.ActualResult = "The search record is not found'" + TestAttributes.Field_Name + "' in the screen '" + TestAttributes.Screen_Name + "'.";
            }


        }
        catch(Exception f) {

            try{

                TestAttributes.driver.findElement(By.xpath("//div[contains(text(),'"+DataSplit[1]+"')]/parent::button | //span[contains(text(),'"+DataSplit[1]+"')]/parent::button | //a[contains(text(),'"+DataSplit[1]+"')]/parent::button ")).click();;

            }
            catch(Exception e){
                TestAttributes.Status = "Error";
                TestAttributes.ActualResult = "Error while entering the value '" + TestAttributes.Data + "' in the field '" + TestAttributes.Field_Name + "' of the screen '" + TestAttributes.Screen_Name + "'.";

            }

        }
    }

*/
}







