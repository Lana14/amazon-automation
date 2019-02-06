package ua.startit;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageobjects.HomePage;
//
//public class SignUpTest extends BaseTest {
//
//    @Test(groups = {"p0", "smoke", "regression"})
//    public void testSignUp() {
//        HomePage homePage = new HomePage(driver);
//        homePage.hoverLocator();
//        homePage.isDisplayed();
//        Assert.assertTrue(homePage.isDisplayed(), "Sign in");
//    }
//
//    @Test(groups = "p0")
//    public void testSignUp2() {
//        HomePage homePage = new HomePage(driver);
//        homePage.hoverLocator();
//        homePage.isDisplayed();
//        Assert.assertTrue(homePage.isDisplayed(), "Sign in");
//    }
//
//    @Test(groups = "smoke")
//    public void testSignUp3() {
//        HomePage homePage = new HomePage(driver);
//        homePage.hoverLocator();
//        homePage.isDisplayed();
//        Assert.assertTrue(homePage.isDisplayed(), "Sign in");
//    }
//}

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import pageobjects.SignUpPage;
import pageobjects.VerifyEmailAddressPage;
import support.mail.Email;
import support.mail.EmailService;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.open;

public class SignUpTest extends BaseTest{

    private static final String BASE_URL = "https://www.amazon.com";

    private static final String USERNAME = "My name";
    private static final String PASSWORD = "MyPassword";
    private static final String EMAIL_ADDRESS = "verify1412+%s@gmail.com";

    private EmailService emailService;

    @BeforeMethod(alwaysRun = true)
    public void markEmailsAsRead() {
        emailService = new EmailService()
                .connectToService("verify1412@gmail.com", "rusalka14$");
        emailService.markAllEmailsAsRead();
    }


    @BeforeClass
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.browser = BrowserType.CHROME;
        Configuration.baseUrl = BASE_URL;
    }

    @Test
    public void signUpTest() {
        new HomePage().clickOnSignIn();
        new SignInPage().clickToSignUp();
    }

    @Test
    public void newAccount() {
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.setName(USERNAME);

        signUpPage.setEmail(String.format(EMAIL_ADDRESS, UUID.randomUUID().toString()));
        signUpPage.setPassword(PASSWORD);
        signUpPage.setPasswordCheck(PASSWORD);
        signUpPage.clickToCreateNewAccount();

        // VerifyEmailAddressPage verifyPage = signUpPage.clickToCreateNewAccount();
        // String code = getCode();
        // HomePage homePageAfterSignUp;


    }

    // private String getCode(String uuid) {
    //     SignUpPage signUpPage = new SignUpPage();
    //     VerifyEmailAddressPage verifyPage = signUpPage.clickToCreateNewAccount();
    //     EmailService connectedService = this.emailService
    //             .connectToService("verify1412@gmail.com", "rusalka14$");
    //     Email email = connectedService.fetch().get(0);
    //     String content = email.getContent().get(0);


}

