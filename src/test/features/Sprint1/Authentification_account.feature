
@tag
Feature: authentification page Home
  en tant qu'utilisateur,je veux me connecter

  @authentification
  Scenario: authentification valide
    
    Given saisir url  suivant : "https://automationexercise.com/login"
    When saisir adresse email suivante : "mohamed.ahmed@gmail.com"
    And saisir le mot de passe suivant : "abcdef123@"
    And cliquer sur le bouton se connecter
    Then verifier "mohamed" est  le nom de profil affiche 
    
