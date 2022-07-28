package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Firstpage extends Keywords {

	private String Keyusername = "convergent.login.textboxUsername";
	private String Keypassword = "convergent.login.textboxPassword";
	private String KeySignUpNow = "convergent.login.btnSignup";
	private String keyBOUserName="onlineBanking.backoffice.login.username";
	private String keyBOPassword="onlineBanking.backoffice.login.password";
	private String keyLoginBtn="onlineBanking.backoffice.login.loginBtn";
	private String keepmeloggedinbtn = "convergent.login.keepmeloggedinbtn";
	private String Version = "convergent.login.Version";
	private String ZAPPopup = "onlineBanking.ZAPPopup";

	public void enterUsernme(String usernmae) throws ApplicationException {
		type.data(Keyusername,usernmae);
	}
	public void enterPassword(String password) throws ApplicationException {
		type.data(Keypassword,password);
	}

	public void clickSignupnow() throws ApplicationException {
		click.elementBy(KeySignUpNow);
	}

	public void launchnewapplication() throws ApplicationException, EnvironmentException {
		launchApplication();
	}

	public void enterBOUserName(String username) throws ApplicationException, InterruptedException {
		Wait.forSeconds(14000);
		type.data(keyBOUserName,username);
		Wait.forSeconds(14000);
	}

	public void enterBOPassword(String password) throws ApplicationException, InterruptedException {
		Wait.forSeconds(2000);
		type.data(keyBOPassword,password);
	}

	public void enterBOLogin() throws ApplicationException {
		Wait.forSeconds(3000);
		//Wait.forSeconds(2000);
		WebElement element = driver.findElement(By.xpath("//*[text()='Login']/parent::button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Wait.forSeconds(5000);
	}

	public void clickRecaptcha() throws ApplicationException {
/*
		Wait.forSeconds(2000);
		if(verify.IfElementExistsboolean(ZAPPopup))
		{
			jsClick.elementBy(ZAPPopup);
		}
*/
		WebElement iframeSwitch = driver.findElement(By.xpath("(//div/iframe)[1]"));
		Wait.forSeconds(3000);
		driver.switchTo().frame(iframeSwitch);
		Wait.forSeconds(5000);
		element=driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		Wait.forSeconds(3000);
		driver.switchTo().defaultContent();
		Wait.forSeconds(5000);
	}

	public void clickLoginbutton() throws ApplicationException {
		//driver.findElement(By.xpath("//*[text()='Log In']/parent::button")).click();
		element = driver.findElement(By.xpath("//*[text()='Log In']/parent::button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public void enterOTP(String otp) throws ApplicationException {
		Wait.forSeconds(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter 6-digit One-Time Password']|| ")).sendKeys(otp);
	}
	public void clickSubmitbutton() throws ApplicationException {
		driver.findElement(By.xpath("//*[text()='Submit']/parent::button")).click();
	}


	public void clickkeepmeloggedinbtn() throws Throwable {
		Wait.forSeconds(2000);
		try {

			if(keepmeloggedinbtn!=null)
			{
				jsClick.elementBy(keepmeloggedinbtn);
			}
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}

	public void store_Version() throws Throwable {
		String version = get.elementBy(Version).getText();
		System.out.println("The version of the application is "+version);
	}

}
