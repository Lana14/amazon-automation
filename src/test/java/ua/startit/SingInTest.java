package ua.startit;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class SingInTest {

    private static final String BASE_URL = "https://www.amazon.com";

    // 1. Open HomePage
    // 2. Click the "Sign in" button
    // 3. Fill in login and password input fields
    // 4. Click the "Sign in" button
    // 5. Observe page (Assert)

    @BeforeClass
    public void  setUp(){
        Configuration.startMaximized = true;
        Configuration.browser = BrowserType.CHROME;
        Configuration.baseUrl = BASE_URL;
    }

    @Test
    public void signTest() {
        open("/");
        new HomePage().clickOnSignIn();
    }
}
