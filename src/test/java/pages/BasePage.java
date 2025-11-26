package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BasePage {

    protected WebDriver driver;
    WebDriverWait wait;
    protected final String BASE_URL = "https://the-internet.herokuapp.com";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
    }
}
