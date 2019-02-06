package pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private By inputFieldLocator = By.id("twotabsearchtextbox");
    private By signIn = By.cssSelector("#nav-link-accountList");
   // private By navLinkLocator = By.id("nav-link-accountList");
   // private final By LINK_SIGN_IN = By.linkText("Sign in");

    //search()
    // openSignIn()

    public void search(String text) {
        $(inputFieldLocator)
                .setValue(text)
                .submit();
    }

//    public void hoverLocator() {
//        WebElement navLink = driver.findElement(navLinkLocator);
//        Actions action = new Actions(driver);
//        action
//                .moveToElement(navLink)
//                .build()
//                .perform();
//    }
//
//    public boolean isDisplayed() {
//        BasePage.waitToBeVisible(LINK_SIGN_IN);
//        try {
//            driver.findElement(LINK_SIGN_IN);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }

    public SignInPage clickOnSignIn() {
        $(signIn).click();
        return new SignInPage();
    }
}
