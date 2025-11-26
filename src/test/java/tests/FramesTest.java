package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void frameTests() {
        framesPage.open();

        assertEquals(framesPage.getFrameText(), framesPage.FRAME_TEXT);
    }
}
