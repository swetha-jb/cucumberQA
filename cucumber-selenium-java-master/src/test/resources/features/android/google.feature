Feature: Mobile Browser Testing

  Scenario: Open Google on mobile browser
    Given I launch "https://www.google.com" on "mobile_android"
    Then I should see "Google" in the title
