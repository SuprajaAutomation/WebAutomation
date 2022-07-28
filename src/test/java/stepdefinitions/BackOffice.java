package stepdefinitions;


import actions.Wait;
import base.Keywords;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import gherkin.lexer.Th;
import helper.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class BackOffice {

    private LoginPage login = new LoginPage();
    private BackOffice_HomePage homePage = new BackOffice_HomePage();
    private BackOffice_AccountsPage accountsPage = new BackOffice_AccountsPage();
    private BackOffice_AccountsSearchPage accountsSearchPage = new BackOffice_AccountsSearchPage();
    private BackOffice_CustomerInformationPage customerInformationPage = new BackOffice_CustomerInformationPage();
    private CommonMethodsPage commonMethods =  new CommonMethodsPage();
    private BackOffice_InvalidSignUpsPage invalidSignUpsPage = new BackOffice_InvalidSignUpsPage();
    private BackOffice_UsersPage usersPage=new BackOffice_UsersPage();
    private BackOffice_ScheduledActivitiesPage scheduledActivitiesPage = new BackOffice_ScheduledActivitiesPage();
    private BackOffice_RegisterPage RegisterPage = new BackOffice_RegisterPage();
    private BackOffice_PushNotificationPage pushNotificationPage = new BackOffice_PushNotificationPage();
    private BackOffice_QRMaker qrMakerPage = new BackOffice_QRMaker();
    private BackOffice_FAQ faqPage = new BackOffice_FAQ();

    private BackOffice_BillerPage BillerPage = new BackOffice_BillerPage();
    WebDriver driver;
    WebElement element;

    @Given("^I am on login page of online banking backoffice application as SubhaBrm user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_SubhaBrm_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername1").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as Subha user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_Subha_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername2").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPProductAuto1 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPProductAuto1_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername3").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPProductAuto2 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPProductAuto2_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername6").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPSAC1 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPSAC1_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername4").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPSAC2 user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPSAC2_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername5").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Given("^I am on login page of online banking backoffice application as UBPQRMakerAuto user$")
    public void I_am_on_login_page_of_online_banking_backoffice_application_as_UBPQRMakerAuto_user() throws Throwable {
        login.enterBOUserName(PropertyReader.testDataOf("BOUsername7").trim());
        login.enterBOPassword(PropertyReader.testDataOf("BOpassword").trim());
        login.enterBOLogin();
    }

    @Then("^I successfully logout by clicking the Logout Button$")
    public void I_successfully_logout_by_clicking_the_Logout_Button() throws Throwable {
        homePage.clickAccounts();
        homePage.clickLogoutBtn();
    }

    @When("^When I click on the accounts tab$")
    public void When_I_click_on_the_accounts_tab() throws Throwable{
        homePage.clickAccounts();
    }

    @When("^I click on the manage clients tab$")
    public void I_click_on_the_manage_clients_tab() throws Throwable {
        homePage.clickAccounts();
        accountsPage.clickManageClients();
    }

    @When("^I search for first name as \"([^\"]*)\"$")
    public void I_search_for_first_name_as(String firstName) throws Throwable {
        accountsSearchPage.searchFirstname(firstName);
    }

    @Then("^I verify the list of users related to search$")
    public void I_verify_the_list_of_users_related_to_search() throws Throwable {
        accountsSearchPage.verifyActiveUser();
    }

    @When("^I search for last name as \"([^\"]*)\"$")
    public void I_search_for_last_name_as(String lastName) throws Throwable{
        accountsSearchPage.searchLastName(lastName);
    }

    @When("^I search for mobileNumber as \"([^\"]*)\"$")
    public void I_search_for_mobileNumber_as(String mobileNumber)throws Throwable {
        accountsSearchPage.searchMobileNumber(mobileNumber);
    }

    @When("^I search for emailID as \"([^\"]*)\"$")
    public void I_search_for_emailID_as(String emailID)throws Throwable {
        accountsSearchPage.searchEmailID(emailID);
    }

    @When("^I search for accountNumber as \"([^\"]*)\"$")
    public void I_search_for_accountNumber_as(String accountNumber)throws Throwable {
        accountsSearchPage.searchAccountNumber(accountNumber);
    }

    @When("^I search for invalidAccountNumber as \"([^\"]*)\"$")
    public void I_search_for_invalidAccountNumber_as(String invalidAccNum)throws Throwable {
        accountsSearchPage.searchinvalidAccNum(invalidAccNum);
    }

    @Then("^I verify no list of users$")
    public void I_verify_no_list_of_users()throws Throwable {
        accountsSearchPage.verifyNoActiveUser();
    }

    @When("^I click on the active user$")
    public void I_click_on_the_active_user() throws Throwable {
        accountsSearchPage.clickActiveUser();
    }

    @Then("^I click active account in customer information page$")
    public void I_click_active_account_in_customer_information_page() throws Throwable {
        customerInformationPage.clickActiveAccount();
    }

    @Then("^I verify view transfer logs and click one of the logs$")
    public void I_verify_view_transfer_logs_and_click_one_of_the_logs() throws Throwable {
        customerInformationPage.verifyAndClickFundTransferLog();
    }

    @Then("^I Verify and click the Email, SMS, Email and SMS buttons$")
    public void I_Verify_and_click_the_Email_SMS_Email_and_SMS_buttons() throws Throwable {
        customerInformationPage.verifyAndClickEmail();
        commonMethods.clickNoBtn();
        customerInformationPage.verifyAndClickEmail_SMS();
        commonMethods.clickNoBtn();
        customerInformationPage.verifyAndClickSMS();
        commonMethods.clickNoBtn();
        commonMethods.clickCloseBtn2();
        commonMethods.clickCloseBtn1();
    }

    @Then("^I verify Bills paid logs and click one of the logs$")
    public void I_verify_Bills_paid_logs_and_click_one_of_the_logs() throws Throwable {
        customerInformationPage.verifyAndClickBillsPaidLog();
    }

    @Then("^I verify load purchase logs and click one of the logs$")
    public void I_verify_load_purchase_logs_and_click_one_of_the_logs() throws Throwable {
        customerInformationPage.verifyAndClickLoadPurchaseRequest();
    }

    @When("^I click on the manage Invalid SignUps tab$")
    public void I_click_on_the_manage_Invalid_SignUps_tab() throws Throwable {
        homePage.clickAccounts();
        accountsPage.clickInvalidSignUpsTab();
    }

    @And("^I select Add FAQ Type as \"([^\"]*)\"$")
    public void I_select_Add_FAQ_Type_as(String data) throws Throwable {
        invalidSignUpsPage.selectFAQType(data);
    }

    @And("^I enter \"([^\"]*)\" in search text and click search button$")
    public void I_enter_in_search_text_and_click_search_button(String arg1) throws Throwable {
        invalidSignUpsPage.enterinSearchText(arg1);
    }

    @Then("^I verify Invalid signup search results$")
    public void I_verify_Invalid_signup_search_results() throws Throwable {
        invalidSignUpsPage.verifySearchResults();
    }

    @And("^I select CIF type as \"([^\"]*)\" and click search button$")
    public void I_select_CIF_type_as_and_click_search_button(String data) throws Throwable {
        invalidSignUpsPage.selectCIFType(data);
    }

    @And("^I verify customer Information Title$")
    public void I_verify_customer_Information_Title() throws Throwable {
        customerInformationPage.verifyTtile();
    }

    @And("^I click customer information Deactivate button$")
    public void I_click_customer_information_Deactivate_button() throws Throwable {
        customerInformationPage.clickDeactivateBtn();
    }

    @And("^I click manage profile changes for approval$")
    public void I_click_manage_profile_changes_for_approval() throws Throwable {
        customerInformationPage.clickProfileManagesForApprovalLink();
    }

    @And("^I click users cancel for \"([^\"]*)\"$")
    public void I_click_users_cancel_for(String data) throws Throwable {
        usersPage.clickUsersCancel();
    }

    @And("^I enter cancel reason as \"([^\"]*)\" and click confirm cancel button$")
    public void I_enter_cancel_reason_as_and_click_confirm_cancel_button(String reason) throws Throwable {
            usersPage.enterCancelReason(reason);
            usersPage.clickConfirmCancelBtn();
    }

    @And("^I verify customer information Deactivate button$")
    public void I_verify_customer_information_Deactivate_button() throws Throwable {
        customerInformationPage.verifyDeactivateBtn();
    }

    @And("^I enter deactivate reason as \"([^\"]*)\" and click confirm deactivate button$")
    public void I_enter_deactivate_reason_as_and_click_confirm_deactivate_button(String reason) throws Throwable {
      usersPage.enterCancelReason(reason);
        customerInformationPage.clickConfirmDeactivateBtn();
    }

    @When("^I click on the accounts tab$")
    public void I_click_on_the_accounts_tab() throws Throwable {
        homePage.clickAccounts();
    }

    @And("^I click users dispprove for \"([^\"]*)\"$")
        public void I_click_users_dispprove_for(String data) throws Throwable {
        usersPage.clickUsersDispprove();
    }

    @And("^I enter disapprove reason as \"([^\"]*)\" and click confirm disapprove button$")
    public void I_enter_disapprove_reason_as_and_click_confirm_disapprove_button(String reason) throws Throwable {
        usersPage.enterCancelReason(reason);
        usersPage.clickConfirmDisapproveBtn();
    }

    @And("^I click on customer information Edit profile button$")
    public void I_click_on_customer_information_Edit_profile_button() throws Throwable {
        customerInformationPage.clickEditProfileBtn();
    }

    @And("^I edit customer last name as \"([^\"]*)\"$")
    public void I_edit_customer_last_name_as(String data) throws Throwable {
        customerInformationPage.enterLastName(data);
    }

    @And("^I click the edit user ID update button$")
    public void I_click_the_edit_user_ID_update_button() throws Throwable {
        customerInformationPage.clickKeyEditUSerIDUpdateBtn();
    }

    @And("^I enter edit reason as \"([^\"]*)\" and click on Save button$")
    public void I_enter_edit_reason_as_and_click_on_Save_button(String data) throws Throwable {
        customerInformationPage.enterCustoInfoApprovalReason(data);
        commonMethods.clickSaveBtn();
    }

    @And("^I click users approve for \"([^\"]*)\"$")
    public void I_click_users_approve_for(String data) throws Throwable {
        usersPage.clickUsersApprove();
    }

    @And("^I click users approve for User ID \"([^\"]*)\"$")
    public void I_click_users_approve_for_User_ID(String data) throws Throwable {
        usersPage.clickUsersApproveForID();
    }

    @And("^I enter approve reason as \"([^\"]*)\" and click confirm approve button$")
    public void I_enter_approve_reason_as_and_click_confirm_approve_button(String data) throws Throwable {
        //customerInformationPage.enterCustoInfoApprovalReason(data);
       usersPage.enterCancelReason(data);
       usersPage.clickUsersApprovalApprove();
    }

    @And("^I click on customer information Edit UserID button$")
    public void I_click_on_customer_information_Edit_UserID_button() throws Throwable {
        customerInformationPage.clickEditUserIDBtn();
    }

    @And("^I edit userID as \"([^\"]*)\"$")
    public void I_edit_userID_as(String data) throws Throwable {
        customerInformationPage.enterEditUserIDtxt(data);
    }

    @And("^I click manage User ID changes for approval$")
    public void I_click_manage_User_ID_changes_for_approval() throws Throwable {
        accountsPage.clickManageUSerIDForApproval();
    }

    @And("^I click customer information activate button$")
    public void I_click_customer_information_activate_button() throws Throwable {
        customerInformationPage.clickActivateBtn();
    }

    @And("^I enter activate reason as \"([^\"]*)\" and click confirm activate button$")
    public void I_enter_activate_reason_as_and_click_confirm_activate_button(String reason) throws Throwable {
        usersPage.enterCancelReason(reason);
        customerInformationPage.clickConfirmActivateBtn();
    }

    @When("^I click on the Scheduled Activities Link$")
    public void I_click_on_the_Scheduled_Activities_Link() throws Throwable {
        homePage.clickScheduledActivities();
    }

    @And("^I click on the Failed scheduled Fund Transfer search Link$")
    public void I_click_on_the_Failed_scheduled_Fund_Transfer_search_Link() throws Throwable {
        scheduledActivitiesPage.clickFailedScheduledFundTransfer();
    }

    @And("^I click on the Failed scheduled Bills Payment search Link$")
    public void I_click_on_the_Failed_scheduled_Bills_Payment_search_Link() throws Throwable {
        scheduledActivitiesPage.clickFailedScheduledBillsPayment();
    }

    @And("^I select transaction type as \"([^\"]*)\" and click search button$")
    public void I_select_transaction_type_as_and_click_search_button(String data) throws Throwable {
        scheduledActivitiesPage.clickFailedScheduledBillsPaymentSearch(data);
    }

    @Then("^I verify DailyID,AccountNumbers,Transaction,Message,Status,Action$")
    public void I_verify_DailyID_AccountNumbers_Transaction_Message_Status_Action() throws Throwable {
        scheduledActivitiesPage.verifyFailedScheduledElements();
    }

    @Then("^I verify Source account as no records found \"([^\"]*)\"$")
    public void I_verify_Source_account_as_no_records_found(String data) throws Throwable{
        scheduledActivitiesPage.verifyNoRecordsFound(data);
    }

    @Given("^I'm click the register button in the backoffice application$")
    public void iMClickTheRegisterButtonInTheBackofficeApplication() throws Throwable {
        homePage.clickRegister();
    }

    @When("^I enter the firstname lastname and user creation \"([^\"]*)\" details$")
    public void iEnterTheFirstnameLastnameAndUserCreationDetails(String arg0) throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickUserSAC();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
        //login.enterBOUserName(RegisterPage.Username);
    }

    @Then("^I launch the application$")
    public void iLaunchTheApplication() throws EnvironmentException {
        Keywords.launchApplication();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user$")
    public void iLoginWithUserAndApproveTheUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickSACEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user$")
    public void iLoginWithUserAndSecondApproveTheUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickSACApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @And("^I Login with new BRM user and logout$")
    public void iLoginWithNewBRMUserAndLogout() throws Throwable {

        login.enterBOUserName(RegisterPage.Username);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickLogout();

    }

    @And("^I select source type as \"([^\"]*)\",Enter text as \"([^\"]*)\" and click Search button$")
    public void I_select_source_type_as_Enter_text_as_ferwew_and_click_Search_button(String data,String text) throws Throwable {
        scheduledActivitiesPage.selectSearch1EnterSearchTxtClickSearchBtn(data,text);
    }

    @And("^I select source type as \"([^\"]*)\"$")
    public void I_select_source_type_as(String data)throws Throwable{
        scheduledActivitiesPage.selectSearch1(data);
    }


    @When("^I enter the firstname lastname and user creation SAC details$")
    public void iEnterTheFirstnameLastnameAndUserCreationSACDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickUserSAC();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @When("^I enter the firstname lastname and user creation CEG Team Lead details$")
    public void iEnterTheFirstnameLastnameAndUserCreationCEGTeamLeadDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickCEGTeamLead();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();

    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user SAC$")
    public void iLoginWithUserAndApproveTheUserSAC(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickSACEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user SAC$")
    public void iLoginWithUserAndSecondApproveTheUserSAC(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickSACApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user CEG Team Lead$")
    public void iLoginWithUserAndApproveTheUserCEGTeamLead(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickCEGTeamLeadEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user CEG Team Lead$")
    public void iLoginWithUserAndSecondApproveTheUserCEGTeamLead(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickCEGTeamLeadApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @When("^I enter the firstname lastname and user creation CEG Agent role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationCEGAgentRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickCEGAgentrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user CEG Agent role$")
    public void iLoginWithUserAndApproveTheUserCEGAgentRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickCEGAgentEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user CEG Agent role$")
    public void iLoginWithUserAndSecondApproveTheUserCEGAgentRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickCEGAgentApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @When("^I enter the firstname lastname and user creation AFU role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationAFURoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickAFUrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user AFU role$")
    public void iLoginWithUserAndApproveTheUserAFURole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickAFUEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user AFU role$")
    public void iLoginWithUserAndSecondApproveTheUserAFURole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickAFUApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @When("^I enter the firstname lastname and user creation Bills Pay Innovation role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationBillsPayInnovationRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickBillsPayInnovationrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user Bills Pay Innovation role$")
    public void iLoginWithUserAndApproveTheUserBillsPayInnovationRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickBillsPayInnovationEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user Bills Pay Innovation role$")
    public void iLoginWithUserAndSecondApproveTheUserBillsPayInnovationRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickBillsPayInnovationApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }


    @And("^I Login with new \"([^\"]*)\" user and logout$")
    public void iLoginWithNewUserAndLogout(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(RegisterPage.Username);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickLogout();
    }

    @When("^I enter the firstname lastname and user creation Help Desk role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationHelpDeskRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickHelpdeskrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }


    @Then("^I Login with user \"([^\"]*)\" and approve the user Help Desk role$")
    public void iLoginWithUserAndApproveTheUserHelpDeskRole(String arg0) throws Throwable {
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickHelpdeskEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();

    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user Help Desk role$")
    public void iLoginWithUserAndSecondApproveTheUserHelpDeskRole(String arg0) throws Throwable {
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickHelpdeskApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();

    }

    @When("^I enter the firstname lastname and user creation App Support  role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationAppSupportRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickAppsupportrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user App Support  role$")
    public void iLoginWithUserAndApproveTheUserAppSupportRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickAppsupportEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user App Support  role$")
    public void iLoginWithUserAndSecondApproveTheUserAppSupportRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickAppsupportApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @When("^I enter the firstname lastname and user creation Union Bank Online Product  role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationUnionBankOnlineProductRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickUnionBankOnlineProductrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user Union Bank Online Product  role$")
    public void iLoginWithUserAndApproveTheUserUnionBankOnlineProductRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickUnionBankOnlineProductEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user Union Bank Online Product  role$")
    public void iLoginWithUserAndSecondApproveTheUserUnionBankOnlineProductRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickUnionBankOnlineProductApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @When("^I enter the firstname lastname and user creation QR Maker  role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationQRMakerRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickQRMakerrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user QR Maker role$")
    public void iLoginWithUserAndApproveTheUserQRMakerRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickQRMakerEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user QR Maker  role$")
    public void iLoginWithUserAndSecondApproveTheUserQRMakerRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickQRMakerApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user SAC$")
    public void iLoginWithUserAndDisapproveTheUserSAC(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickSACDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();

    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user CEG Team Lead$")
    public void iLoginWithUserAndDisapproveTheUserCEGTeamLead(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickCEGTeamLeadDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user CEG Agent role$")
    public void iLoginWithUserAndDisapproveTheUserCEGAgentRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickCEGAgentDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user AFU role$")
    public void iLoginWithUserAndDisapproveTheUserAFURole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickAFUDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user QR Maker role$")
    public void iLoginWithUserAndDisapproveTheUserQRMakerRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickQRMakerDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user Bills Pay Innovation role$")
    public void iLoginWithUserAndDisapproveTheUserBillsPayInnovationRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickBillsPayInnovationDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user Help Desk role$")
    public void iLoginWithUserAndDisapproveTheUserHelpDeskRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickHelpDeskDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user App Support  role$")
    public void iLoginWithUserAndDisapproveTheUserAppSupportRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickAppsupportDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user Union Bank Online Product  role$")
    public void iLoginWithUserAndDisapproveTheUserUnionBankOnlineProductRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickUnionBankOnlineProductDisApprove();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @When("^I enter the firstname lastname and user creation Bills pay onboarding  role details$")
    public void iEnterTheFirstnameLastnameAndUserCreationBillsPayOnboardingRoleDetails() throws Throwable {
        RegisterPage.clickSelectUserrole();
        RegisterPage.clickBillsPayOnboardingrole();
        RegisterPage.enterFirstName();
        RegisterPage.enterLastName();
        RegisterPage.entermobilenumber();
        RegisterPage.entermailid();
        RegisterPage.enterusername();
        RegisterPage.enterpassw0rd();
        RegisterPage.clickRegister();
    }

    @Then("^I Login with user \"([^\"]*)\" and Disapprove the user Bills pay onboardingProduct  role$")
    public void iLoginWithUserAndDisapproveTheUserBillsPayOnboardingProductRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickBillsPayOnboardingProduct();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @Then("^I Login with user \"([^\"]*)\" and approve the user Bills pay onboarding  role$")
    public void iLoginWithUserAndApproveTheUserBillsPayOnboardingRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickUserforapproval();
        RegisterPage.clickBillsPayOnboardingEndorse();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickEndorsebtn();
        RegisterPage.clickLogout();
    }

    @When("^I click on Send Notification$")
    public void I_click_on_Send_Notification() throws Throwable {
        homePage.clickSendNotification();
    }

    @And("^I click on Manage Notification$")
    public void I_click_on_Manage_Notification() throws Throwable {
        pushNotificationPage.clickManageNotification();
    }

    @Then("^I add a new notification and submit$")
    public void I_add_a_new_notification_and_submit() throws Throwable {
        pushNotificationPage.addNewNotification();
        commonMethods.clickSaveBtn();
    }

    @And("^I approve the notification with the reason \"([^\"]*)\"$")
    public void I_approve_the_notification(String reason) throws Throwable {
        pushNotificationPage.approveNotification(reason);
    }

    @When("^I click on manage biller$")
    public void I_click_on_manage_biller() throws Throwable {
        qrMakerPage.clickManageBiller();
    }

    @Then("^I search for the biller \"([^\"]*)\"$")
    public void I_search_for_the_biller(String name) throws Throwable {
        qrMakerPage.searchBiller(name);
    }

    @And("^I enter payors name \"([^\"]*)\", pin \"([^\"]*)\" and generate QR code$")
    public void I_enter_payors_name_pin_and_generate_QR_code(String name, String pin) throws Throwable {
        qrMakerPage.EnterDetailsAndGenerateQR(name,pin);
    }

    @And("^I cancel the QR maker$")
    public void I_cancel_the_QR_maker() throws Throwable {
        qrMakerPage.cancelQRMaker();
    }

    @When("^I click the link for FAQ$")
    public void I_click_the_link_for_FAQ() throws Throwable {
        homePage.clickFAQ();
    }

    @And("^I click the manage FAQ$")
    public void I_click_the_manage_FAQ() throws Throwable {
        faqPage.clickManageFAQ();
    }

    @And("^I add FAQ type as \"([^\"]*)\" and submit$")
    public void I_add_FAQ_type_as_and_submit(String type) throws Throwable {
        faqPage.addFAQ(type);
        faqPage.submitFAQ();
    }

    @Then("^I approve the FAQ$")
    public void I_approve_the_FAQ() throws Throwable {
        faqPage.approveFAQ();
    }

    @Then("^I disapprove the FAQ$")
    public void I_disapprove_the_FAQ() throws Throwable {
        faqPage.disapproveFAQ();
    }

    @And("^I edit the FAQ$")
    public void I_edit_the_FAQ() throws Throwable {
        faqPage.editFAQ();
    }

    @And("^I verify the edited FAQ$")
    public void I_verify_the_edited_FAQ() throws Throwable {
        faqPage.verifyEditedFAQ();
    }

    @Then("^I delete the FAQ$")
    public void I_delete_the_FAQ() throws Throwable {
        faqPage.deleteFAQ();
    }

    @Given("^Login with user \"([^\"]*)\"$")
    public void loginWithUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
    }

    @When("^I search the client user id \"([^\"]*)\"$")
    public void iSearchTheClientUserId(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RegisterPage.clickManageclients();
        RegisterPage.enterUserprofilename(arg0);
        RegisterPage.clickSearchicon();
    }

    @Then("^I Click the user and Edit profile change the mobilnumber and mailid$")
    public void iClickTheUserAndEditProfileChangeTheMobilnumberAndMailid() throws Throwable {
        RegisterPage.clickUserprofilelink();
        RegisterPage.clickEditprofile();
        RegisterPage.enterMobilenumberprofile();
        RegisterPage.enterMailaddressprofile();
        RegisterPage.clickUpdatelink();
        RegisterPage.enterKeyresonforupdating();
        RegisterPage.clickSubmit();
        RegisterPage.clickLogout();
    }

    @And("^I approve the profile change user \"([^\"]*)\"$")
    public void iApproveTheProfileChangeUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickApprovalclientuser();
        RegisterPage.clickApproveuserprofile();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();


    }



    @And("^I verify the user profile changed for user \"([^\"]*)\" \"([^\"]*)\"$")
    public void iVerifyTheUserProfileChangedForUser(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickManageclients();
        RegisterPage.enterUserprofilename(arg1);
        RegisterPage.clickSearchicon();
        RegisterPage.clickUserprofilelink();
        RegisterPage.verifyUserprofilechanges();
    }

    @And("^I Disapprove the profile change user \"([^\"]*)\"$")
    public void iDisapproveTheProfileChangeUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        RegisterPage.clickApprovalclientuser();
        RegisterPage.clickDisApproveuserprofile();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @When("^I Click the Managebiller link$")
    public void iClickTheManagebillerLink() throws Throwable {
        BillerPage.clickManagebillerlink();
    }

    @Then("^I Enter the biller code \"([^\"]*)\" in biller search and click the search icon$")
    public void iEnterTheBillerCodeInBillerSearchAndClickTheSearchIcon(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BillerPage.enterSearchbiller(arg0);
        BillerPage.clickSearchbillericon();
    }

    @And("^Verify the Biller details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void verifyTheBillerDetails(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BillerPage.verifyBillerdetails(arg0,arg1,arg2,arg3);
    }

    @Then("^I Enter the biller name \"([^\"]*)\" in biller search and click the search icon$")
    public void iEnterTheBillerNameInBillerSearchAndClickTheSearchIcon(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BillerPage.enterSearchbiller(arg0);
        BillerPage.clickSearchbillericon();
    }

    @Then("^I Enter the biller account number \"([^\"]*)\" in biller search and click the search icon$")
    public void iEnterTheBillerAccountNumberInBillerSearchAndClickTheSearchIcon(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BillerPage.enterSearchbiller(arg0);
        BillerPage.clickSearchbillericon();
    }

    @Then("^I Click the New Biller and enther billerdetails an send for approval$")
    public void iClickTheNewBillerAndEntherBillerdetailsAnSendForApproval() throws Throwable {
        BillerPage.entertheBillerdetails();
        RegisterPage.clickLogout();
    }

    @And("^Approve the New biller transaction$")
    public void approveTheNewBillerTransaction() throws Throwable {
        BillerPage.clicktheBillsapprval();
        BillerPage.clicktheApprval();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();

    }



    @And("^I Verify the New biller and details user \"([^\"]*)\"$")
    public void iVerifyTheNewBillerAndDetailsUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        BillerPage.clickManagebillerlink();
        BillerPage.enterSearchbiller(BillerPage.Billercode);
        BillerPage.clickSearchbillericon();
        BillerPage.verifyBillerdetails(BillerPage.BillerID,BillerPage.Billercode,BillerPage.Billername,BillerPage.BillerAccountnumber);

    }

    @And("^Approve the the biller approval$")
    public void approveTheTheBillerApproval() throws Throwable {
        BillerPage.clicktheBillsapprval();
        BillerPage.clicktheApprval();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        RegisterPage.clickLogout();
    }

    @And("^DisApprove the the biller approval$")
    public void disapproveTheTheBillerApproval() throws Throwable {
        BillerPage.clicktheBillsapprval();
        BillerPage.clicktheDisApprval();
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickDisApprove();
    }

    @And("^I Delete the new biller$")
    public void iDeleteTheNewBiller() throws Throwable {
        BillerPage.clicktheBillermore();
        BillerPage.clicktheBillerdelete();

    }

    @And("^I Edit the biller and update details$")
    public void iEditTheBillerAndUpdateDetails() throws Throwable {
        BillerPage.updatetheBillerdetails();
        RegisterPage.clickLogout();
    }

    @And("^I Verify the updated biller and details user \"([^\"]*)\"$")
    public void iVerifyTheUpdatedBillerAndDetailsUser(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        BillerPage.clickManagebillerlink();
        Wait.forSeconds(2000);
        BillerPage.enterSearchbiller(BillerPage.Billercode);
        BillerPage.clickSearchbillericon();
        BillerPage.verifUpdateBillerdetails(BillerPage.Billercode);
    }

    @And("^Cancel the the biller approval$")
    public void cancelTheTheBillerApproval() throws Throwable {
        BillerPage.clicktheBillsapprval();
        Wait.forSeconds(2000);
        BillerPage.clicktheCancel();
        Wait.forSeconds(2000);
        BillerPage.clicktheCancelrequest();

    }

    @And("^I click the view button$")
    public void iClickTheViewButton() throws Throwable {
        BillerPage.clicktheViewbutton();
    }

    @And("^Verify the view Biller details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void verifyTheViewBillerDetails(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      BillerPage.verifyBillerdetailsview(arg0,arg1,arg2,arg3);
    }

    @Then("^I Login with user \"([^\"]*)\" and second approve the user Bills pay onboarding  role$")
    public void iLoginWithUserAndSecondApproveTheUserBillsPayOnboardingRole(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Wait.forSeconds(5000);
        login.enterBOUserName(arg0);
        login.enterBOPassword("p@55w0rd");
        login.enterBOLogin();
        Wait.forSeconds(5000);
        RegisterPage.clickUserforapproval();
        Wait.forSeconds(8000);
        RegisterPage.clickBillsPayOnboardingProductapprove();
        Wait.forSeconds(3000);
        RegisterPage.enterPleasespecifyreason();
        RegisterPage.clickApprovebtn();
        Wait.forSeconds(5000);
        RegisterPage.clickLogout();
    }
}
