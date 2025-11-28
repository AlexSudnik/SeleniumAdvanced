package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public final String FRAME_TEXT = "Your content goes here.";
    protected By frameLocator = By.id("mce_0_ifr");
    protected By frameTextLocator = By.xpath("//body[@id='tinymce']/p");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/iframe");
    }

    public String getFrameText() {
        driver.switchTo().frame(driver.findElement(frameLocator));
        return driver.findElement(frameTextLocator).getText();
    }
}
