package stepdefinitions;


import actions.Wait;
import base.Keywords;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.EnvironmentException;
import helper.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

public class TimesheetBD {

       private final Timesheetloginpage timepage = new Timesheetloginpage();

    @Given("^User launch Timesheet url$")
    public void user_launch_Timesheet_url() throws Throwable {

    }

    @When("^User Type loginusername$")
    public void user_Type_loginusername() throws Throwable {
    timepage.loginusername(PropertyReader.testDataOf("TSloginname").trim());
    }

    @When("^User Type loginpassword$")
    public void user_Type_loginpassword() throws Throwable {
        timepage.loginpassword(PropertyReader.testDataOf("TSpassword").trim());
    }

    @When("^User Click loginurl$")
    public void user_Click_loginurl() throws Throwable {
        timepage.loginurl();

    }

    @Then("^Timesheet application should login successfully\\.$")
    public void timesheet_application_should_login_successfully() throws Throwable {

    }

    @Given("^User click Timesheet$")
    public void user_click_Timesheet() throws Throwable {
        timepage.Timesheetclick();
    }

    @When("^User select Project page display$")
    public void user_select_Project_page_display() throws Throwable {

    }

    @When("^User select Timesheet entry$")
    public void user_select_Timesheet_entry() throws Throwable {
    }

    @When("^user click Send for approval$")
    public void user_click_Send_for_approval() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Timesheet entry should be added$")
    public void timesheet_entry_should_be_added() throws Throwable {

    }


}