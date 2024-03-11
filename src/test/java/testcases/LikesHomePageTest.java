package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browsers.Browsers;
import com.pages.LikesHomePage;
import com.utils.PropertiesUtils;

/**
 * Test class for testing like functionality on the home page.
 *
 * @author Bhavin.Thumar
 */
public class LikesHomePageTest {

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
     * Tests the increase likes functionality on the home page.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    @Test
    public void increaseLikesOnHomePage() throws InterruptedException {
        LikesHomePage likesHomePage = PageFactory.initElements(driver, LikesHomePage.class);
        likesHomePage.increaseLikes();
    }
}
