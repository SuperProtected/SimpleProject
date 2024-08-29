import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public String baseUrl = "https://jolybell.com/";

    public HomePage (WebDriver driver){
        super(driver);
    }

    public WebElement logo(){
        return visibilityOfElement("//div[@class='logo-joly']");
    }

    public void navigate(String link) {
        driver.get(link);
    }
}
