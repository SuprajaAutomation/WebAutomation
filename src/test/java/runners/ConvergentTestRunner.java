package runners;

import base.Test;
import constants.Browsername;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import exceptions.EnvironmentException;
import helper.PropertyReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:","pretty","json:target/json-output/Automation-Summary.json"},
        //dryRun = true,
        //tags={"@B01"}
        tags={"@Timesheetlogin"}
)

public class ConvergentTestRunner extends Test {
    @BeforeClass
    public static void initialize() throws EnvironmentException{
        String Drivertype=PropertyReader.valueOf("Driver.Drivertype").trim();
        if(Drivertype==null){
            Drivertype= Browsername.CHROME;
        }
        setup();
    }

    @AfterClass
    public static void flush(){
        teardown();
    }
}

