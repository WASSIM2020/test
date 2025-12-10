
@tag
Feature: ajouter produits dans le panier
  apres avoir m identifier,je veux ajouter des produits dans mon panier
  
 Background:
    Given saisir url  suivant : "https://automationexercise.com/login"
    When saisir adresse email suivante : "mohamed.ahmed@gmail.com"
    And saisir le mot de passe suivant : "abcdef123@"
    And cliquer sur le bouton se connecter
    Then verifier "mohamed" est  le nom de profil affiche 

  @Ajoutproduit
  Scenario: ajouter produit
    When cliquer sur le menu produit
    When ajouter le produit blue top
    Then verifier affichage de "Added!"
    When cliquer sur le bouton continuer shopping
    When selectionner le produit Sleeveless Dress
    Then verifier affichage de "Added!"
    When cliquer sur view cart
    Then verifier affichage de la cart

  