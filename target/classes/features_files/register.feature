Feature: Verify user registration
  As a new user
  I want to register an account on Mercury Tours
  So that I can access the application
  
  @register
  Scenario: Successful user registration
    Given I open the registration page
    When I enter first name "test"
    And I enter last name "test-test"
    And I enter phone "22222111"
    And I enter email "test@testemail.com"
    And I enter address "Tunis Street"
    And I enter city "Tunis"
    And I enter state "Tunis"
    And I enter postal code "1000"
    And I select country "TUNISIA"
    And I enter username "test@testemail.com"
    And I enter password "test123"
    And I confirm password "test123"
    And I click on submit button
    Then I should see registration success message "Thank you for registering."