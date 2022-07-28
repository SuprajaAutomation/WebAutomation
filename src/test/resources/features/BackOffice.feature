# Author: Subha
# Functionality: Backoffice validation
# Jira ID: ?
# Jira URL: ?

@BackOffice
Feature: Backoffice functionalities Validation

  @B01
  Scenario: TSB001_Validation of Manage clients tab for BRM user
    Given I am on login page of online banking backoffice application as SubhaBrm user
    When I click on the manage clients tab
    When I search for first name as "AZUCENA"
    Then I verify the list of users related to search
    When I search for last name as "DASMARINAS"
    Then I verify the list of users related to search
    When I search for mobileNumber as "9177164171"
    Then I verify the list of users related to search
    When I search for emailID as "mamsar_das@yahoo.com"
    Then I verify the list of users related to search
    When I search for accountNumber as "101190027727"
    Then I verify the list of users related to search
    When I search for invalidAccountNumber as "123456789123"
    Then I verify no list of users
    Then I successfully logout by clicking the Logout Button

   @B02
    Scenario: TSBO02_Validation of Fund transfer logs for BRM user
      Given I am on login page of online banking backoffice application as SubhaBrm user
      When I click on the manage clients tab
      When I search for first name as "cbautotest1"
      Then I verify the list of users related to search
      When I click on the active user
      Then I click active account in customer information page
      Then I verify view transfer logs and click one of the logs
      Then I Verify and click the Email, SMS, Email and SMS buttons
      Then I successfully logout by clicking the Logout Button

   @B03
      Scenario:  TSBO03_Validation of Bills paid logs for BRM user
        Given I am on login page of online banking backoffice application as SubhaBrm user
        When I click on the manage clients tab
        When I search for first name as "cbautotest1"
        Then I verify the list of users related to search
        When I click on the active user
        Then I click active account in customer information page
        Then I verify Bills paid logs and click one of the logs
        Then I Verify and click the Email, SMS, Email and SMS buttons
        Then I successfully logout by clicking the Logout Button

  @B04
      Scenario: TSBO04_Validation of Load Purchase requests for BRM user
      Given I am on login page of online banking backoffice application as SubhaBrm user
      When I click on the manage clients tab
      When I search for first name as "cbautotest1"
      Then I verify the list of users related to search
      When I click on the active user
      Then I click active account in customer information page
      Then I verify load purchase logs and click one of the logs
      Then I Verify and click the Email, SMS, Email and SMS buttons
      Then I successfully logout by clicking the Logout Button

   @B05
      Scenario: TSBO05_Validation of Invalid Signup tab for BRM user
      Given I am on login page of online banking backoffice application as SubhaBrm user
      When I click on the manage Invalid SignUps tab
      And I select Add FAQ Type as "First Name"
      And I enter "test" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "Last Name"
      And I enter "test" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "Account Number"
      And I enter "102040027529" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "Mobile No"
      And I enter "639494082075" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "CIF"
      And I enter "90011267228" in search text and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "CIF Type"
      And I select CIF type as "Finacle" and click search button
      Then I verify Invalid signup search results
      And I select Add FAQ Type as "CIF Type"
      And I select CIF type as "Card Pro" and click search button
      Then I verify Invalid signup search results

   @B06
      Scenario: TSBO06_Validation of searching client user in search bar by firstName,lastName,Mobile,Email,Account number for SSO user
        Given I am on login page of online banking backoffice application as SubhaBrm user
        When I click on the manage clients tab
        When I search for first name as "AZUCENA"
        Then I verify the list of users related to search
        When I search for first name as "DASMARINAS"
        Then I verify the list of users related to search
        When I search for first name as "9177164171"
        Then I verify the list of users related to search
        When I search for first name as "mamsar_das@yahoo.com"
        Then I verify the list of users related to search
        When I search for first name as "101190027727"
        Then I verify the list of users related to search
        Then I successfully logout by clicking the Logout Button

   @B07
      Scenario: TSBO07_Validation of Edit profile for SSO user
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "EXTERNAL"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit profile button
      And I edit customer last name as "TEST1"
      And I click the edit user ID update button
      And I enter edit reason as "Name change" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage profile changes for approval
      And I click users approve for "EXTERNAL"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button
            #Repeat steps to edit profile back to original profile
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "EXTERNAL"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit profile button
      And I edit customer last name as "TEST"
      And I click the edit user ID update button
      And I enter edit reason as "Name change" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage profile changes for approval
      And I click users approve for "EXTERNAL"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button

  @B08
    Scenario:  TSBO08_Validation of Edit User ID for SSO user
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "EXTERNAL"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit UserID button
      And I edit userID as "automationtesting2nw"
      And I click the edit user ID update button
      And I enter edit reason as "testing" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage User ID changes for approval
      And I click users approve for User ID "EXTERNAL"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button
      #Repeat steps to edit back to original ID
      Given I am on login page of online banking backoffice application as Subha user
      When I click on the manage clients tab
      When I search for first name as "EXTERNAL"
      When I click on the active user
      And I verify customer Information Title
      And I click on customer information Edit UserID button
      And I edit userID as "automationtesting2"
      And I click the edit user ID update button
      And I enter edit reason as "testing" and click on Save button
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as SubhaBrm user
      And I click manage User ID changes for approval
      And I click users approve for User ID "EXTERNAL"
      And I enter approve reason as "Please Approve" and click confirm approve button
      Then I successfully logout by clicking the Logout Button

  @B09
        Scenario:  TSBO09_Validation of Confirm approval for deactivation of user for SSO user
        Given I am on login page of online banking backoffice application as Subha user
        When I click on the manage clients tab
        When I search for first name as "EXTERNAL"
        Then I verify the list of users related to search
        When I click on the active user
        And I verify customer Information Title
        And I click customer information Deactivate button
        And I enter deactivate reason as "Testing" and click confirm deactivate button
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as SubhaBrm user
        And I click manage profile changes for approval
        And I click users approve for "EXTERNAL"
        And I enter approve reason as "Please Approve" and click confirm approve button
        Then I successfully logout by clicking the Logout Button
        #Repeat to activate
        Given I am on login page of online banking backoffice application as Subha user
        When I click on the manage clients tab
        When I search for first name as "EXTERNAL"
        Then I verify the list of users related to search
        When I click on the active user
        And I verify customer Information Title
        And I click customer information activate button
        And I enter activate reason as "Testing" and click confirm activate button
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as SubhaBrm user
        And I click manage profile changes for approval
        And I click users approve for "EXTERNAL"
        And I enter approve reason as "Please Approve" and click confirm approve button
        Then I successfully logout by clicking the Logout Button

  @B10
  Scenario: TSBO10_Validation of Confirm disapproval for deactivation of user for SSO user
    Given I am on login page of online banking backoffice application as Subha user
    When I click on the manage clients tab
    When I search for first name as "EXTERNAL"
    Then I verify the list of users related to search
    When I click on the active user
    And I verify customer Information Title
    And I click customer information Deactivate button
    And I enter deactivate reason as "Testing" and click confirm deactivate button
    Then I successfully logout by clicking the Logout Button
    Given I am on login page of online banking backoffice application as SubhaBrm user
    And I click manage profile changes for approval
    And I click users dispprove for "EXTERNAL"
    And I enter disapprove reason as "Please disApprove" and click confirm disapprove button
    Then I successfully logout by clicking the Logout Button
    #Repeat for confirmation
    Given I am on login page of online banking backoffice application as Subha user
    When I click on the manage clients tab
    When I search for first name as "EXTERNAL"
    When I click on the active user
    And I verify customer Information Title
    And I verify customer information Deactivate button

  @B11
  Scenario: TSBO11_Validation of Confirm cancel for deactivation of same user for SSO user
    Given I am on login page of online banking backoffice application as Subha user
    When I click on the manage clients tab
    When I search for first name as "EXTERNAL"
    Then I verify the list of users related to search
    When I click on the active user
    And I verify customer Information Title
    And I click customer information Deactivate button
    And I enter deactivate reason as "Testing" and click confirm deactivate button
    When I click on the accounts tab
    And I click manage profile changes for approval
    And I click users cancel for "EXTERNAL"
    And I enter cancel reason as "PleaseApprove" and click confirm cancel button
    When I click on the manage clients tab
    When I search for first name as "EXTERNAL"
    Then I verify the list of users related to search
    When I click on the active user
    And I verify customer Information Title
    And I verify customer information Deactivate button
    Then I successfully logout by clicking the Logout Button

    #TS260
