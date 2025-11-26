package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class DynamicControlsTest extends BaseTest {

    @Test
    void dynamicControls() {
        dynamicControlsPage.open();
        dynamicControlsPage.clickOnRemoveButton();
        dynamicControlsPage.waitAfterRemoveButtonClicked();
        dynamicControlsPage.textItsGoneIsDisplayed();

        assertFalse(dynamicControlsPage.inputIsEnabled(), "инпут активен");

        dynamicControlsPage.clickOnEnableButton();
        dynamicControlsPage.waitAfterDisableButtonClicked();

        assertTrue(dynamicControlsPage.inputIsEnabled(), "инпут неактивен");


    }
}
