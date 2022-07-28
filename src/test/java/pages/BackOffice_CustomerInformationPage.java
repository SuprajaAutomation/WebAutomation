package pages;

import actions.Verify;
import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import actions.JSClick;

public class BackOffice_CustomerInformationPage extends Keywords {
	WebElement element;
	private Verify verify = new Verify();

	private String keyActiveAccount="onlineBanking.backoffice.accounts.clientUser.activeAccount";
	private String keyfundTransferLog="onlineBanking.backoffice.accounts.clientUser.fundTransferLog";
	private String keyEmailBtn="onlineBanking.backoffice.accounts.clientUser.EmailBtn";
	private String keyEmail_SMSBtn="onlineBanking.backoffice.accounts.clientUser.Email&SMSBtn";
	private String keySMSBtn="onlineBanking.backoffice.accounts.clientUser.SMSBtn";
	private String keyBillsPaidLog="onlineBanking.backoffice.accounts.clientUser.billsPaidLog";
	private String keyLoadPurchaseRequests="onlineBanking.backoffice.accounts.clientUser.loadPurchaseRequests";
	private String keyCustomerInfoTitle="onlineBanking.backoffice.accounts.clientUser.CustomerInfoTitle";
	private String keyDeactivateBtn="onlineBanking.backoffice.accounts.clientUser.DeactivateBtn";
	private String keymanageProfileChangesforApprovalLink="onlineBanking.backoffice.accounts.clientUser.manageProfileChangesforApprovalLink";
	private String keyConfirmDeactivateBtn="onlineBanking.backoffice.accounts.clientUser.ConfirmDeactivateBtn";
	private String keyEditProfileBtn="onlineBanking.backoffice.accounts.clientUser.EditProfileBtn";
    private String keyEditProfileLastName="onlineBanking.backoffice.accounts.clientUser.EditProfileLastNameTxt";
    private String keyCustoInfoApprovalReason="onlineBanking.backoffice.accounts.clientUser.CustomerInfoApprovalReason";
	private String keyEditUserIDUpdateBtn="onlineBanking.backoffice.accounts.clientUser.EditUserIDUpdateBtn";
	private String keyEditUserIDBtn="onlineBanking.backoffice.accounts.clientUser.EditUserIDBtn";
	private String keyEditUserIDtxt="onlineBanking.backoffice.accounts.clientUser.EditUserIDTxt";
	private String keyActivateBtn="onlineBanking.backoffice.accounts.clientUser.ActivateBtn";
	private String keyConfirmActivateBtn="onlineBanking.backoffice.accounts.clientUser.ConfirmActivateBtn";

	public void clickActiveAccount()throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyActiveAccount);
	}

	public void verifyAndClickFundTransferLog() throws Throwable {
		Wait.forSeconds(5000);
		//verify.elementIsPresent(keyfundTransferLog);
		//Wait.forSeconds(2000);
		jsClick.elementBy(keyfundTransferLog);
	}

	public void verifyAndClickBillsPaidLog() throws Throwable {
		Wait.forSeconds(5000);
		verify.elementIsPresent(keyBillsPaidLog);
		jsClick.elementBy(keyBillsPaidLog);
	}

	public void verifyAndClickLoadPurchaseRequest() throws Throwable {
		Wait.forSeconds(5000);
		verify.elementIsPresent(keyLoadPurchaseRequests);
		jsClick.elementBy(keyLoadPurchaseRequests);
	}

	public void verifyAndClickEmail() throws  Throwable {
		Wait.forSeconds(5000);
		verify.elementIsPresent(keyEmailBtn);
		jsClick.elementBy(keyEmailBtn);
	}

	public void verifyAndClickEmail_SMS() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(keyEmail_SMSBtn);
		jsClick.elementBy(keyEmail_SMSBtn);
	}

	public void verifyAndClickSMS() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(keySMSBtn);
		jsClick.elementBy(keySMSBtn);
	}

	public void verifyTtile() throws Throwable {
		Wait.forSeconds(1000);
		verify.elementIsPresent(keyCustomerInfoTitle);
	}

	public void clickDeactivateBtn() throws Throwable {
		click.elementBy(keyDeactivateBtn);
	}

	public void clickActivateBtn() throws Throwable {
		click.elementBy(keyActivateBtn);
	}

	public void clickProfileManagesForApprovalLink() throws Throwable {
		click.elementBy(keymanageProfileChangesforApprovalLink);
	}


	public void verifyDeactivateBtn() throws Throwable {
		Wait.forSeconds(4000);
		verify.elementIsEnabled(keyDeactivateBtn);
	}

	public void clickConfirmDeactivateBtn() throws Throwable {
		Wait.forSeconds(3000);
		jsClick.elementBy(keyConfirmDeactivateBtn);
	}

	public void clickConfirmActivateBtn() throws Throwable {
		Wait.forSeconds(3000);
		jsClick.elementBy(keyConfirmActivateBtn);
	}

	public void clickEditProfileBtn() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyEditProfileBtn);
	}

	public void enterLastName(String data) throws Throwable {
		Wait.forSeconds(2000);
		type.data(keyEditProfileLastName,data);
	}

	public void clickKeyEditUSerIDUpdateBtn() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(keyEditUserIDUpdateBtn);
	}

	public void enterCustoInfoApprovalReason(String data) throws Throwable {
		Wait.forSeconds(1000);
		type.data(keyCustoInfoApprovalReason,data);
	}

	public void clickEditUserIDBtn() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsPresent(keyEditUserIDBtn);
		click.elementBy(keyEditUserIDBtn);
	}

	public void enterEditUserIDtxt(String data) throws Throwable {
		Wait.forSeconds(1000);
		type.data(keyEditUserIDtxt,data);
	}

}
