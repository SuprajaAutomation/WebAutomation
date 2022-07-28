package pages;

import actions.Wait;
import base.Keywords;
import helper.Tools;

public class BackOffice_BillerPage extends Keywords {

	private String Keybtnsearchicon="onlineBanking.backoffice.billers.btnsearchbiller";
	private String KeySubmit="onlineBanking.backoffice.profile.btnSubmit";
	private String Keymanagebiller="onlineBanking.backoffice.billers.lblmamagebiller";
	private String Keysearchbiller="onlineBanking.backoffice.billers.txtsearchbiller";
	private String Keysearchbillericon="onlineBanking.backoffice.billers.btnsearchbiller";
	private String KeybillerIDverify="onlineBanking.backoffice.billers.txtbillerID";
	private String KeybillerCodeverify="onlineBanking.backoffice.billers.txtbillerCode";
	private String Keybillernameverify="onlineBanking.backoffice.billers.txtbillername";
	private String KeyAccountnumbermanagebillerverify="onlineBanking.backoffice.billers.txtAccountnumbermanagebiller";
	private String KeyAddnewbiller="onlineBanking.backoffice.billers.btnAddnewbiller";
	private String Keybillertype="onlineBanking.backoffice.billers.lblbillertype";
	private String KeyBillername="onlineBanking.backoffice.billers.txtBillername";
	private String KeyBillercode="onlineBanking.backoffice.billers.txtBillercode";
	private String KeyAccountnumber="onlineBanking.backoffice.billers.txtAccountnumber";
	private String KeyBillerid="onlineBanking.backoffice.billers.txtBillerid";
	private String Keyorder="onlineBanking.backoffice.billers.txtorder";
	private String Keyfieldname="onlineBanking.backoffice.billers.txtfieldname";
	private String KeyFieldtype="onlineBanking.backoffice.billers.txtFieldtype";
	private String Keyreview="onlineBanking.backoffice.billers.btnreview";
	private String KeybillerApprove="onlineBanking.backoffice.billers.btnApprove";
	private String KeybillerDisApprove="onlineBanking.backoffice.billers.btnDisApprove";
	private String KeybillerNext="onlineBanking.backoffice.billers.btnNext";
	private String KeyFieldtypetext="onlineBanking.backoffice.billers.txtFieldtypetext";
	private String Keymax="onlineBanking.backoffice.billers.txtmax";
	private String KeySubmitbutton="onlineBanking.backoffice.billers.txtSubmitbutton";
	private String Keybillsapprval="onlineBanking.backoffice.billers.lnkbillsapprval";
	private String KeyApprove="onlineBanking.backoffice.billers.btnApprove";
	private String KeyDisApprove="onlineBanking.backoffice.billers.btnDisApprove";
	private String Keybillermore="onlineBanking.backoffice.billers.txtbillermore";
	private String Keybillerdelete="onlineBanking.backoffice.billers.txtbillerdelete";
	private String Keybillerdeletereason="onlineBanking.backoffice.billers.txtbillerdeletereason";
	private String Keybillerdeletebtn="onlineBanking.backoffice.billers.btnbillerdelete";
	private String Keybillereditbtn="onlineBanking.backoffice.billers.txtbilleredit";
	private String Keybillerupdatereason="onlineBanking.backoffice.billers.txtbillerupdatereason";
	private String Keybillercancel="onlineBanking.backoffice.billers.btnCancel";
	private String Keybillercancelrequesst="onlineBanking.backoffice.billers.btnCancelRequest";
	private String Keybilerview="onlineBanking.backoffice.billers.txtbillerview";
	private String Keybillertypeverifyview="onlineBanking.backoffice.billers.txtbillertyprview";
	private String KeybillerCodeverifyview="onlineBanking.backoffice.billers.txtbillercodeview";
	private String Keybilleacctnumberverifyview="onlineBanking.backoffice.billers.txtbillerAccountnumberview";
	private String Keybillernameverifyview="onlineBanking.backoffice.billers.txtbillerIDview";
	public static String Billername;
	public static String Billercode;
	public static String BillerAccountnumber;
	public static String BillerID;

