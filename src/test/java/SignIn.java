import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends TestInit {

    @Test
    public void check() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.navigate("https://jolybell.com/");
        signInPage.account().click();
        signInPage.signInInput().sendKeys(signInPage.email);
        signInPage.passwordInput().sendKeys(signInPage.pass);
        signInPage.enterInAccount().click();

        Assert.assertTrue(signInPage.clickableElement("//h1[text()='Мій акаунт']").isDisplayed());
    }
}
