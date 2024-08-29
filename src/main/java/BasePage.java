import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;

    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement clickableElement(String path) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
    }

    public WebElement visibilityOfElement(String path) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
    }

    public void navigate(String link) {
        driver.get(link);
    }
}
