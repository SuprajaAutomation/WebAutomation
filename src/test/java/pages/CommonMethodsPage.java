package pages;

import actions.Wait;
import base.Keywords;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class CommonMethodsPage extends Keywords {

	WebDriver driver;
	private String keyYesBtn = "onlineBanking.backoffice.common.YesBtn";
	private String keyNoBtn="onlineBanking.backoffice.common.NoBtn";
	private String keyCloseBtn2 = "onlineBanking.backoffice.common.CloseBtn2";
	private String keyCloseBtn1 = "onlineBanking.backoffice.common.CloseBtn1";
	private String keySaveBtn = "onlineBanking.backoffice.common.SaveBtn";
	private String keyLogoutBtn = "onlineBanking.backoffice.common.LogoutBtn";
	private String keyErrorMessage = "onlineBanking.common.alertMsg";
	private String keyAccNumErrMsg = "onlineBanking.common.Accountnum_amount_Errormessage";
	private String keyCancelBtn = "onlineBanking.common.CancelBtn";
	private String keySelectAcc = "onlineBanking.common.ClickToSelectAcc";
	private String keyFromAccNumber = "onlineBanking.common.FromAccNumber";
	private String keyToAccNumber = "onlineBanking.Fundtransfer.Toaccountnumber";
	private String keyCancelBtn1 = "onlineBanking.common.CancelBtn1";
	private String keyAccNumBGColor = "onlineBanking.common.AccNumBGColor";

	public void clickYesBtn() throws Throwable {
		click.elementBy(keyYesBtn);
	}

	public void clickNoBtn() throws Throwable {
		click.elementBy(keyNoBtn);
	}

	public void clickCloseBtn2() throws Throwable {
		click.elementBy(keyCloseBtn2);
	}

	public void clickCloseBtn1() throws Throwable {
		click.elementBy(keyCloseBtn1);
	}

	public void clickSaveBtn() throws Throwable {
		click.elementBy(keySaveBtn);
		Wait.forSeconds(3000);
	}

	public void clickLogoutBtn() throws Throwable {
		Wait.forSeconds(3000);
		click.elementBy(keyLogoutBtn);
	}

	public void verifyAlert() throws Throwable {
		verify.IfElementExists(keyErrorMessage);
	}

	public void verifyAccNumErrMsg(String message) throws Throwable {
		Wait.forSeconds(2000);
		verify.elementTextMatching(keyAccNumErrMsg,message);
	}

	public void verifyAccNumErrMsg1(String message) throws Throwable {
		Wait.forSeconds(2000);
		verify.elementTextContains(keyAccNumErrMsg,message);
	}

	public void verifyAccNumNoErrMsg() throws Throwable {
		verify.IfElementNotExists(keyAccNumErrMsg);
	}
	public void clickCancelBtn() throws Throwable {
		verify.IfElementExists(keyCancelBtn);
		click.elementBy(keyCancelBtn);
	}

	public void clickCancelBtn1() throws Throwable {
		verify.IfElementExists(keyCancelBtn1);
		click.elementBy(keyCancelBtn1);
	}

	public void clickkeySelectAcc() throws Throwable {
		verify.IfElementExists(keySelectAcc);
		click.elementBy(keySelectAcc);
	}

	public void clickFromAccNumber() throws Throwable {
		jsClick.elementBy(keySelectAcc);
		verify.IfElementExists(keyFromAccNumber);
		jsClick.elementBy(keyFromAccNumber);
	}

	public void verifyAccNumBGColor() throws Throwable {
		verify.IfElementExists(keyAccNumBGColor);
	}

	public void verifyFrom_To_Account() throws Throwable {
		verify.IfElementExists(keyFromAccNumber);
		verify.IfElementExists(keyToAccNumber);
	}

	public void pageRefresh() throws Throwable {
		driver.navigate().refresh();
	}


}
