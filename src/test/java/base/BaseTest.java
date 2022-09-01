package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;
    protected DeleteAccountPage deleteAccountPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        homepage = new HomePage(driver);
    }

    @AfterClass
    public void quitFrom() {
        driver.quit();
    }


}
