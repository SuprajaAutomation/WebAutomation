# Author: Sundaresan Jeyamani
# Functionality: Login page validation
# Jira ID: ?
# Jira URL: ?

 @Login @RegressionNew
Feature: Login Page Validation

 #TS075
  @Login1
  Scenario: Validation of Login functionality with valid and Invalid inputs
    Given I'm on login page of UB online banking application with user "cbautotest1" otp "111111"
    When I click the Send/Receive Money
    Then I click the Other banks or Ewallet
    And I click the Pesonet link
    And I click the from account number
    Then I Verify the "Union Bank of Philippines" is not displayed in listbox
    And I Click the Logout Button

  #@Login2
  #Scenario: Validation of creation of BRM user role
   # Given I'm click the register button in the backoffice application
    #When I enter the firstname lastname and user creation "BRM" details
    #Then I Login with user "UBPSAC1" and approve the user
    #Then I Login with user "UBPSAC2" and second approve the user
    #And I Login with new BRM user and logout