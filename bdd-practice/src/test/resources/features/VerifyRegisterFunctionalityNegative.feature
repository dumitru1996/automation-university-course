Feature: Verify register user functionality with invalid data

  Background:
    Given user is on 'Main' page
    When user click on 'Register' button
    Then 'Register' page is displayed

  @RunTest
  Scenario Outline: Register new user with valid credentials
    When user populates displayed fields with data
      | firstName   | <firstName>    |
      | lastName    | <lastName>     |
      | address     | Road street 32 |
      | city        | Ontario        |
      | country     | Canada         |
      | zipCode     | 91710          |
      | phoneNumber | +506123456789  |
    And user fills '<userName>' 'UserName' field with 'invalid' data
    And user fills '<password>' 'Password' field with 'invalid' data
    And user fills '<confirmPassword>' 'ConfirmPassword' field with 'invalid' data
    And user click on 'Register' button
    Then 'errorMessage' message is displayed
    """
    Please correct the errors highlighted in red.
    """
    Examples:
      | firstName | lastName | userName | password | confirmPassword |
      | Laura     | Smith    |          | 1        | 1               |
      | Michelle  | Sanders  | #$%^     | $        | $!              |
      | Alex      | Robinson | _        |          |                 |