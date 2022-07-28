package pages;

import actions.Verify;
import actions.Wait;
import base.Keywords;

public class BackOffice_UsersPage extends Keywords {

	private String keyUsersCancel="onlineBanking.backoffice.accounts.Users.UsersCancel";
	private String keyUsersDispprove="onlineBanking.backoffice.accounts.Users.UsersDisapprove";
	private String keyUsersApprove="onlineBanking.backoffice.accounts.Users.UsersApprove";
	private String keyUsersConfirmDisapproval="onlineBanking.backoffice.accounts.clientUser.ConfirmDisapproveBtn";
	private String keyConfirmCancelRequestReason="onlineBanking.backoffice.accounts.clientUser.ConfirmCancelRequestReason";
	private String keyConfirmCancelBtn="onlineBanking.backoffice.accounts.clientUser.ConfirmCancelBtn";
	private String keyConfirmDisapproveBtn="onlineBanking.backoffice.accounts.clientUser.ConfirmDisapproveBtn";
	private String keyUsersApprovalApprove="onlineBanking.backoffice.accounts.Users.UsersApprovalApprove";
	private String KeyUsersApproveForID="onlineBanking.backoffice.accounts.Users.UsersApproveForID";
	private String keyAccessApprovalApprove="onlineBanking.backoffice.accounts.Users.AccessApprovalApprove";

	public void clickUsersCancel() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyUsersCancel);
	}

	public void clickUsersDispprove() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyUsersDispprove);
	}

	public void clickUsersApprove() throws  Throwable {
		Wait.forSeconds(3000);
		jsClick.elementBy(keyUsersApprove);
	}

	public void clickUsersApproveForID() throws Throwable {
		Wait.forSeconds(2000);
		jsClick.elementBy(KeyUsersApproveForID);
	}

	public void enterCancelReason(String reason) throws Throwable {
		Wait.forSeconds(1000);
		type.data(keyConfirmCancelRequestReason,reason);
	}

	public void clickConfirmCancelBtn() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyConfirmCancelBtn);
	}

	public void clickConfirmDisapproveBtn() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyConfirmDisapproveBtn);
	}

	public void clickUsersApprovalApprove() throws Throwable {
		jsClick.elementBy(keyUsersApprovalApprove);
		Wait.forSeconds(2000);
	}

	public void clickAccessApprovalApprove() throws Throwable {
		jsClick.elementBy(keyAccessApprovalApprove);
		Wait.forSeconds(2000);
	}
}
