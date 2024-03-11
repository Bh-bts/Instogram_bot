package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browsers.Browsers;
import com.pages.UploadPostPage;
import com.utils.PropertiesUtils;

/**
 * Test class for testing like functionality to upload a post.
 *
 * @author Bhavin.Thumar
 */
public class UploadPostTest {

    private WebDriver driver;

    /**
     * Sets up the WebDriver instance before tests.
     */
    @BeforeTest
    public void setUp() {
        Browsers browsers = new Browsers();
        driver = browsers.startBrowser(PropertiesUtils.getBrowser(), PropertiesUtils.getURL(), PropertiesUtils.getHeadlessMode());
    }

    /**
     * Test the functionality to upload a picture.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    @Test
    public void uploadPicture() throws InterruptedException {
        UploadPostPage uploadPostPage = PageFactory.initElements(driver, UploadPostPage.class);
        uploadPostPage.uploadPic();
    }
}
