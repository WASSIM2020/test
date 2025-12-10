
  @tag1
  Feature: Enregistrement d’un nouvel user

  Scenario: Enregistrement avec succes d’un nouvel user
    Given L'utilisateur ouvre le Chrome
    And L'utilisateur entre a la page d'accueil
    Then La page d'accueil est affichee avec succes
    When L'utilisateur clique sur bouton "Signup / Login"
    Then Le texte "New User Signup!" est affiche
    When L'utilisateur saisit nom et email
    And L'utilisateur clique sur bouton "Signup"
    Then Le texte "Enter Account Information" est affiche
    When L'utilisateur remplit les informations du formulaire d'inscription
    And L'utilisateur clique sur le bouton "Create Account"
    Then Le message "Account Created!" est affiche
    When L'utilisateur clique sur le bouton "Continue"
    Then Le texte "Logged in as username" est affiche
    And Le navigateur est ferme


  
