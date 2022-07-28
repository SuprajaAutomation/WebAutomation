package pages;

import actions.Verify;
import actions.Wait;
import base.Keywords;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BackOffice_AccountsSearchPage extends Keywords {

	private Verify verify = new Verify();

	private String keySearchtxtBox="onlineBanking.backoffice.accountSearchPage.search";
	private String keyActiveUserID="onlineBanking.backoffice.accountsSearchPage.activeUserID";

	public void searchFirstname(String firstName) throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keySearchtxtBox);
		Wait.forSeconds(2000);
		type.data(keySearchtxtBox,firstName);
		Wait.forSeconds(2000);
		actions.Return.clickEnter(keySearchtxtBox);
	}

	public void verifyActiveUser() throws Throwable {
		actions.Wait.forSeconds(2000);
		verify.elementIsEnabled(keyActiveUserID);
	}

	public void verifyNoActiveUser() throws Throwable {
		actions.Wait.forSeconds(200);
		verify.IfElementNotExists(keyActiveUserID);
	}

	public void searchLastName(String lastName) throws Throwable {
		actions.Wait.forSeconds(2000);
		type.data(keySearchtxtBox,lastName);
		actions.Wait.forSeconds(2000);
		actions.Return.clickEnter(keySearchtxtBox);
	}

	public void searchMobileNumber(String mobileNumber) throws Throwable {
		actions.Wait.forSeconds(2000);
		type.data(keySearchtxtBox,mobileNumber);
		actions.Wait.forSeconds(2000);
		actions.Return.clickEnter(keySearchtxtBox);
	}

	public void searchEmailID(String emailID)throws Throwable {
		actions.Wait.forSeconds(2000);
		type.data(keySearchtxtBox,emailID);
		actions.Wait.forSeconds(2000);
		actions.Return.clickEnter(keySearchtxtBox);
	}

	public void searchAccountNumber(String accountNumber)throws Throwable {
		actions.Wait.forSeconds(2000);
		type.data(keySearchtxtBox,accountNumber);
		actions.Wait.forSeconds(2000);
		actions.Return.clickEnter(keySearchtxtBox);
	}

	public void searchinvalidAccNum(String invalidAccNum)throws Throwable {
		actions.Wait.forSeconds(2000);
		type.data(keySearchtxtBox,invalidAccNum);
		actions.Wait.forSeconds(2000);
		actions.Return.clickEnter(keySearchtxtBox);
	}

	public void clickActiveUser() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyActiveUserID);
	}


}