#  @B12
#    Scenario: TS260_Validation Schedule Fund Transfer Valid Transaction dates
#      Given I am on login page of online banking backoffice application as UBPProductAuto1 user
#      When I click on the Scheduled Activities Link
#      And I click on the Failed scheduled Fund Transfer search Link
#      And I select transaction type as "For investigation" and click search button
#      Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#      Then I successfully logout by clicking the Logout Button

      #TS261
 @B13
  Scenario: Validation Schedule Fund Transfer InValid Transaction dates
      Given I am on login page of online banking backoffice application as UBPProductAuto1 user
      When I click on the Scheduled Activities Link
      And I click on the Failed scheduled Fund Transfer search Link
      And I select transaction type as "New" and click search button
      Then I verify Source account as no records found "No Data"
      Then I successfully logout by clicking the Logout Button

      #TS258
  @B14
      Scenario: Validation Schedule Bill Payment Invalid UserId,Account Number,Biller name and Bank Name
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click on the Scheduled Activities Link
        And I click on the Failed scheduled Fund Transfer search Link
        And I select source type as "User ID",Enter text as "ferwew" and click Search button
        Then I verify Source account as no records found "No Data"
        When I click on the Scheduled Activities Link
        And I click on the Failed scheduled Fund Transfer search Link
        And I select source type as "Source Account",Enter text as "656576856565" and click Search button
        Then I verify Source account as no records found "No Data"
        When I click on the Scheduled Activities Link
        And I click on the Failed scheduled Fund Transfer search Link
        And I select source type as "Target Bank",Enter text as "ferererer" and click Search button
        Then I verify Source account as no records found "No Data"
        Then I successfully logout by clicking the Logout Button

        #TS256
   @B15
        Scenario: Validation Schedule Bill Payment InValid Transaction dates
          Given I am on login page of online banking backoffice application as UBPProductAuto1 user
          When I click on the Scheduled Activities Link
          And I click on the Failed scheduled Bills Payment search Link
          And I select transaction type as "Failed" and click search button
          Then I verify Source account as no records found "No Data"
          Then I successfully logout by clicking the Logout Button

          #Register cases starts here
  @B74
  Scenario: Validation of register,Endorse and user access the user Bills Pay Onboarding role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Bills pay onboarding  role details
    Then I Login with user "sacrole01" and approve the user Bills pay onboarding  role
    Then I Login with user "sacrole02" and second approve the user Bills pay onboarding  role
    And I Login with new "Bills pay onboarding" user and logout


      #180
    @B16
      Scenario: Validation of Register Endorse and user access the user SAC role
      Given I'm click the register button in the backoffice application
      When I enter the firstname lastname and user creation SAC details
      Then I Login with user "sacrole01" and approve the user SAC
      Then I Login with user "sacrole02" and second approve the user SAC
      And I Login with new "SAC" user and logout

    #181
    @B17
    Scenario: Validation of Register Endorse and user access the user CEG Team Lead role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation CEG Team Lead details
    Then I Login with user "sacrole01" and approve the user CEG Team Lead
    Then I Login with user "sacrole02" and second approve the user CEG Team Lead
    And I Login with new "CEG Team Lead" user and logout

     #182
  @B18
  Scenario: Validation of Register Endorse and user access the user CEG Agent role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation CEG Agent role details
    Then I Login with user "sacrole01" and approve the user CEG Agent role
    Then I Login with user "sacrole02" and second approve the user CEG Agent role
    And I Login with new "CEG Agent role" user and logout

      #183
  @B19
  Scenario: Validation of Register Endorse and user access the user AFU role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation AFU role details
    Then I Login with user "sacrole01" and approve the user AFU role
    Then I Login with user "sacrole02" and second approve the user AFU role
    And I Login with new "AFU role" user and logout

  #184
  @B20
  Scenario: Validation of Register Endorse and user access the user Bills Pay Innovation role role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Bills Pay Innovation role details
    Then I Login with user "sacrole01" and approve the user Bills Pay Innovation role
    Then I Login with user "sacrole02" and second approve the user Bills Pay Innovation role
    And I Login with new "Bills Pay Innovation role" user and logout

     #185
  @B21
  Scenario: Validation of Register Endorse and user access the user Help Desk role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Help Desk role details
    Then I Login with user "sacrole01" and approve the user Help Desk role
    Then I Login with user "sacrole02" and second approve the user Help Desk role
    And I Login with new "Help Desk role" user and logout

         #186
  @B22
  Scenario: Validation of Register Endorse and user access the user App Support role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation App Support  role details
    Then I Login with user "sacrole01" and approve the user App Support  role
    Then I Login with user "sacrole02" and second approve the user App Support  role
    And I Login with new "App Support  role" user and logout

             #187
  @B23
  Scenario: Validation of Register Endorse and user access the user Union Bank Online Product role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Union Bank Online Product  role details
    Then I Login with user "sacrole01" and approve the user Union Bank Online Product  role
    Then I Login with user "sacrole02" and second approve the user Union Bank Online Product  role
    And I Login with new "Union Bank Online Product role" user and logout

                #188
  @B24
  Scenario: Validation of Register Endorse and user access the user QR Maker role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation QR Maker  role details
    Then I Login with user "sacrole01" and approve the user QR Maker role
    Then I Login with user "sacrole02" and second approve the user QR Maker  role
    And I Login with new "QR Maker role" user and logout
    #Register cases ends here
  #Disapproe cases starts here
  @B25
  Scenario: Validation of Disapproving Endorsement SAC user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation SAC details
    Then I Login with user "sacrole01" and Disapprove the user SAC

  @B26
  Scenario: Validation of Disapproving Endorsement CEG Team Lead user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation CEG Team Lead details
    Then I Login with user "sacrole01" and Disapprove the user CEG Team Lead

  @B27
  Scenario: Validation of Disapproving Endorsement CEG Agent role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation CEG Agent role details
    Then I Login with user "sacrole01" and Disapprove the user CEG Agent role

  @B28
  Scenario: Validation of Disapproving Endorsement AFU role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation AFU role details
    Then I Login with user "sacrole01" and Disapprove the user AFU role

  @B29
  Scenario: Validation of Disapproving Endorsement QR Maker role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation QR Maker  role details
    Then I Login with user "sacrole01" and Disapprove the user QR Maker role

  @B30
  Scenario: Validation of Disapproving Endorsement Bills Pay Innovation role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Bills Pay Innovation role details
    Then I Login with user "sacrole01" and Disapprove the user Bills Pay Innovation role

  @B31
  Scenario: Validation of Disapproving Endorsement Help Desk role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Help Desk role details
    Then I Login with user "sacrole01" and Disapprove the user Help Desk role

  @B32

  Scenario: Validation of Disapproving Endorsement App Support role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation App Support  role details
    Then I Login with user "sacrole01" and Disapprove the user App Support  role

  @B33
  Scenario: Validation of Disapproving Endorsement Union Bank Online Product role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Union Bank Online Product  role details
    Then I Login with user "sacrole01" and Disapprove the user Union Bank Online Product  role

  @B34
  Scenario: Validation of Disapproving Endorsement Bills pay onboarding role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Bills pay onboarding  role details
    Then I Login with user "sacrole01" and Disapprove the user Bills pay onboardingProduct  role

  @B35
  Scenario: Validation of Disapproving Endorsement Request Approval SAC user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation SAC details
    Then I Login with user "sacrole01" and approve the user SAC
    Then I Login with user "sacrole02" and Disapprove the user SAC

  @B36
  Scenario: Validation of Disapproving Endorsement Request Approval CEG Team Lead user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation CEG Team Lead details
    Then I Login with user "sacrole01" and approve the user CEG Team Lead
    Then I Login with user "sacrole02" and Disapprove the user CEG Team Lead

  @B37
  Scenario: Validation of Disapproving Endorsement Request Approval CEG Agent role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation CEG Agent role details
    Then I Login with user "sacrole01" and approve the user CEG Agent role
    Then I Login with user "sacrole02" and Disapprove the user CEG Agent role

  @B38
  Scenario: Validation of Disapproving Endorsement Request Approval AFU role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation AFU role details
    Then I Login with user "sacrole01" and approve the user AFU role
    Then I Login with user "sacrole02" and Disapprove the user AFU role

  @B39
  Scenario: Validation of Disapproving Endorsement Request Approval QR Maker role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation QR Maker  role details
    Then I Login with user "sacrole01" and approve the user QR Maker role
    Then I Login with user "sacrole02" and Disapprove the user QR Maker role

  @B40
  Scenario: Validation of Disapproving Endorsement Request Approval Bills Pay Innovation role user request
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Bills Pay Innovation role details
    Then I Login with user "sacrole01" and approve the user Bills Pay Innovation role
    Then I Login with user "sacrole02" and Disapprove the user Bills Pay Innovation role

  @B41
  Scenario: Validation of Disapproving Endorsement Request Approval Help Desk role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Help Desk role details
    Then I Login with user "sacrole01" and approve the user Help Desk role
    Then I Login with user "sacrole02" and Disapprove the user Help Desk role

  @B42
  Scenario: Validation of Disapproving Endorsement Request Approval App Support role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation App Support  role details
    Then I Login with user "sacrole01" and approve the user App Support  role
    Then I Login with user "sacrole02" and Disapprove the user App Support  role

  @B43
  Scenario: Validation of Disapproving Endorsement Request Approval Union Bank Online Product role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Union Bank Online Product  role details
    Then I Login with user "sacrole01" and approve the user Union Bank Online Product  role
    Then I Login with user "sacrole02" and Disapprove the user Union Bank Online Product  role

  @B44
  Scenario: Validation of Disapproving Endorsement Request Approval Bills pay onboarding role
    Given I'm click the register button in the backoffice application
    When I enter the firstname lastname and user creation Bills pay onboarding  role details
    Then I Login with user "sacrole01" and approve the user Bills pay onboarding  role
    Then I Login with user "sacrole02" and Disapprove the user Bills pay onboardingProduct  role
    #Disapprove cases ends here

  #253
  @B45
  Scenario: Validation Schedule Bill Payment Invalid UserId,Account Number,Biller name and Reference Number
    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
    When I click on the Failed scheduled Bills Payment search Link
    And I select source type as "User ID",Enter text as "sdsdsds" and click Search button
    Then I verify Source account as no records found "No Data"
    And I select source type as "Source Account",Enter text as "00154545512" and click Search button
    Then I verify Source account as no records found "No Data"
    And I select source type as "Biller",Enter text as "ABRAfsfsf" and click Search button
    Then I verify Source account as no records found "No Data"
    Then I successfully logout by clicking the Logout Button

    #252
