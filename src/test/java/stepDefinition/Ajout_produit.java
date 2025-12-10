package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.SetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Page_Home;
import pageObject.Page_Product;
import pageObject.Page_cart;

public class Ajout_produit {

	public static WebDriver driver=SetUp.driver;
	Page_Home home=new Page_Home(driver);
	Page_Product produit=new Page_Product(driver);
	Page_cart cart=new Page_cart (driver);

	@When("cliquer sur le menu produit")
	public void cliquer_sur_le_menu_produit() {
	    home.cliquer_sur_bouton_produits();
	}

	@When("ajouter le produit blue top")
	public void ajouter_le_produit_blue_top() {
	    produit.ajouter_blue_top_dans_le_panier();
	}

	@Then("verifier affichage de {string}")
	public void verifier_affichage_de(String string) throws InterruptedException {
		Thread.sleep(5000);
	    Assert.assertEquals(string, produit.recuperer_msg_added());
	   
	}

	@When("cliquer sur le bouton continuer shopping")
	public void cliquer_sur_le_bouton_continuer_shopping() {
	    produit.cliquer_sur_continuer_shop();
	}

	@When("selectionner le produit Sleeveless Dress")
	public void selectionner_le_produit_sleeveless_dress() {
	    produit.ajouter_Sleeveless_Dress_dans_le_panier();
	}

	@When("cliquer sur view cart")
	public void cliquer_sur_view_cart() {
	    produit.aller_voir_panier();
	}

	@Then("verifier affichage de la cart")
	public void verifier_affichage_de_la_cart() {
	    Assert.assertEquals(cart.statut_de_bouton_check_out(), true);
	}
}
