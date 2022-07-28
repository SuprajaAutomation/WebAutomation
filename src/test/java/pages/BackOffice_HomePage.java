package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BackOffice_HomePage extends Keywords {

	private String keyAccountsTab = "onlineBanking.backoffice.homePage.accounts";
	private String keyLogoutBtn = "onlineBanking.backoffice.homepage.logout";
	private String keyScheduledActivities = "onlineBanking.backoffice.homePage.ScheduledActivities";
	private String keyRegister = "onlineBanking.backoffice.Register.btnregister";
	private String keySendNotification="onlineBanking.backoffice.homePage.SendNotifications";
	private String keyFAQ = "onlineBanking.backoffice.homePage.FAQ";

	public void clickAccounts() throws Throwable {
		actions.Wait.forSeconds(3000);
		jsClick.elementBy(keyAccountsTab);
	}

	public void clickLogoutBtn() throws Throwable {
		actions.Wait.forSeconds(2000);
		jsClick.elementBy(keyLogoutBtn);
		actions.Wait.forSeconds(2000);
	}

	public void clickScheduledActivities() throws Throwable {
		actions.Wait.forSeconds(3000);
		jsClick.elementBy(keyScheduledActivities);
	}

	public void clickRegister() throws Throwable {
		actions.Wait.forSeconds(3000);
		jsClick.elementBy(keyRegister);
	}

	public void clickSendNotification() throws Throwable {
		actions.Wait.forSeconds(2000);
		jsClick.elementBy(keySendNotification);
	}

	public void clickFAQ() throws Throwable {
		jsClick.elementBy(keyFAQ);
	}
}
