package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browsers.Browsers;
import com.pages.FollowersPage;
import com.utils.PropertiesUtils;

/**
 * Test class for testing like functionality on the home page.
 *
 * @author Bhavin.Thumar
 */
public class FollowersPageTest {

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
     * Tests the functionality to increase followers on the main page.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    @Test
    public void increaseFollowers() throws InterruptedException {
        FollowersPage followersPage = PageFactory.initElements(driver, FollowersPage.class);
        followersPage.increaseFollowers();
    }
}
