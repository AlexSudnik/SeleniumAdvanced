package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage extends BasePage {

    public final String UPLOADED_FILE_NAME = "cat.jpg";
    protected By fileUploadButton = By.id("file-upload");
    protected By fileSubmitButton = By.id("file-submit");
    protected By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/upload");
    }

    public void fileUpload() {
        File file = new File("src/test/resources/cat.jpg");
        driver.findElement(fileUploadButton).sendKeys(file.getAbsolutePath());
        driver.findElement(fileSubmitButton).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(uploadedFiles).getText();
    }
}

