package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import gherkin.lexer.Th;

public class BackOffice_PushNotificationPage extends Keywords {

	BackOffice_UsersPage usersPage=new BackOffice_UsersPage();

	private String manageNotiLink="onlineBanking.backoffice.PushNotification.ManageNotification";
	private String addNewNotiBtn="onlineBanking.backoffice.PushNotification.AddNewNotificationBtn";
	private String addNewNotiTitle="onlineBanking.backoffice.PushNotification.AddNewNotificationTitle";
	private String addNewNotiMsg="onlineBanking.backoffice.PushNotification.AddNewNotificationMsg";
	private String NotiForApproval="onlineBanking.backoffice.PushNotification.NotificationForApproval";

	public void clickManageNotification() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(manageNotiLink);
	}

	public void addNewNotification() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(addNewNotiBtn);
		Wait.forSeconds(3000);
		type.data(addNewNotiTitle,"Automation");
		type.data(addNewNotiMsg,"For Autoation purpose");
	}

	public void approveNotification(String reason) throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(NotiForApproval);
		usersPage.clickUsersApproveForID();
		usersPage.enterCancelReason(reason);
		usersPage.clickAccessApprovalApprove();
	}
}
