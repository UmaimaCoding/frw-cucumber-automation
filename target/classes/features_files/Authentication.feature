Feature: Je souhaite tester la page de connexion de l application swaglabs

  @login_valid
  Scenario: Je souhaite me connecter a l applicaion avec un cas valide
    Given je me connecte sur l application Swaglabs 
    Then je me redirige vers la page product "Products"

  @login_invalid
  Scenario: Je souhaite me connecter a l applicaion avec un cas non valide
    Given je me connecte sur l application Swaglabs incorrect coordonnees username "user" et password "sauce"
    Then un message derror saffiche "Epic sadface: Username and password do not match any user in this service"
