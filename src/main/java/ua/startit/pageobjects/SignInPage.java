package ua.startit.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    private By name = By.id("ap_email");
    private By password = By.id("ap_password");
    private By signUpButton = By.id("auth-create-account-link");

    public SignInPage setUsername(String username) {
        $(name).setValue(username);
        return this;
    }

    public SignInPage setPassword(String userpassword) {
        $(password).setValue(userpassword);
        return this;
    }

    public SignUpPage signUp() {
        $(signUpButton).click();
        return new SignUpPage();
    }
}
