package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BaseTest {

    WebDriver driver;
    DynamicControlsPage dynamicControlsPage;
    ContextMenuPage contextMenuPage;
    FileUploadPage fileUploadPage;
    FramesPage framesPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        //options.addArguments("--headless");
        options.addArguments("--incognito");
        //options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        dynamicControlsPage = new DynamicControlsPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}