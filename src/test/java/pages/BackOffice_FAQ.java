package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackOffice_FAQ extends Keywords {
		BackOffice_UsersPage usersPage = new BackOffice_UsersPage();
		BackOffice_RegisterPage registerPage = new BackOffice_RegisterPage();
		CommonMethodsPage commonMethods =  new CommonMethodsPage();
	private String keyManageFAQ = "onlineBanking.backoffice.FAQ.manageFAQ";
	private String keyAddFAQType = "onlineBanking.backoffice.FAQ.AddFAQType";
	private String keyAddNewFAQ = "onlineBanking.backoffice.FAQ.AddNewFAQ";
	private String keyAddFAQTitle = "onlineBanking.backoffice.FAQ.AddFAQTitle";
	private String keyFAQBody = "onlineBanking.backoffice.FAQ.FAQBody";
	private String keyAddFAQSubmitForApproval = "onlineBanking.backoffice.FAQ.AddFAQSubmitForApproval";
	private String keyApprovalForFAQ = "onlineBanking.backoffice.FAQ.ApprovalForFAQ";
	private String keyConfirmApprovalReason  =  "onlineBanking.backoffice.FAQ.ADDFAQ.ConfirmApprovalReason";
	private String keyAddFAQApprove = "onlineBanking.backoffice.FAQ.ADDFAQ.Approve";
	private String keyEditFAQ = "onlineBanking.backoffice.FAQ.EditFAQ";
	private String keyEditedFAQ = "onlineBanking.backoffice.FAQ.EditedFAQ";
	private String keyEditFAQTitle = "onlineBanking.backoffice.FAQ.EditFAQTitle";
	private String keyDisapprove = "onlineBanking.backoffice.FAQ.Disapprove";
	private String keyDeleteFAQLink = "onlineBanking.backoffice.FAQ.DeleteFAQLink";
	private String keyDeleteFAQBtn = "onlineBanking.backoffice.FAQ.DeleteFAQBtn";
	private String keyUpdateReason = "onlineBanking.backoffice.FAQ.UpdateReason";
	private String keyNextStep = "onlineBanking.backoffice.FAQ.NextStep";

	String storeValue= Tools.RANDOMTEXT("RANDOMTEXT",10);

	public void clickManageFAQ() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyManageFAQ);
	}

	public void addFAQ(String FAQType) throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyAddNewFAQ);
		verify.IfElementExists(keyAddFAQType);
		select.backOffice_selectValueInAnyList(keyAddFAQType,FAQType);
		verify.IfElementExists(keyAddFAQTitle);
		type.data(keyAddFAQTitle,storeValue);
		type.data(keyFAQBody,"TEXT FAQ Test Automation");

	}

	public void submitFAQ() throws Throwable {
		click.elementBy(keyAddFAQSubmitForApproval);
	}

	public void approveFAQ() throws Throwable {
		click.elementBy(keyApprovalForFAQ);
		usersPage.clickUsersApproveForID();
		type.data(keyConfirmApprovalReason,"Approved");
		click.elementBy(keyAddFAQApprove);
	}

	public void disapproveFAQ() throws Throwable {
		click.elementBy(keyApprovalForFAQ);
		click.elementBy(keyDisapprove);
		type.data(keyConfirmApprovalReason,"DisApproved");
		registerPage.clickDisApprove();
	}

	public void editFAQ() throws Throwable {
		Wait.forSeconds(10000);
 		jsClick.elementBy(keyEditFAQ);
		//click.elementFromStoredData(keyEditFAQ,storeValue);
		type.data(keyEditFAQTitle,Tools.RANDOMTEXT("RANDOMTEXT",10));
		//type.data(keyFAQBody,"TEXT FAQ Test Automation Updating");
		Wait.forSeconds(3000);
		WebElement element = driver.findElement(By.xpath("//*[text()='Next Step'] | //span[text()='Update']/parent::button"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		//click.elementBy(keyNextStep);
		Wait.forSeconds(3000);
		type.data(keyUpdateReason,"update reason");
		commonMethods.clickSaveBtn();
	}

	public void verifyEditedFAQ() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyEditedFAQ);
		Wait.forSeconds(2000);
		verify.elementTextMatching(keyFAQBody,"TEXT FAQ Test Automation Updating");
	}

	public void deleteFAQ() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(keyDeleteFAQLink);
		type.data(keyConfirmApprovalReason,"faq deleted");
		click.elementBy(keyDeleteFAQBtn);
	}
}
