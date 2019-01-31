package ua.startit;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class SignUpTest extends BaseTest {

    @Test(groups = {"p0", "smoke", "regression"})
    public void testSignUp() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverLocator();
        homePage.isDisplayed();
        Assert.assertTrue(homePage.isDisplayed(), "Sign in");
    }

    @Test(groups = "p0")
    public void testSignUp2() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverLocator();
        homePage.isDisplayed();
        Assert.assertTrue(homePage.isDisplayed(), "Sign in");
    }

    @Test(groups = "smoke")
    public void testSignUp3() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverLocator();
        homePage.isDisplayed();
        Assert.assertTrue(homePage.isDisplayed(), "Sign in");
    }
}
