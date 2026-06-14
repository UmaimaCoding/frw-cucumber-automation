Feature: Je verifie la page de connexion
  En tant que utilisateur je souhaite m authentifier au site mercury 

  @connexion
  Scenario: Je verifie la page de connexion
    Given je me connecte sur l application Mercury
    When je saisie le username "test"
    And je saaise le mot de passe "test"
    And je clique sur le bouton submit
    Then je me redirige vers la page Home "Login Successfully"