#  @B46
#  Scenario: Validation Schedule Bill Payment valid UserId,Account Number,Biller name and Reference Number
#    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
#    When I click on the Failed scheduled Bills Payment search Link
#    And I select source type as "User ID",Enter text as "accnumtestubp" and click Search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select source type as "Biller",Enter text as "VECO" and click Search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    Then I successfully logout by clicking the Logout Button
#
#    #254
#  @B47
#  Scenario: Validation Schedule Bill Payment various frequency
#    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
#    When I click on the Failed scheduled Bills Payment search Link
#    And I select source type as "Frequency"
#    And I select transaction type as "Never" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Daily" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Weekly" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Every 2 weeks" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Monthly" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Quarterly" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Semi-annually" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Annually" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    Then I successfully logout by clicking the Logout Button
#
#    #257
#  @B48
#  Scenario:Validation Schedule Bill Payment valid UserId,Account Number,Reference id and Bank Name
#    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
#    When I click on the Scheduled Activities Link
#    And I click on the Failed scheduled Fund Transfer search Link
#    And I select source type as "User ID",Enter text as "accnumtestubp" and click Search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select source type as "Source Account",Enter text as "102310011756" and click Search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select source type as "Target Bank",Enter text as "UnionBank of the Philippines" and click Search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    Then I successfully logout by clicking the Logout Button
#
#    #259
#  @B49
#  Scenario: Validation Schedule Fund Transfer various frequency
#    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
#    When I click on the Scheduled Activities Link
#    And I click on the Failed scheduled Fund Transfer search Link
#    And I select source type as "Frequency"
#    And I select transaction type as "Never" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Daily" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Weekly" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Every 2 weeks" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Monthly" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Quarterly" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Semi-annually" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    And I select transaction type as "Annually" and click search button
#    Then I verify DailyID,AccountNumbers,Transaction,Message,Status,Action
#    Then I successfully logout by clicking the Logout Button

    #251
   @B50
    Scenario: Validation of Push Notification
      Given I am on login page of online banking backoffice application as UBPProductAuto1 user
      When I click on Send Notification
      And I click on Manage Notification
      Then I add a new notification and submit
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as UBPProductAuto2 user
      When I click on Send Notification
      Then I approve the notification with the reason "Please Approve"
      Then I successfully logout by clicking the Logout Button

  #250
  @B51
  Scenario: Validation of QR CODE generation
    Given I am on login page of online banking backoffice application as UBPQRMakerAuto user
    When I click on manage biller
    Then I search for the biller "7334"
    And I enter payors name "PINOYID", pin "1357564" and generate QR code
    And I cancel the QR maker
    #Then I successfully logout by clicking the Logout Button

