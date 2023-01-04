Feature: Verify register user functionality with valid data

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
    And user fills '<userName>' 'UserName' field with 'valid' data
    And user fills '<password>' 'Password' field with 'valid' data
    And user fills '<confirmPassword>' 'ConfirmPassword' field with 'valid' data
    And user click on 'Register' button
    Then 'Welcome' page is displayed
    And 'welcomeMessage' message is displayed
    """
    Welcome. Your account was created successfully. You are now logged in.
    """
    Examples:
      | firstName | lastName | userName   | password     | confirmPassword |
      | Laura     | Smith    | LauraSmith | L&S1234      | L&S1234         |
      | Michelle  | Sanders  | Michelle   | Sanders1209! | Sanders1209!    |
      | Alex      | Robinson | Robinson   | Alex09876$   | Alex09876$      |