package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTests() {
        fileUploadPage.open();
        fileUploadPage.fileUpload();

        assertEquals(fileUploadPage.getUploadedFileName(), fileUploadPage.UPLOADED_FILE_NAME);
    }
}
