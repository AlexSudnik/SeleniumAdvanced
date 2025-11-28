package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage extends BasePage {

    protected By removeCheckboxButton = By.xpath("//button[@onclick='swapCheckbox()']");
    protected By itsGoneTextDisplayed = By.xpath("//form[@id='checkbox-example']//p");
    protected By inputField = By.xpath("//input[@type='text']");
    protected By enableButton = By.xpath("//button[@onclick='swapInput()']");
    protected By itsEnableDisplayed = By.xpath("//form[@id='input-example']//p");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/dynamic_controls");
    }

    public void clickOnRemoveButton() {
        driver.findElement(removeCheckboxButton).click();
    }

    public void waitAfterRemoveButtonClicked() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(itsGoneTextDisplayed)).isDisplayed();
    }

    public String textItsGoneIsDisplayed() {
        return driver.findElement(itsGoneTextDisplayed).getText();
    }

    public boolean inputIsEnabled() {
        return driver.findElement(inputField).isEnabled();
    }

    public void clickOnEnableButton() {
        driver.findElement(enableButton).click();
    }

    public void waitAfterDisableButtonClicked() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(itsEnableDisplayed)).isDisplayed();
    }
}
