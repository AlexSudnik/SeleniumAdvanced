package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/context_menu");
    }

    public void contextClick() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("hot-spot")))
                .build()
                .perform();
    }

    public void alertTextValidate() {
        Alert alert = driver.switchTo().alert();
        assertEquals(alert.getText(), "You selected a context menu");
    }

    public void contextClose() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


}

