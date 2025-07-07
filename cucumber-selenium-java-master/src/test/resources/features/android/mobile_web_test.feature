Feature: Mobile Web Testing on Chrome

  Scenario: Perform a Google search on a mobile browser
    Given I launch "https://www.google.com" on "mobile_android"
    And I enter "Appium Mobile Testing" in the search box
    And I press the search button
    Then I should see search results containing "Appium"

  Scenario: Verify page title of Wikipedia homepage
    Given I launch the mobile browser
    When I navigate to "https://www.wikipedia.org"
    Then the page title should be "Wikipedia"

  Scenario: Fill and submit a demo form
    Given I launch the mobile browser
    When I navigate to "https://www.w3schools.com/html/html_forms.asp"
    And I enter "John Doe" in the "fname" field
    And I enter "john.doe@example.com" in the "email" field
    And I press the submit button
    Then I should see a confirmation message

  Scenario: Scroll to a specific section on a webpage
    Given I launch the mobile browser
    When I navigate to "https://www.selenium.dev/documentation/webdriver/"
    And I scroll down to "WebDriver"
    Then I should see the section header "WebDriver"

  Scenario: Validate login error message on a dummy site
    Given I launch the mobile browser
    When I navigate to "https://www.saucedemo.com/"
    And I enter "invalid_user" in the "user-name" field
    And I enter "wrong_password" in the "password" field
    And I press the login button
    Then I should see an error message "Epic sadface: Username and password do not match any user in this service"
