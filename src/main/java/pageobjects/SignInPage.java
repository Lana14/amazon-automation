package pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private By name = By.id("ap_mail");
    private By password = By.id("ap_password");
    private By createNewAccount = By.id("createAccountSubmit");


    public SignInPage setUsername (String username) {
        $(name).setValue(username);
        return this;
    }

    public SignInPage setPassword (String userpassword) {
        $(password).setValue(userpassword);
        return this;
    }

    public SignUpPage clickToSignUp() {
        $(createNewAccount).click();
        return new SignUpPage();
    }
}
