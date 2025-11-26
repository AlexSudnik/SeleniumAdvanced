package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage extends BasePage {

    public final String UPLOADED_FILE_NAME = "cat.jpg";

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "/upload");
    }

    public void fileUpload() {
        File file = new File("src/test/resources/cat.jpg");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
    }

    public String getUploadedFileName() {
        String uploadedFileName = driver.findElement(By.id("uploaded-files")).getText();
        return uploadedFileName;
    }
}

