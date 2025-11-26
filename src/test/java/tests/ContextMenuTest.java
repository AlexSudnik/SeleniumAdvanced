package tests;

import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    void contextMenuTests() {

        contextMenuPage.open();
        contextMenuPage.contextClick();
        contextMenuPage.alertTextValidate();
        contextMenuPage.contextClose();
    }
}
