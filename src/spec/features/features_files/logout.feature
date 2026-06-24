@testcase
Feature: Je souhaite tester les boutons logout et about de l application swaglabs

  Background:
    Given je me connecte sur l application Swaglabs
    When je click sur le menu burger

  @logout
  Scenario: Je souhaite tester le bouton logout
    And je click sur logout
    Then je me redirige vers la page de connexion "Swag Labs"

  @about
  Scenario: Je souhaite tester le bouton About
    And je click sur About
    Then je me redirige vers la page about