#FAQ starts here
    #237
  @B52
  Scenario: Validation Of Add New FAQ
    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
    When I click the link for FAQ
    And I click the manage FAQ
    And I add FAQ type as "About UnionBank Online" and submit
    Then I successfully logout by clicking the Logout Button
    Given I am on login page of online banking backoffice application as UBPProductAuto2 user
    When I click the link for FAQ
    Then I approve the FAQ
    When I click the link for FAQ
    And I click the manage FAQ
    #And I edit the FAQ
    Then I successfully logout by clicking the Logout Button

    #TS242
  @B53
      Scenario: Validation of  DisApproving Fund Transfer FAQ
      Given I am on login page of online banking backoffice application as UBPProductAuto1 user
      When I click the link for FAQ
      And I click the manage FAQ
      And I add FAQ type as "Fund Transfer" and submit
      Then I successfully logout by clicking the Logout Button
      Given I am on login page of online banking backoffice application as UBPProductAuto2 user
      When I click the link for FAQ
      Then I disapprove the FAQ
      Then I successfully logout by clicking the Logout Button

      #TS243
   @B54
    Scenario: Validation of DisApproving union Bank FAQ
    Given I am on login page of online banking backoffice application as UBPProductAuto1 user
    When I click the link for FAQ
    And I click the manage FAQ
    And I add FAQ type as "About UnionBank Online" and submit
    Then I successfully logout by clicking the Logout Button
    Given I am on login page of online banking backoffice application as UBPProductAuto2 user
    When I click the link for FAQ
    Then I disapprove the FAQ
    Then I successfully logout by clicking the Logout Button

     #TS244
   @B55
     Scenario: Validation of Dis Approving Bill Payment FAQ
       Given I am on login page of online banking backoffice application as UBPProductAuto1 user
       When I click the link for FAQ
       And I click the manage FAQ
       And I add FAQ type as "Bills Payment" and submit
       Then I successfully logout by clicking the Logout Button
       Given I am on login page of online banking backoffice application as UBPProductAuto2 user
       When I click the link for FAQ
       Then I disapprove the FAQ
       Then I successfully logout by clicking the Logout Button

     #TS245
   @B56
     Scenario: Validation of Dis Approving Buy Load FAQ
       Given I am on login page of online banking backoffice application as UBPProductAuto1 user
       When I click the link for FAQ
       And I click the manage FAQ
       And I add FAQ type as "Load Purchase" and submit
       Then I successfully logout by clicking the Logout Button
       Given I am on login page of online banking backoffice application as UBPProductAuto2 user
       When I click the link for FAQ
       Then I disapprove the FAQ
       Then I successfully logout by clicking the Logout Button

       #TS246
    @B57
     Scenario: Validation of Deletion of FAQ
       Given I am on login page of online banking backoffice application as UBPProductAuto1 user
       When I click the link for FAQ
       And I click the manage FAQ
       And I add FAQ type as "Load Purchase" and submit
       Then I successfully logout by clicking the Logout Button
       Given I am on login page of online banking backoffice application as UBPProductAuto2 user
       When I click the link for FAQ
       Then I approve the FAQ
       When I click the link for FAQ
       And I click the manage FAQ
       Then I delete the FAQ
       Then I successfully logout by clicking the Logout Button

      #TS238
   @B58
      Scenario: Validation of  Updating of Union Bank FAQ
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        And I click the manage FAQ
        And I add FAQ type as "About UnionBank Online" and submit
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto2 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I edit the FAQ
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I verify the edited FAQ
        Then I successfully logout by clicking the Logout Button

      #TS239
   @B59
      Scenario: Validation of Updating of  Fund Transfer FAQ
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        And I click the manage FAQ
        And I add FAQ type as "Fund Transfer" and submit
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto2 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I edit the FAQ
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I verify the edited FAQ
        Then I successfully logout by clicking the Logout Button

      #TS240
   @B60
      Scenario: Validation of Updating of  Bill Payment FAQ
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        And I click the manage FAQ
        And I add FAQ type as "Bills Payment" and submit
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto2 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I edit the FAQ
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I verify the edited FAQ
        Then I successfully logout by clicking the Logout Button

      #TS241
  @B61
      Scenario: Validation of Updating of  Buy Load FAQ
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        And I click the manage FAQ
        And I add FAQ type as "Load Purchase" and submit
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto2 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I edit the FAQ
        Then I successfully logout by clicking the Logout Button
        Given I am on login page of online banking backoffice application as UBPProductAuto1 user
        When I click the link for FAQ
        Then I approve the FAQ
        When I click the link for FAQ
        And I click the manage FAQ
        And I verify the edited FAQ
        Then I successfully logout by clicking the Logout Button

