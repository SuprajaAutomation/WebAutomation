package pages;

import actions.Wait;
import base.Keywords;
import exceptions.ApplicationException;
import gherkin.lexer.Da;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverManager.Drivertype;
import static driver.DriverManager.EnvironmentType;

public class Dashboard_Home_Page extends Keywords {

	private String SendReceive = "onlineBanking.Dashboard.SendReceive";
	private String fx = "onlineBanking.Dashboard.ForeignExchange";
	private String AccountsManageBtn = "onlineBanking.Dashboard.AccountsMAnageBtn";
	private String AddAccounts = "onlineBanking.Dashboard.AddAccountsLink";
	private String AddExistingAccounts = "onlineBanking.Dashboard.AddExistingAcc";
	private String UITFAccount = "onlineBanking.Dashboard.UITFAccount";
	private String recentTransactionLbl = "onlineBanking.Dashboard.recentTransactionLbl";
	private String viewMoreBtn = "onlineBanking.Dashboard.UITFViewMoreBtn";
	private String TransacHisLbl = "onlineBanking.Dashboard.TransacHisLbl";
	private String SubscriptionsBtn = "onlineBanking.Dashboard.SubscriptionsBtn";
	private String RedemptionsBtn  = "onlineBanking.Dashboard.RedemptionsBtn";
	private String UITFAllBtn = "onlineBanking.Dashboard.UITFAllBtn";
	private String SubscriptionProduct = "onlineBanking.Dashboard.SubscriptionProduct";
	private String RedemptionProduct = "onlineBanking.Dashboard.RedemptionProduct";
	private String ReferenceNo = "onlineBanking.Dashboard.ReferenceNo";
	private String SettlementDate = "onlineBanking.Dashboard.SettlementDate";
	private String TransactionDate = "onlineBanking.Dashboard.TransactionDate";
	private String DescriptionSubs = "onlineBanking.Dashboard.DescriptionSubs";
	private String DescriptionRedemp = "onlineBanking.Dashboard.DescriptionRedemp";
	private String SubscriptionAmt = "onlineBanking.Dashboard.SubscriptionAmt";
	private String UITFElement = "onlineBanking.Dashboard.UITFElement";
	private String UITFLink = "onlineBanking.Dashboard.UITFLink";
	private String GetStartedBtn = "onlineBanking.Dashboard.GetStartedBtn";
	private String buyLoad = "onlineBanking.Dashboard.BuyLoadLink";
	private String MBBSection = "onlineBanking.Dashboard.MBBSection";
	private String Dashboard = "onlineBanking.HomePage.DashboardLink";
	private String PopUp = "onlineBanking.Dashboard.PopUp";
	private String CloseBtn = "onlineBanking.Dashboard.CloseBtn";


	public void clickSendReceive() throws Throwable {
		Wait.forSeconds(10000);
		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") )
		{
			Wait.forSeconds(15000);
		}
		click.elementBy(SendReceive);
	}

	public void clickFX() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(fx);
		Wait.forSeconds(2000);
	}

	public void clickAccountsManageBtn() throws Throwable {
		Wait.forSeconds(5000);
		click.elementBy(AccountsManageBtn);
	}

	public void clickAddExistingAccount() throws Throwable {
		click.elementBy(AddAccounts);
		Wait.forSeconds(2000);
		click.elementBy(AddExistingAccounts);
	}

	public void clickUITFAccount() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(UITFAccount);
	}

	public void verifyRecentTransacLbl_ViewMoreBtn() throws Throwable {
		Wait.forSeconds(2000);
		verify.elementIsEnabled(recentTransactionLbl);
		verify.elementIsEnabled(viewMoreBtn);
	}

	public void verifyOtherBtns_UITF() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(viewMoreBtn);
		verify.elementIsEnabled(UITFAllBtn);
		verify.elementIsEnabled(SubscriptionsBtn);
		verify.elementIsEnabled(RedemptionsBtn);
		verify.elementIsEnabled(TransacHisLbl);
	}

	public void clickSubsProduct() throws Throwable {
		Wait.forSeconds(4000);
		click.elementBy(SubscriptionProduct);
	}

	public void clickRedempProduct() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(RedemptionProduct);
	}

	public void verifySubsDetails() throws Throwable {

		Wait.forSeconds(2000);

		if(Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac") ) {
			verify.elementISPresent_MacSafari(ReferenceNo);
			verify.elementISPresent_MacSafari(TransactionDate);
			verify.elementISPresent_MacSafari(DescriptionSubs);
			verify.elementISPresent_MacSafari(SubscriptionAmt);
			verify.elementISPresent_MacSafari(SettlementDate);
		}
		else{
			verify.elementIsPresent(ReferenceNo);
			verify.elementIsPresent(TransactionDate);
			verify.elementIsPresent(DescriptionSubs);
			verify.elementIsPresent(SubscriptionAmt);
			verify.elementIsPresent(SettlementDate);
		}

		Wait.forSeconds(2000);
	}

	public void verifyRedempDetails() throws Throwable {
		Wait.forSeconds(2000);
		if (Drivertype.equalsIgnoreCase("safari") && EnvironmentType.equalsIgnoreCase("mac")) {
			verify.elementISPresent_MacSafari(ReferenceNo);
			verify.elementISPresent_MacSafari(TransactionDate);
			verify.elementISPresent_MacSafari(DescriptionRedemp);
			verify.elementISPresent_MacSafari(SettlementDate);
		} else {
			verify.elementIsPresent(ReferenceNo);
			verify.elementIsPresent(TransactionDate);
			verify.elementIsPresent(DescriptionRedemp);
			verify.elementIsPresent(SettlementDate);
		}
	}

	public void clickUITFElement() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(UITFElement);
	}

	public void clickUITFLink() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(UITFLink);
		Wait.forSeconds(3000);
	}

	public void clickGetStartedBtn() throws Throwable {
		Wait.forSeconds(1000);
		click.elementBy(GetStartedBtn);
	}

	public void clickBuyloadLink() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(buyLoad);
	}

	public void clickMBBSection() throws Throwable {
		Wait.forSeconds(2000);
		verify.IfElementExists(MBBSection);
		click.elementBy(MBBSection);
	}

	public void clickClose_Popup() throws Throwable {
		try{
			if(PopUp!=null)
			{
				Wait.forSeconds(4000);
				jsClick.elementBy(CloseBtn);
			}
		}
		catch (ApplicationException e) {
			e.printStackTrace();
		}
	}
}
