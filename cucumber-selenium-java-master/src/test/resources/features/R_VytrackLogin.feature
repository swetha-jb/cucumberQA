
@vytrackLogin @web
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager

  Background:
    Given user is on the login page


  Scenario: Login as driver
   # Given user is on the login page
    When user enters the driver information
    Then user should be able to login

 @salesmanager
  Scenario: Login as sales manager
   # Given user is on the login page
    When user enters the sales manager information
    Then user should be able to login


  Scenario: Login as store manager
   # Given user is on the login page
    When user enters the store manager information
    Then user should be able to login


  @smoke2
  Scenario: Login with given user
   # Given user is on the login page
    When user enters the "store manager" information
    Then user should be able to login











