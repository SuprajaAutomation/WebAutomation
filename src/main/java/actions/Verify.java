package actions;

import base.Keywords;
import base.Test;
import exceptions.ApplicationException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class Verify extends Keywords{

	private static Logger log=Logger.getLogger(Verify.class);

	public void elementIsPresent(String locatorKey) throws ApplicationException {
			log.info("Verify element [" + locatorKey + "] is present");
			get.elementBy(locatorKey);
			log.info("Element is present!");
	}

	public void elementISPresent_MacSafari(String locatorKey)throws ApplicationException {

		if(locatorKey == null)
		{
			log.info("Element is not present!");
		}
		else if(locatorKey != null)
		{
			log.info("Element is present!");
		}
	}

	public void elementIsPresent(By locator) throws ApplicationException {
		log.info("Verify element ["+locator+"] is present");
		get.elementBy(locator);
		log.info("Element is present!");
	}

	public void elementTextMatching_MacSafari(String locatorKey,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] text is matching with ["+expectedValue+"]");
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locatorKey).getText().trim());
		actualValue=actualValue.toLowerCase();
		expectedValue=expectedValue.toLowerCase();
		try{
			actualValue.equalsIgnoreCase(expectedValue);
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}
		log.info("Condition verified!");
	}

	public void elementTextMatching(String locatorKey,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] text is matching with ["+expectedValue+"]");
		//Wait.forSeconds(8);
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locatorKey).getText().trim());
		actualValue=actualValue.toLowerCase();
		expectedValue=expectedValue.toLowerCase();
		//String actualValue=get.elementBy(locatorKey).getText().trim();
		//String actualValue = driver.findElement(By.xpath("//*[@text='EVENLY']")).getText();
		try{
			isMatching(expectedValue,actualValue);
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}
		log.info("Condition verified!");
	}

	public boolean elementTextMatchingboolean(String locatorKey,String expectedValue) throws ApplicationException {
		boolean test=false;
		log.info("Verify element ["+locatorKey+"] text is matching with ["+expectedValue+"]");
		//Wait.forSeconds(8);
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locatorKey).getText().trim());
		actualValue=actualValue.toLowerCase();
		expectedValue=expectedValue.toLowerCase();
		//String actualValue=get.elementBy(locatorKey).getText().trim();
		//String actualValue = driver.findElement(By.xpath("//*[@text='EVENLY']")).getText();
		try{
			isMatching(expectedValue,actualValue);
			test=true;
		}catch (Exception ex){


		}
		log.info("Condition verified!");
		return test;
	}


	public void elementTextContains(String locatorKey,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] text is matching with ["+expectedValue+"]");
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locatorKey).getText().trim());
		try{
			Assert.assertTrue(actualValue.contains(expectedValue.trim()),"Condition failed!, actual value doesn't contains the expected value");
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}
		log.info("Condition verified!");
	}

	public void elementTextMatching(By locator,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locator+"] text is matching with ["+expectedValue+"]");
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locator).getText().trim());
		try{
			isMatching(expectedValue,actualValue);
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}
		log.info("Condition verified!");
	}

	public void elementTextContains(By locator,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locator+"] text is matching with ["+expectedValue+"]");
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locator).getText().trim());
		try{
			Assert.assertTrue(actualValue.contains(expectedValue.trim()),"Condition failed!, actual value doesn't contains the expected value");
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}
		log.info("Condition verified!");
	}

	public void elementtrimTextContains(String locatorKey,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] text is matching with ["+expectedValue+"]");
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locatorKey).getText().trim());
		actualValue=actualValue.replace(",","");
		try{
			Assert.assertTrue(actualValue.contains(expectedValue.trim()),"Condition failed!, actual value doesn't contains the expected value");
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}
		log.info("Condition verified!");
	}


	public void isMatching(String expected,String actual){
		Assert.assertTrue(actual.equalsIgnoreCase(expected.trim()),"Condition failed!, actual value doesn't match with expected value");
	}

	public void elementIsEnabled(String locatorKey) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] is Enabled");
		try{
			Boolean enable=get.elementBy(locatorKey).isEnabled();
			Assert.assertTrue(enable.booleanValue());
			//Assert.assertTrue( get.elementBy(locatorKey).isEnabled());
			log.info("Element is Enabled!");
		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}

	public void elementIsEnabled(By locator) throws ApplicationException {
		log.info("Verify element ["+locator+"] is Enabled");
		try{
			Assert.assertTrue( get.elementBy(locator).isEnabled());
			log.info("Element is Enabled!");
		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}

	public void elementIsDisabled(String locatorKey) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] is Disabled");
		try{
			/////
			Boolean enable=get.elementBy(locatorKey).isEnabled();
			Assert.assertFalse(enable.booleanValue());
			//Assert.assertFalse(!get.elementBy(locatorKey).isEnabled());
			log.info("Verification success, Element " + locatorKey + " is disabled");
		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}

	}

	public void elementTextMatching(String locatorKey,int whichElement,String expectedValue) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] text is matching with ["+expectedValue+"]");
		String actualValue=Test.tools.REMOVE_MULTIPLE_SPACES_AND_NEW_LINES(get.elementBy(locatorKey,whichElement).getText().trim());
		try{
			isMatching(expectedValue,actualValue);
			log.info("Condition verified!");
		}catch (Exception ex){
			log.error(ex);
			throw new ApplicationException(ex.getMessage());
		}

	}

	public void IfElementExists(By locator) throws ApplicationException {
		try{
			get.elementBy(locator);
			log.info("ApplicationException success, Element " + locator + " exists in the page");
		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}

	public void IfElementExists(String locatorKey) throws ApplicationException {
		try{
			get.elementBy(locatorKey);
			log.info("Verification success, Element " + locatorKey + " exists in the page");
		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}


	public boolean IfElementExistsboolean(String locatorKey) throws ApplicationException {
		boolean test=false;
		try{
			test=get.elementBy(locatorKey).isDisplayed();
			log.info("Verification success, Element " + locatorKey + " exists in the page");
			//test=true;
		}catch(Exception e){
		}
		return test;
	}

	public void IfElementNotExists(String locatorKey) throws ApplicationException {
		try{
			get.elementBy(locatorKey);
			throw new ApplicationException("Element " + locatorKey + " exists in the page");
		}catch(ApplicationException e){
			log.info("Verification success, Element " + locatorKey + " not exist in the page");
		}
	}

	public void ElementTextByAttribute(String locatorKey,String expectedValue,String whichAttribute) throws ApplicationException {
		try{
			String actualValue = get.elementBy(locatorKey).getAttribute(whichAttribute.trim());
			Assert.assertEquals(expectedValue.trim(),actualValue.trim());
			log.info("Verification success, Expected value " + expectedValue + " matching with Actual text " + actualValue);
		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}

	public boolean elementText(String locatorKey,String ivalue) throws ApplicationException {

		boolean val=false;
		try{
			//attachScreenshot("Click_"+ locatorKey.replace(".","_"));
			//webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(locatorKey)));
			List<WebElement> a=driver.findElements(By.id(locatorKey));
			for (int i = 0; i <a.size(); i++) {
				if((a.get(i).getText().trim()).contentEquals(ivalue.trim()))
				{
					val=true;
					break;
				}

			}

		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}

		return val;
	}


	public void elementIsnotEnabled(String locatorKey) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] is Enabled");
		try{
			Boolean enable=get.elementBy(locatorKey).isEnabled();
			if(enable==false) {
				log.info("Element is not Enabled!");
			}

		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}

	public void elementIsnotPresent(String locatorKey) throws ApplicationException {
		log.info("Verify element ["+locatorKey+"] is not present");
		try{
			Boolean enable=get.elementBy(locatorKey).isDisplayed();
			if(enable==false) {
				log.info("Element is not Present!");
			}

		}catch(Exception e){
			throw new ApplicationException(e.getMessage());
		}
	}

	public static void VERIFYDATE(String locatorKey,String Dateval) {

		try {

		//	String Dateval = TestAttributes.Data;
			int Dateval2 = Integer.parseInt(Dateval);

			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE,Dateval2);
			String dateFormatted = (String)(dateFormat.format(cal.getTime()));

			String Strmonth=dateFormatted.substring(0,2);
			String Strday= dateFormatted.substring(3,5);
			String Stryear= dateFormatted.substring(6,10);
			switch(Strmonth)
			{
				case "01":
					Strmonth="January";
					break;
				case "02":
					Strmonth="February";
					break;
				case "03":
					Strmonth="March";
					break;
				case "04":
					Strmonth="April";
					break;
				case "05":
					Strmonth="May";
					break;
				case "06":
					Strmonth="June";
					break;
				case "07":
					Strmonth="July";
					break;
				case "08":
					Strmonth="August";
					break;
				case "09":
					Strmonth="September";
					break;
				case "10":
					Strmonth="October";
					break;
				case "11":
					Strmonth="November";
					break;
				case "12":
					Strmonth="December";
					break;
			}

			dateFormatted=Strmonth+" "+Strday+","+Stryear;
			System.out.println(dateFormatted);
			//TestAttributes.TakeScreenShotFlag= true;
			String ActualValue = "";
			String[] arrInput = Dateval.split("@@");

			if (element != null) {

				ActualValue = element.getText().trim().replace("\n", "").replace(" ", "");
				if (ActualValue.equalsIgnoreCase(dateFormatted.trim())) {
					log.info("Passed");
					log.info("Expected Value ["+dateFormatted+"] matches with the value in the application.");

				} else {
					log.info("Error");
					//Settings.ifError=true;
					log.info("Expected Value is  ["+dateFormatted+"] . But the Actual value is  ["+ActualValue+"]  ");
				}
			}

		}
		catch (Exception e) {
			//TestAttributes.TakeScreenShotFlag= true;
			log.info("Error");
			//TestAttributes.Status = "Error";
			//log.info("Expected Value is  ["+dateFormatted+"] . But the Actual value is  ["+ActualValue+"]  ");
			//TestAttributes.ActualResult = "Error while verifying the value '" + TestAttributes.Data + "' in the field '" + TestAttributes.Field_Name + "' of the screen '" + TestAttributes.Screen_Name + "'.";
			//TestAttributes.ActualResult = TestAttributes.ActualResult + " " + e.getMessage() + ".";
		}
	}

	public void VERIFYBANKNAMENOTINLIST(String Data) {

		driver.findElement(By.xpath("(//div[@class='ant-select-selection__rendered'])[1] | (//div[@class='ant-select-selector'])[1]")).click();
		try{


			String Datatoselectxpath= "("+"//*[text()="+"'"+Data+"'"+"]"+")"+"[1]";
			WebElement test=driver.findElement(By.xpath(Datatoselectxpath));
			log.info("Failed");
		}
		catch(Exception e){
			log.info("Passed");
			log.info("Successfully verified in Bank List");
		}


	}


}