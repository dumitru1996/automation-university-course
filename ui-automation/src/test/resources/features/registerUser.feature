Feature: User Registration validation

  Background:
    Given user is on Home Page
    And user click on Login button
    And Login page is displayed
    And the Name field is empty
    And the Email field is empty

  @Run
  Scenario Outline:Add new user in the system
    Given user types '<name>' in Name field
    And user types '<email>' in Email field
    And user clicks on signUp button
    And SignUp page is displayed
    And name and email are already populated in form with valid data
      | name  | <name>  |
      | email | <email> |
    When user completes form with next data
      | gender       | <gender>     |
      | password     | <password>   |
      | day          | 19           |
      | month        | January      |
      | year         | 2002         |
      | firstName    | <name>       |
      | lastName     | <lastName>   |
      | company      | Endava       |
      | address      | Arborilor 21 |
      | country      | Canada       |
      | state        | Alberta      |
      | city         | Alberta      |
      | zipCode      | 12345        |
      | mobileNumber | 0123456789   |
    And user click on Create Account Button
    Then user is on Account Created Page
    And user click on Continue Button on Create Account Page
    And user is on Home Page
    And user click on Delete Account Button
    And Delete Account Page is displayed
    And user click on Continue Button on Delete Account page
    And user is on Home Page

    Examples:
      | name | email           | password     | gender | lastName |
      | John | john@mymail.com | JohnPassword | male   | Doe      |
      | Lucy | lucy@mymail.com | LucyPass     | female | Garcia   |
