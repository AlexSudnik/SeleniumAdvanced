package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.assertEquals;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/dynamic_controls");
    }

    public void clickOnRemoveButton() {
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
    }

    public void waitAfterRemoveButtonClicked() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkbox-example']//p"))).isDisplayed();
    }

    public void textItsGoneIsDisplayed() {
        String itsGoneText = driver.findElement(By.xpath("//form[@id='checkbox-example']//p")).getText();
        assertEquals(itsGoneText, "It's gone!", "текст Its gone не отображается");
    }

    public boolean inputIsEnabled() {
        boolean isInputEnabled = driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
        return isInputEnabled;
    }

    public void clickOnEnableButton() {
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
    }

    public void waitAfterDisableButtonClicked() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='input-example']//p"))).isDisplayed();
    }
}
