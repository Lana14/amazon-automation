package ua.startit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected WebDriver driver;
    protected static final String URL = "https://www.amazon.com";


    @BeforeTest(alwaysRun = true)
    public void setEnv() {

        String path = System.getProperty("user.dir");
        System.out.println("user.dir equals:" + path);

        System.setProperty("webdriver.gecko.driver", path + "/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver
                .manage().
                timeouts()
                .implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {

        // 1. Open amazon page
        open("/");
    }

    @AfterTest(alwaysRun = true)
    public void closeBrowser() {

        // 6. Close driver's session
        driver.close();
    }

    @Test
    public void signTest() {
        open("/");
        new HomePage()
                .clickOnSignIn()
                .setUsername("")
                .setPassword("");
    }
}
