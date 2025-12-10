package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_cart {
public static WebDriver driver;
	
	/*******************************constructeur*******************************************/
    public Page_cart(WebDriver driver) {
	Page_Home.driver=driver;
	PageFactory.initElements(driver, this);
  }
/*******************************identification element********************************/
	
    @FindBy(how =How.XPATH , using ="//a[@class='btn btn-default check_out']") 
    WebElement bt_check_out;
    /*******************************creation methode*************************************/
    public boolean statut_de_bouton_check_out ( ) {
    	boolean statut=bt_check_out.isDisplayed();
    	return statut;
  }
}   
