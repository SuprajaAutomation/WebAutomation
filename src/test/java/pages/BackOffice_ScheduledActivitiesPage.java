package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;

public class BackOffice_ScheduledActivitiesPage extends Keywords {

	private String keyFailedScheduledFundTransfer = "onlineBanking.backoffice.ScheduledActivities.FailedScheduledFundTransfer";
	private String keyFailedScheduledBillsPayment="onlineBanking.backoffice.ScheduledActivities.FailedScheduledBillsPayment";
	private String keyFailedScheduledBillsPaymentSearch2 = "onlineBanking.backoffice.ScheduledActivities.FailedScheduledBillsPaymentSearch2";
	private String keyFailedScheduledPaymentSearchBtn = "onlineBanking.backoffice.ScheduledActivities.FailedScheduledPaymentSearchBtn";
	private String keyFirstElementDailyID = "onlineBanking.backoffice.ScheduledActivities.SearchResults.FirstElementDailyID";
	private String keySecondElementAccNos = "onlineBanking.backoffice.ScheduledActivities.SearchResults.SecondElementAccNos";
	private String keyThirdElementTransaction = "onlineBanking.backoffice.ScheduledActivities.SearchResults.ThirdElementTransaction";
	private String keyFourthElementMessage = "onlineBanking.backoffice.ScheduledActivities.SearchResults.FourthElementMessage";
	private String keyFifthElementStatus = "onlineBanking.backoffice.ScheduledActivities.SearchResults.FifthElementStatus";
	private String keySixthElementAction = "onlineBanking.backoffice.ScheduledActivities.SearchResults.SixthElementAction";
    private String keyNoRecordsFound = "onlineBanking.backoffice.ScheduledActivities.SearchResults.NoRecordsFound";
	private String getKeyFailedScheduledBillsPaymentSearch1="onlineBanking.backoffice.ScheduledActivities.FailedScheduledBillsPaymentSearch1";
	private String keyFailedScheduledFundTransferSearchTxt="onlineBanking.backoffice.ScheduledActivities.FailedScheduledFundPaymentSearchTxt";

	public void clickFailedScheduledFundTransfer() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyFailedScheduledFundTransfer);
	}

	public void clickFailedScheduledBillsPayment() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyFailedScheduledBillsPayment);
	}

	public void
	clickFailedScheduledBillsPaymentSearch(String data) throws Throwable {
		select.backOffice_selectValueInAnyList(keyFailedScheduledBillsPaymentSearch2,data);
		jsClick.elementBy(keyFailedScheduledPaymentSearchBtn);
	}

	public void selectSearch1EnterSearchTxtClickSearchBtn(String data,String text) throws Throwable {
		select.backOffice_selectValueInAnyList(getKeyFailedScheduledBillsPaymentSearch1,data);
		type.data(keyFailedScheduledFundTransferSearchTxt,text);
		click.elementBy(keyFailedScheduledPaymentSearchBtn);
	}

	public void selectSearch1(String data)throws Throwable {
		select.backOffice_selectValueInAnyList(getKeyFailedScheduledBillsPaymentSearch1,data);
	}

	public void verifyFailedScheduledElements() throws Throwable {
		Wait.forSeconds(4000);
		verify.elementIsPresent(keyFirstElementDailyID);
		verify.elementIsPresent(keySecondElementAccNos);
		verify.elementIsPresent(keyThirdElementTransaction);
		verify.elementIsPresent(keyFourthElementMessage);
		verify.elementIsPresent(keyFifthElementStatus);
		verify.elementIsPresent(keySixthElementAction);
	}

	public void verifyNoRecordsFound(String data) throws Throwable {
		Wait.forSeconds(8000);
		verify.elementTextMatching(keyNoRecordsFound,data);

	}
}
