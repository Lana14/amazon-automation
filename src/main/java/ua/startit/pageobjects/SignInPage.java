package ua.startit.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private By email = By.id("ap_email");
    private By password = By.id("ap_password");
    private By submit = By.id("signInSubmit");
    private By signUpButton = By.id("auth-create-account-link");

    public SignInPage setEmail(String userEmail) {
        $(email).setValue(userEmail);
        return this;
    }

    public SignInPage setPassword(String userPassword) {
        $(password).setValue(userPassword);
        return this;
    }

    public HomePage submit() {
        $(submit).click();
        return new HomePage();
    }

    public SignUpPage signUp() {
        $(signUpButton).click();
        return new SignUpPage();
    }
}