#FAQ ends here
#Edit profile starts here
  @B62
  Scenario: Validation of updating in Edit profile screen and Approval
    Given Login with user "sacrole01"
    When I search the client user id "REVATHY"
    Then I Click the user and Edit profile change the mobilnumber and mailid
    And I approve the profile change user "sacrole02"
    And I verify the user profile changed for user "sacrole01" "REVATHY"

  @B63
  Scenario: Validation of updating in Edit profile screen and DisApproval
    Given Login with user "sacrole01"
    When I search the client user id "REVATHY"
    Then I Click the user and Edit profile change the mobilnumber and mailid
    And I Disapprove the profile change user "sacrole02"
#Edit profile ends here

#Biller starts here
  @B64
  Scenario: Validation of searching Biller by using Biller Name,code,biiler id and account number
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Enter the biller code "TA001" in biller search and click the search icon
    And Verify the Biller details "1001" "TA001" "TEST AUTOMATION BILLER ONE" "000000090001"
    Then I Enter the biller name "TEST AUTOMATION BILLER ONE" in biller search and click the search icon
    And Verify the Biller details "1001" "TA001" "TEST AUTOMATION BILLER ONE" "000000090001"
    Then I Enter the biller account number "000000090001" in biller search and click the search icon
    And Verify the Biller details "1001" "TA001" "TEST AUTOMATION BILLER ONE" "000000090001"

  @B65
  Scenario: Validation of add new biller and approve biller
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Click the New Biller and enther billerdetails an send for approval
    Then Login with user "BillsApprover"
    And Approve the the biller approval
    And I Verify the New biller and details user "OnboardAutomation"

  @B66
  Scenario: Validation of disapproving own new biller request by billeronpay user
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Click the New Biller and enther billerdetails an send for approval
    Then Login with user "BillsApprover"
    And DisApprove the the biller approval

  @B67
    Scenario: Validation of Deleting New Billers and Billers delete Approval
      Given Login with user "OnboardAutomation"
      When I Click the Managebiller link
      Then I Click the New Biller and enther billerdetails an send for approval
      Then Login with user "BillsApprover"
      And Approve the the biller approval
      And I Verify the New biller and details user "OnboardAutomation"
      And I Delete the new biller

  @B68
    Scenario: Validation of Updating Existing Billers
      Given Login with user "OnboardAutomation"
      When I Click the Managebiller link
      Then I Click the New Biller and enther billerdetails an send for approval
      Then Login with user "BillsApprover"
      And Approve the the biller approval
      And I Verify the New biller and details user "OnboardAutomation"
      And I Edit the biller and update details
      Then Login with user "BillsApprover"
      And Approve the the biller approval
      And I Verify the updated biller and details user "OnboardAutomation"

  @B69
  Scenario: Validation cancel of updating biller where request is raised by same biller
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Click the New Biller and enther billerdetails an send for approval
    Then Login with user "OnboardAutomation"
    And Cancel the the biller approval

  @B70
  Scenario: Validation of Updating Favorite Billers
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Enter the biller code "ABENSON" in biller search and click the search icon
    And I Edit the biller and update details
    Then Login with user "BillsApprover"
    And Approve the the biller approval
    And I Verify the updated biller and details user "OnboardAutomation"

  @B71
  Scenario: Validation of Updating scheduled Billers
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Enter the biller code "AUTOSWEEP RFID" in biller search and click the search icon
    And I Edit the biller and update details
    Then Login with user "BillsApprover"
    And Approve the the biller approval
    And I Verify the updated biller and details user "OnboardAutomation"

  @B72
  Scenario: Validation of DisApproval for updated biller field for scheduled biller
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Enter the biller code "AUTOSWEEP RFID" in biller search and click the search icon
    And I Edit the biller and update details
    Then Login with user "BillsApprover"
    And DisApprove the the biller approval

  @B73
  Scenario: Validation of DisApproval for updated biller field for Favorite biller
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Enter the biller code "1PINOY" in biller search and click the search icon
    And I Edit the biller and update details
    Then Login with user "BillsApprover"
    And DisApprove the the biller approval

  @B75
  Scenario: Validation of Biller Logs in Biller
    Given Login with user "OnboardAutomation"
    When I Click the Managebiller link
    Then I Enter the biller code "TA001" in biller search and click the search icon
    And I click the view button
    And Verify the view Biller details "New Biller" "TA001" "000000090001" "1001"

#Biller ends here




