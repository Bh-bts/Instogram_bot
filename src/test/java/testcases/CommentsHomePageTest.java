package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browsers.Browsers;
import com.pages.CommentHomePage;
import com.utils.PropertiesUtils;

/**
 * Test class for testing comment functionality on the home page.
 *
 * @author Bhavin.Thumar
 */
public class CommentsHomePageTest {

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
     * Tests the addition of comments on the home page.
     *
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    @Test
    public void addComments() throws InterruptedException {
        CommentHomePage commentHomePage = PageFactory.initElements(driver, CommentHomePage.class);
        commentHomePage.increaseComments();
    }
}
