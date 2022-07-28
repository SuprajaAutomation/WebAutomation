package pages;

import actions.Click;
import actions.Wait;
import base.Keywords;
import com.github.javafaker.App;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Timesheetloginpage extends Keywords
{

    private String loginusername = "Timesheet.login.textboxUsername";
    private String loginpassword = "Timesheet.login.textboxPassword";
    private String loginurl = "Timesheet.login.btnSignup";

    private String Timesheetentryurl = "Timesheetentry.login.dropdown";


    public void loginusername(String TSloginname) throws ApplicationException
    {
        Wait.forSeconds(1000);
        type.data(loginusername, TSloginname);

    }



    public void loginpassword(String TSpassword) throws ApplicationException
    {
        Wait.forSeconds(1000);
        type.data(loginpassword, TSpassword);
    }

    public void loginurl() throws ApplicationException
    {
        Wait.forSeconds(1000);
       click.elementBy(loginurl);
        Wait.forSeconds(5000);
    }

    public void Timesheetclick() throws ApplicationException
    {
        Wait.forSeconds(1000);
        jsClick.elementBy(Timesheetentryurl);
        Wait.forSeconds(20000);
    }


}
