package pages;

import base.Keywords;

public class BackOffice_AccountsPage extends Keywords {

	private String keyManageClients="onlineBanking.backoffice.accountsPage.manageClients";
	private String keyInvalidSignUps="onlineBanking.backoffice.accountsPage.manageInvalidSignups";
	private String keyManageUserIDforApproval="onlineBanking.backoffice.accountsPage.manageUserIDforApproval";

	public void clickManageClients() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyManageClients);
	}

	public void clickInvalidSignUpsTab() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyInvalidSignUps);
	}

	public void clickManageUSerIDForApproval() throws Throwable {
		actions.Wait.forSeconds(2000);
		click.elementBy(keyManageUserIDforApproval);
	}

}
