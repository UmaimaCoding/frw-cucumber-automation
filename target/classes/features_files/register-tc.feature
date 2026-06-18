Feature: Verify user registration
  As a new user
  I want to register an account on Mercury Tours
  So that I can access the application

  @tc
  Scenario Outline: Verify user registration
    Given I open the Mercury registration page
    When I fill first name "<firstName>"
    And I fill last name "<lastName>"
    And I fill phone number "<phone>"
    And I fill email "<email>"
    And I fill address "<address>"
    And I fill city "<city>"
    And I fill state "<state>"
    And I fill postal code "<postalCode>"
    And I select country "<country>"
    And I fill username "<username>"
    And I fill password "<password>"
    And I enter the same password "<password>"
    And I click on send button to submit the registration form
    Then I see the registration success message "<message>"

    Examples:
      | firstName | lastName  | phone    | email              | address      | city  | state | postalCode | country | username           | password | message                    |
      | test      | test-test | 22222111 | test@testemail.com | Tunis Street | Tunis | Tunis | 1000       | TUNISIA | test@testemail.com | test123  | Thank you for registering. |
      | Ali       | test      | 33333111 | ali@test.com       | Main Street  | Tunis | Tunis | 2000       | PERU    | ali@test.com       | test123  | Thank you for registering. |
