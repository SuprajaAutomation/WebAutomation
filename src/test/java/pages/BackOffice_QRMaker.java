package pages;

import actions.Wait;
import base.Keywords;

public class BackOffice_QRMaker extends Keywords {

	//BackOffice_UsersPage usersPage=new BackOffice_UsersPage();
	private String keyManageBiller = "onlineBanking.backoffice.Biller.ManagerBiller";
	private String keySearchBiller = "onlineBanking.backoffice.Biller.SearchBiller";
	private String keyManageBillerGenerate = "onlineBanking.backoffice.QRMAKER.ManageBillerGenerate";
	private String keyPayorsName = "onlineBanking.backoffice.QRMAKER.PayorsName";
	private String keyPinOyPin = "onlineBanking.backoffice.QRMAKER.PINOYPin";
	private String keyGenerate = "onlineBanking.backoffice.QRMAKER.Generate";
	private String keyQRCode = "onlineBanking.backoffice.QRMAKER.QRCode";
	private String keyCancel = "onlineBanking.backoffice.QRMAKER.Cancel";

	public void clickManageBiller() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyManageBiller);
	}

	public void searchBiller(String name) throws Throwable {
		Wait.forSeconds(1000);
		type.data(keySearchBiller, name);
		aReturn.clickEnter(keySearchBiller);
		Wait.forSeconds(2000);
		click.elementBy(keyManageBillerGenerate);
	}

	public void EnterDetailsAndGenerateQR(String name, String pin) throws Throwable {
		type.data(keyPayorsName,name);
		type.data(keyPinOyPin, pin);
		Wait.forSeconds(2000);
		jsClick.elementBy(keyGenerate);
		verify.elementIsPresent(keyQRCode);
	}

	public void cancelQRMaker() throws Throwable {
		Wait.forSeconds(2000);
		verify.IfElementExists(keyCancel);
		click.elementBy(keyCancel);
	}
}
