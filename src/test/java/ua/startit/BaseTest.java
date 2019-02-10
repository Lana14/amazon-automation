package ua.startit;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ua.startit.support.Properties;


public class BaseTest {

    private Properties properties = Properties.getInstance();

    private  static final Logger LOG = LoggerFactory.getLogger("BaseTest");

    @BeforeSuite(alwaysRun = true)
    public void setEnv() {
        Configuration.browser = properties.getBrowser();
        Configuration.timeout = 10000;
        Configuration.baseUrl = properties.getEnv();
        Configuration.headless = Boolean.parseBoolean(properties.getHeadless());

        LOG.info("Browser: " + properties.getBrowser());
        LOG.info("Env: " + properties.getEnv());
        LOG.info("Headless is " + Configuration.headless);
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        Selenide.open("/");
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        Selenide.close();
    }
}
