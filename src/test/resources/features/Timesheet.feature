# Author : LN


@Timesheetlogin
Feature: Timesheet login Validation

  Scenario: Timesheetfill
    Given User launch Timesheet url
    When User Type loginusername
    And User Type loginpassword
    And User Click loginurl
    Then Timesheet application should login successfully.
      Given User click Timesheet
      When User select Project page display
      And User select Timesheet entry
      And user click Send for approval
      Then Timesheet entry should be added



