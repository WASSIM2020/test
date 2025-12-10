package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_SignUp {
	
	public static WebDriver driver;
	
	/*******************************constructeur*******************************************/
	public Page_SignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*******************************identification element********************************/
	
	 @FindBy(how =How.NAME , using="email")
     List<WebElement> txt_mail;
  
     @FindBy(how =How.NAME , using="password")
     WebElement txt_mot_pass;
     
     @FindBy(how=How.XPATH , using="//button[@data-qa='login-button']")
     WebElement bt_login;
	/*******************************creation methode*************************************/
     public void ecrire_dans_champ_mail(String text) {
     	txt_mail.get(0).sendKeys(text);
     }
     public void ecrire_dans_champ_mdp (String text) {
     txt_mot_pass.sendKeys(text);
     
     }
     public void cliquer_sur_login_pour_se_connecter( ) {
    	 bt_login.click();
     }
}  
    
     


