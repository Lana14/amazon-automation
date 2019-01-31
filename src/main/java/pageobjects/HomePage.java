package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private By inputFieldLocator = By.id("twotabsearchtextbox");
    private By navLinkLocator = By.id("nav-link-accountList");
    private final By LINK_SIGN_IN = By.linkText("Sign in");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //search()
    // openSignIn()

    public void search(String text) {
        WebElement inputField = driver.findElement(inputFieldLocator);
        inputField.sendKeys(text);
        inputField.submit();
    }

    public void hoverLocator() {
        WebElement navLink = driver.findElement(navLinkLocator);
        Actions action = new Actions(driver);
        action
                .moveToElement(navLink)
                .build()
                .perform();
    }

    public boolean isDisplayed() {
        BasePage.waitToBeVisible(LINK_SIGN_IN);
        try {
            driver.findElement(LINK_SIGN_IN);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
