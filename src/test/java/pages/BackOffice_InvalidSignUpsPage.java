package pages;

import base.Keywords;
import com.github.javafaker.App;
import exceptions.ApplicationException;

public class BackOffice_InvalidSignUpsPage extends Keywords {

	private String keySearchResults="onlineBanking.backoffice.accounts.InvalidSignUps.SearchResultsTable";
	private String keySearchText="onlineBanking.backoffice.accounts.InvalidSignUps.AddFAQType.SearchTxt";
	private String keySearchBtn="onlineBanking.backoffice.accounts.InvalidSignUps.SearchBtn";
	private String keyFAQType="onlineBanking.backoffice.accounts.InvalidSignUps.AddFAQType";
	private String keyCIFType="onlineBanking.backoffice.accounts.InvalidSignUps.CIFType";

	public void verifySearchResults() throws ApplicationException {
		wait.forSeconds(3000);
		verify.elementIsPresent(keySearchResults);
	}

	public void selectFAQType(String data) throws ApplicationException {
		select.backOffice_selectValueInAnyList(keyFAQType,data);
	}

	public void enterinSearchText(String text) throws Throwable {
		type.data(keySearchText,text);
		click.elementBy(keySearchBtn);
	}

	public void selectCIFType(String data)throws Throwable {
		select.backOffice_selectValueInAnyList(keyCIFType,data);
		click.elementBy(keySearchBtn);
	}
}
