package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Page_Home;
import pageObject.Page_SignUp;

public class Authentification_account {
	
	public static WebDriver driver=SetUp.driver;
	Page_Home home=new Page_Home(driver);
	Page_SignUp sign=new Page_SignUp(driver);
	
	@Given("saisir url  suivant : {string}")
	public void saisir_url_suivant(String string) {
	    home.acceder_a_url(string);
	}

	@When("saisir adresse email suivante : {string}")
	public void saisir_adresse_email_suivante(String string) {
	    sign.ecrire_dans_champ_mail(string);
	}

	@When("saisir le mot de passe suivant : {string}")
	public void saisir_le_mot_de_passe_suivant(String string) {
	   sign.ecrire_dans_champ_mdp(string);
	}

	@When("cliquer sur le bouton se connecter")
	public void cliquer_sur_le_bouton_se_connecter() {
	    sign.cliquer_sur_login_pour_se_connecter();
	}

	@Then("verifier {string} est  le nom de profil affiche")
	public void verifier_est_le_nom_de_profil_affiche(String string) {
	    Assert.assertEquals(string, home.recuperer_le_nom_du_profil());
	}


}
