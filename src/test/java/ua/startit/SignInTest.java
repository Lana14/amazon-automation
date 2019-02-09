package ua.startit;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.startit.pageobjects.HomePage;

import static ua.startit.SignUpTest.*;

public class SignInTest extends BaseTest {

    // 1. open HomePage
    // 2. Click on Sign in button
    // 3. Fill up login and password input fields
    // 4. Click on Sign in button
    // 5. Observe page (Assert)

    @Test()
    public void signTest() {
        HomePage homePage = new HomePage();
        homePage
                .clickOnSignIn()
                .setUsername(EMAIL_ADDRESS)
                .setPassword(PASSWORD);

        Assert.assertTrue(homePage.isNameDisplayed(FIRST_NAME),
                "Welcome!");

    }
}