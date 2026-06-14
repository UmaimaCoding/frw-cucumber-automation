Feature: je verfie le module register
en tant que utilisateur je souhaite remplir le formulaire a fin de menregistre au site Mercury

  @tc
  Scenario Outline: Title of your scenario outline
    Given je me connecte sur l application Mercury
    When je saisie une donnee dans le champs username "<username>"
    When je saisie une donnee dans le champs lastname "<lastname>"
    When  je clique sur le bouton submit

    Examples:
      | username | lastname |
      | test1    | test-1   |
      | test2    | test-2   |
