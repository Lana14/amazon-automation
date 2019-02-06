package pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class VerifyEmailAddressPage {

    private By codeInput = By.cssSelector("input[name=\"code\"]");

    public HomePage setCode(String code) {
        $(codeInput);
        return new HomePage();
    }
}
