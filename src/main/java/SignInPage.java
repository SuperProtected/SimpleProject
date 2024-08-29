import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{

    public SignInPage (WebDriver driver){
        super(driver);
    }

    public void navigate(String link) {
        driver.get(link);
    }

    public WebElement account(){
        return clickableElement("//div[@class=\"icon header-account-icon icon__animated\"]");
    }

    public WebElement signInInput(){
        return clickableElement("//input[@id=\"signin-email\"]");
    }

    public WebElement passwordInput(){
        return clickableElement("//input[@id=\"signin-password\"]");
    }

    public WebElement enterInAccount(){
        return clickableElement("//button[@sign-in-pending=\"false\"]");
    }

    String email =                                                                                                                                                                                                                    "qaengenering@gmail.com";
    String pass =                                                                                                                                                                                                                       "543FAQDBMKyu";

}
