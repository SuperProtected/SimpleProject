import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFooterAndUrl extends TestInit{

    @Test
    public void checkLinkSupport(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate("https://jolybell.com/");

        Assert.assertTrue(homePage.logo().isDisplayed());
        Assert.assertEquals(homePage.baseUrl, driver.getCurrentUrl());
    }
}