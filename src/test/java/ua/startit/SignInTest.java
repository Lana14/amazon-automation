package ua.startit;

import org.testng.annotations.Test;
import ua.startit.pageobjects.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class SignInTest extends BaseTest {

    // 1. open HomePage
    // 2. Click on Sign in button
    // 3. Fill up login and password input fields
    // 4. Click on Sign in button
    // 5. Observe page (Assert)

    @Test
    public void signTest() {
        open("/");
        new HomePage()
                .clickOnSignIn()
                .setUsername("")
                .setPassword("");
    }

}