	public void clickManagebillerlink() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(Keymanagebiller);
	}

	public void enterSearchbiller(String Billersearch) throws Throwable {
		Wait.forSeconds(2000);
		type.data(Keysearchbiller,Billersearch );
	}
	public void clickSearchbillericon() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(Keysearchbillericon);
	}


	public void verifyBillerdetails(String Billerid,String Billercode,String Billername,String Billeracctnumber) throws Throwable {
		Wait.forSeconds(2000);
		verify.elementTextMatching(KeybillerIDverify,Billerid);
		verify.elementTextMatching(KeybillerCodeverify,Billercode);
		verify.elementTextMatching(Keybillernameverify,Billername);
		//verify.elementTextMatching(KeyAccountnumbermanagebillerverify,Billeracctnumber);
	}

	public void entertheBillerdetails() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(KeyAddnewbiller);

		Billername=Tools.RANDOMTEXT("RANDOMTEXT",5);
		type.data(KeyBillername, Billername);
		Billercode=Tools.RANDOMTEXT("RANDOMNUMBER",5);
		type.data(KeyBillercode,Billercode );
		BillerAccountnumber=Tools.RANDOMTEXT("RANDOMNUMBER",10);
		type.data(KeyAccountnumber,BillerAccountnumber );
		BillerID=Tools.RANDOMTEXT("RANDOMNUMBER",3);
		type.data(KeyBillerid, BillerID);
		click.elementBy(KeybillerNext);
		type.data(Keyorder, Tools.RANDOMTEXT("RANDOMNUMBER",2));
		type.data(Keyfieldname, "Billerdetails");
		click.elementBy(Keybillertype);
		click.elementBy(KeyFieldtypetext);
		type.data(Keymax, "20");
		click.elementBy(Keyreview);
		click.elementBy(KeySubmitbutton);


	}
	public void clicktheBillsapprval () throws Throwable {
		click.elementBy(Keybillsapprval);
	}
	public void clicktheApprval () throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		click.elementBy(KeyApprove);
	}
	public void clicktheDisApprval() throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		click.elementBy(KeyDisApprove);
	}
	public void clicktheBillermore() throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		click.elementBy(Keybillermore);
	}
	public void clicktheBillerdelete() throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		Wait.forSeconds(2000);
		click.elementBy(Keybillerdelete);
		Wait.forSeconds(2000);
		click.elementBy(Keybillerdeletereason);
		click.elementBy(Keybillerdeletebtn);
	}
	public void updatetheBillerdetails() throws Throwable {
		Wait.forSeconds(2000);
		click.elementBy(Keybillereditbtn);
//		Billername=Tools.RANDOMTEXT("RANDOMTEXT",10);
//		Wait.forSeconds(2000);
//		type.data(KeyBillername, Billername);
		Billercode=Tools.RANDOMTEXT("RANDOMNUMBER",5);
		type.data(KeyBillercode,Billercode );
		click.elementBy(KeybillerNext);
		Wait.forSeconds(5000);
		click.elementBy(Keyreview);
		type.data(Keybillerupdatereason,"Updatereason");
		click.elementBy(KeySubmitbutton);
		Wait.forSeconds(5000);
	}
	public void verifUpdateBillerdetails(String Billername) throws Throwable {
		Wait.forSeconds(5000);
		verify.elementTextMatching(KeybillerCodeverify,Billername);
		//verify.elementTextMatching(KeyAccountnumbermanagebillerverify,Billeracctnumber);
	}
	public void clicktheCancel() throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		click.elementBy(Keybillercancel);
	}
	public void clicktheCancelrequest() throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		click.elementBy(Keybillercancelrequesst);
	}

	public void clicktheViewbutton() throws Throwable {
		//KeyApprove= "//*[text()="+"'"+BillerID+"'"+"]"+KeyApprove;
		click.elementBy(Keybilerview);
	}
	public void verifyBillerdetailsview(String Billertype,String Billercode,String Billeracctnumber,String Billername) throws Throwable {
		Wait.forSeconds(2000);
		verify.elementTextMatching(Keybillertypeverifyview,Billertype);
		verify.elementTextMatching(KeybillerCodeverifyview,Billercode);
		verify.elementTextMatching(Keybilleacctnumberverifyview,Billeracctnumber);
		//verify.elementTextMatching(Keybillernameverifyview,Billername);
	}
}

